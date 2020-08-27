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

import model.Employee;
import utility.EmailValidation;
import utility.IdValidation;
import utility.MobileValidation;
import utility.NameValidation;

public class EmployeeFunction {
	Scanner scanner=new Scanner(System.in);
	static	List<Employee> list =new ArrayList<Employee>();		
	
	public void addEmployee() throws IOException {    // New Employee detalis
		System.out.println("Please Enter Employee details:\n");
		System.out.println("Enter your Employee ID-");
		IdValidation iv = new IdValidation();
		String Id = iv.Id();
		
		System.out.println("Enter your Employee Name-");
		NameValidation nv = new NameValidation();
		String name = nv.name();
		
		System.out.println("Enter your Employee Age-");
		String Age=scanner.next();
		
		EmailValidation ev = new EmailValidation();
		String emailid = ev.emailid();
		
		MobileValidation mv = new MobileValidation();
		String mobile = mv.mobile();
		
		System.out.println("Enter your Employee education-");
		String education=scanner.next();
		
		
		System.out.println("Enter your Employee salary-");
		String salary=scanner.next();
		
		Employee emp=new Employee(Id, name, Age,emailid,mobile,education,salary);
		list.add(emp);
		File myFile = new File("D:\\product.xlsx");  //creating a new file instance 
		
		FileInputStream fis = new FileInputStream(myFile); //obtaining bytes from the file  
		
		//creating Workbook instance that refers to .xlsx file  
		XSSFWorkbook myWorkBook= new XSSFWorkbook(fis);
		XSSFSheet sheet=myWorkBook.getSheetAt(1);
		int rownum= sheet.getLastRowNum();
		for(Employee user1 : list ) {
			Row row = sheet.createRow(++rownum);
			createList(user1 , row);
		}
		FileOutputStream fos=new FileOutputStream(myFile);
		myWorkBook.write(fos);
		}
	
		private void createList(Employee user1, Row row) {
			Cell cell = row.createCell(0);
			cell.setCellValue(user1.getId());
			
			cell = row.createCell(1);
			cell.setCellValue(user1.getName());
			
			cell = row.createCell(2);
			cell.setCellValue(user1.getage());
			
			cell = row.createCell(3);
			cell.setCellValue(user1.getemailId());
			
			cell = row.createCell(4);
			cell.setCellValue(user1.getmobile());
			
			cell = row.createCell(5);
			cell.setCellValue(user1.geteducation());
			
			cell = row.createCell(6);
			cell.setCellValue(user1.getsalary());
	}


		// Delete Product Details
				@SuppressWarnings("resource")
				public void deleteEmployee()throws IOException{
					System.out.println("Please Enter the Id of Employee You want to delete");
					Scanner sc = new Scanner(System.in);
					String Id = sc.nextLine();
					FileOutputStream out;
					try
				      {
				          FileInputStream file = new FileInputStream(new File("D:\\product.xlsx"));
				          XSSFWorkbook workbook = new XSSFWorkbook(file);
				          XSSFSheet sheet = workbook.getSheetAt(1);
				          for (int rowIndex = 1; rowIndex <= sheet.getLastRowNum(); rowIndex++) {
				        	  Row row = sheet.getRow(rowIndex);
				        	  if (row != null) {
				        	    Cell cell = row.getCell(0);
				        	    String value=cell.getStringCellValue();
				        	    if (value.equals(Id)) {
				        	    	sheet.removeRow(sheet.getRow(rowIndex));
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
public void viewAllEmployeeDetails()throws IOException {	
	File myFile = new File("D:\\product.xlsx");
	FileInputStream fis = new FileInputStream(myFile);
	XSSFWorkbook myWorkBook= new XSSFWorkbook(fis);
	XSSFSheet sheet=myWorkBook.getSheetAt(1);
	Iterator<Row> rowIterator = sheet.iterator();
	while (rowIterator.hasNext())
	{
		Row row = rowIterator.next();
		Cell cell1 = row.getCell(0);
		Cell cell2 = row.getCell(1);
		Cell cell3 = row.getCell(2);
		Cell cell4 = row.getCell(3);
		Cell cell5 = row.getCell(4);
		Cell cell6 = row.getCell(5);
		Cell cell7 = row.getCell(6);
		
		System.out.print(" "+ cell1.getStringCellValue()+ "\t\t");
		System.out.print("\t"+ cell2.getStringCellValue()+"\t");
		System.out.print("\t "+ cell3.getStringCellValue()+ "\t");
		System.out.print("\t"+ cell4.getStringCellValue()+"\t");
		System.out.print("\t"+ cell5.getStringCellValue()+"\t");
		System.out.print("\t "+ cell6.getStringCellValue()+ "\t");
		System.out.print("\t"+ cell7.getStringCellValue()+"\t");
		
		System.out.println("\n");
	}
	System.out.println("\n");
}
}