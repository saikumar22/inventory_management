package utility;

import java.util.Scanner;
import java.util.regex.Pattern;

public class EmailValidation {
	public String emailid(){
		System.out.println("Enter your Employee Email id- ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String emailid = sc.nextLine();
		if(isvalidEmail(emailid)) {
			return emailid;
		}
		else {
			System.out.println("\t *Please Enter Valid EmailId");
			return emailid();
		}
	}
	public static boolean isvalidEmail(String emailid) {
		String emailRegex ="^[A-Za-z0-9+_.]+@(.+)$";      //Accepts uppercase,lowercase and(0-9)digits & additionally dot,underscore
		Pattern pattern = Pattern.compile(emailRegex);
		if(emailid == null) 
			return false;
		return pattern.matcher(emailid).matches();
	}
}