package utility;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class IdValidation {
	public String Id() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		if(isValidName(name))
			return name;
		else {
			System.out.println("\t *Please enter valid name");
			return Id();
		}
	}
	public static boolean isValidName(String name){
		String regex = "[A-Z1-9]*$";
		Pattern p = Pattern.compile(regex);  // Compile the ReGex
		if (name == null) {		// If the password is empty
			return false;		// return false
		}
		Matcher m = p.matcher(name);
		return m.matches();
	}
}
