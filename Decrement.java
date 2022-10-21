package day3;

public class Decrement {

	public static void main(String[] args) {
	
		//Local variable
		int val1=10;
		int val2=20;
		
		//decrementing both pre AND post fix
		System.out.println("decrementing both pre AND post fix");
		System.out.println("pre decrement of val1 : " + --val1);
		System.out.println("pre decrement of val2 : " + --val2);
		System.out.println("post decrement of val1 : " + val1--);
		System.out.println("post decrement of val2 : " + val2--);

	}

}
