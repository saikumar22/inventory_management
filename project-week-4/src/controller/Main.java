package controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Employee;
import service.MainAdminFunctionality;

public class Main {
	static  List<Employee>list = new ArrayList<Employee>();
	public static void main(String[] args) throws IOException {
		Scanner sc= new Scanner(System.in);
		System.out.println("****************************************************************************************************");
		System.out.println("\n");
		System.out.println("<<<--*--*--*--*--*--*--  (^_^) WELCOME TO INVENTORY MANAGEMENT SYSTEM  (^_^) --*--*--*--*--*--*-->>>");
		System.out.println("\n");
		System.out.println("****************************************************************************************************");
		
		utility.AdminLoginDetails adminLogin = new utility.AdminLoginDetails();
		MainAdminFunctionality main = new MainAdminFunctionality();
		boolean flag=true;
		System.out.println("\t \t \t \t   Welcome Admin   ");
		System.out.println("<<<---------------------------------------------------------------------------------------------->>>");
		System.out.println("Enter your Admin I'd and Password");
		while(flag)
		if(adminLogin.verifyAdmin()) {
			System.out.println("\t Admin login Successfull");
			System.out.println("<<<-------------------------------------------------------------------------------------------->>>");
			main.mainFunctionality();
			 flag=false;
		}
		else {
			System.out.println("invalid Credentials");
			System.out.println("please provide your credentials properly");
		}
		sc.close();
}
}
