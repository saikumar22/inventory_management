package service;

import java.io.IOException;
import java.util.Scanner;

public class ProductsOperation {
	ProductFunctionality pf = new ProductFunctionality();
	Scanner s = new Scanner(System.in);
	boolean flag = true;
	
	public void productFunctionality() throws IOException {
		while(flag) {
			System.out.println("ENTER \n 1.TO ADD PRODUCT"+"\n"+" 2.DELETE PRODUCT"+"\n"+" 3.DISPLAY PRODUCT"+"\n"+" 4.EXIT");
			System.out.print("\t\t Enter Your Choice :");
			int choice =s.nextInt();
			switch(choice){
			case 1:
				System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ADD PRODUCT DETAILS ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
					pf.addProduct();
					break;
			
			case 2:
				System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ DELETE PRODUCT DETAILS ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ");
					pf.deleteProduct();
					break;
							
			case 3:
				System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ VIEW ALL PRODUCT DETAILS ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
					pf.viewAllProductDetails();
					break;
					
			case 4:flag=false;
				System.out.println("You Successfully exited \n");
				return;
			default:System.out.println("please enter a correct choice");	
			}
	}

}


}
