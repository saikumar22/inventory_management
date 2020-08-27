package service;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.Product;
import utility.IdValidation;
import utility.NameValidation;

public class ProductFunctionality {
	Scanner scanner=new Scanner(System.in);
	static	List<Product> list =new ArrayList<Product>();	
	
	//Add New Product details
	public void addProduct() throws IOException {
		System.out.println("please enter Products Details");
		System.out.println("Enter your Product ID-\n");
		IdValidation iv = new IdValidation();
		String Id = iv.Id();
		ArrayList<Product> list =new ArrayList<Product>();		
		System.out.println("Enter your  Product Name-\n");
		NameValidation nv = new NameValidation();
		String name = nv.name();
		
		System.out.println("Enter your Product Brand-\n");
		String brand=scanner.next();
		
		System.out.println("Enter your price-\n");
		String price=scanner.next(); 
		
		Product p=new Product(Id,name,brand,price);
		list.add(p);
		File myFile = new File("D:\\product.xlsx");  //creating a new file instance 
		
		FileInputStream fis = new FileInputStream(myFile); //obtaining bytes from the file  
		
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook myWorkBook= new XSSFWorkbook(fis);
		XSSFSheet sheet=myWorkBook.getSheetAt(0);
		int rownum= sheet.getLastRowNum();
		for(Product user1 : list ) {
			Row row = sheet.createRow(++rownum);
			createList(user1 , row);
		}
		FileOutputStream fos=new FileOutputStream(myFile);
		myWorkBook.write(fos);
		}
		private void createList(Product user1, Row row) {
			Cell cell = row.createCell(0);
			cell.setCellValue(user1.getId());
			
			cell = row.createCell(1);
			cell.setCellValue(user1.getname());
			
			cell = row.createCell(2);
			cell.setCellValue(user1.getbrand());
			
			cell = row.createCell(3);
			cell.setCellValue(user1.getprice());
	}

// Delete Product Details
		@SuppressWarnings("resource")
		public void deleteProduct()throws IOException{
			System.out.println("Please Enter the Id of Products You want to delete");
			Scanner sc = new Scanner(System.in);
			String Id = sc.nextLine();
			FileOutputStream out;
			try
		      {
		          FileInputStream file = new FileInputStream(new File("D:\\product.xlsx"));
		          XSSFWorkbook workbook = new XSSFWorkbook(file);
		          XSSFSheet sheet = workbook.getSheetAt(0);
		          for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
		        	  Row row = sheet.getRow(rowIndex);
		        	  if (row != null) {
		        	    Cell cell = row.getCell(0);
		        	    String value=cell.getStringCellValue();
		        	    if (value.equals(Id)) {
		        	    	sheet.removeRow(sheet.getRow(rowIndex));
		        	    	//sheet.shiftRows(rowIndex+1,sheet.getLastRowNum(), -1);
		        	    	 System.out.println("Deleted Successfully!");
		        	    }
		        	  }
		        	}
		            out = new FileOutputStream(new File("D:\\product.xlsx"));
			        workbook.write(out);
			        out.close();
		     
		       }catch (Exception e) {
		        	System.out.println(e.getMessage());
		      }
		}


//display product details
	public void viewAllProductDetails()throws IOException {	
		File myFile = new File("D:\\product.xlsx");
		FileInputStream fis = new FileInputStream(myFile);
		XSSFWorkbook myWorkBook= new XSSFWorkbook(fis);
		XSSFSheet sheet=myWorkBook.getSheetAt(0);
		Iterator<Row> rowIterator = sheet.iterator();
		while (rowIterator.hasNext())
		{
			Row row = rowIterator.next();
			Cell cell1 = row.getCell(0);
			Cell cell2 = row.getCell(1);
			Cell cell3 = row.getCell(2);
			Cell cell4 = row.getCell(3);
			System.out.print(" "+ cell1.getStringCellValue()+ "\t\t");
			System.out.print("\t"+ cell2.getStringCellValue()+"\t");
			System.out.print("\t "+ cell3.getStringCellValue()+ "\t");
			System.out.print("\t"+ cell4.getStringCellValue()+"\t");
			System.out.println("\n");
		}
		System.out.println("\n");
	}
}

