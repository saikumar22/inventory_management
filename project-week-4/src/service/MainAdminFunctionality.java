package service;

import java.io.IOException;
import java.util.Scanner;

public class MainAdminFunctionality {
	Scanner sc =new Scanner(System.in);
	boolean flag = true;
	public void mainFunctionality() throws IOException {
		while(flag) {
			System.out.println("\t 1. Employee Operation"+"\n"+"\t 2. Product Operation"+"\n");
			System.out.print("\t\t Enter Your Choice :");
			int choice = sc.nextInt();
			switch (choice) {
			
			case 1:
					System.out.println("- - - - - - - -  - - - - - - - - Welcome to Employees Portal - - - - - - - -  - - - - -  - ");  //Employees Portal
					EmployeeOperation eo = new EmployeeOperation();
					eo.EmployeeFunctionality();
					break;
					
			case 2:
					System.out.println("- - - - - - - - - - - - - - - - - Welcome to Products Portal - - - - - - - -- - - - - - - - -");  //Product Portal
					ProductsOperation po = new ProductsOperation();
					po.productFunctionality();
					break;
			case 3: 
				default:
				break;
		}	
	}
}

}