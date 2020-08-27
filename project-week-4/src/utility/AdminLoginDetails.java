package utility;

import java.util.Scanner;

import model.Admin;

public class AdminLoginDetails {
	 public static Admin admin = new Admin();
	 Scanner s =  new Scanner(System.in);
	public boolean verifyAdmin(){
	String name = s.next();
	String password = s.next();
	if(name.equals(admin.getUsername()) && password.equals(admin.getPassword())) {
		return true;
	}
	else {
		return false;
	}
	
	}

}
