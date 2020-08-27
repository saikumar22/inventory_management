package service;

import java.io.IOException;
import java.util.Scanner;

public class EmployeeOperation {
	Scanner s = new Scanner(System.in);
	boolean flag = true;
	EmployeeFunction ef = new EmployeeFunction();
	
	 
	public void EmployeeFunctionality() throws IOException {
		// TODO Auto-generated method stub
		while(flag) {
			System.out.println(" 1. New Employee" + "\n" + " 2. Delete Employee" + "\n"+" 3. View All Employee Details"+"\n"+" 4. Exit" );
			System.out.print(" Enter Your Choice :");
			int choice = s.nextInt();
		
		switch(choice) {
		
		case 1: 
				System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ NEW EMPLOYEE DETAILS ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");  //Enter Employee details
			 	ef.addEmployee();
				break;
				
		case 2: System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ DELETE EMPLOYEE DETAILS ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ");
				ef.deleteEmployee();
				break;
		
		case 3: System.out.println("^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ VIEW ALL EMPLOYEE DETAILS ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^ ^");
				ef.viewAllEmployeeDetails();
				break;
				
		case 4:flag=false;
				System.out.println("You Successfully exited");
				break;
				default:System.out.println("please enter a correct choice");
			}
		}	
	}
}
