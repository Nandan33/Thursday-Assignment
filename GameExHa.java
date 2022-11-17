package ta5;

import java.util.Scanner;

      

public class GameExHa {
	
	static void verify_menu(int m) throws Exception {
		if(m!=1&&m!=2&&m!=3) {
			throw new  Exception();
		}
	}
	
	static void verify_length(String s) throws Exception {
		if(s.length()>1) {
			throw new Exception();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Menu input ");
        int m=sc.nextInt();
        System.out.println("Enter Character");
        String s=sc.next();
        sc.close();
        
        try {
			verify_menu(m);
			
			
		} catch (Exception e) {
			
			System.out.println("Inappropriate User-Defined Exception");
		} try {
			verify_length(s);
		} catch(Exception e) {
			System.out.println("user defined only single charectore allowed...!!!");
		}
       
        
	}

}
