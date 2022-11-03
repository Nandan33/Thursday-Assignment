package ta3;

import java.util.Scanner;

public class palidrome {
public static void main(String[] args) {
	
	
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Numer to Check it is palidrome or Not....");
	int num = scan.nextInt();
	int temp= num;
	int a=0;
	int b=0;
	scan.close();
	
	while (temp!=0) {
		a=temp%10;
		b=b*10+a;
		temp=temp/10;
	}
	if(num==b) {
		System.out.println(num + " is a Palidrome Number");
	}else {
		System.out.println(num + " is Not a palidrome Number");
	}
}
}
