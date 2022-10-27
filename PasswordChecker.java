package ta2;

import java.util.Scanner;

public class PasswordChecker {
  
	public static void main(String[] args) {
		
		// using scanner class to take input from user
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Password : ");
		
		// taking input 1
		String password=sc.next();
		
		System.out.println("confirm password : ");
		
		// taking input 2
		String confirmpassword=sc.next();
		sc.close();
		
		// with equals method comparing the content presented in password and confirmpassword  
		if(password.contentEquals(confirmpassword)) {
			System.out.println("Allow..");
		}else {
			System.out.println("Error....!!!!");
		}
	}
}
