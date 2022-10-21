package day3;

public class operator {
	
		
		public static void main(String[] args) {
			
			//declaring Local variable with the default value 
			int add, sub, mul, div, mod;
			
			
		    int num1= 5, num2 = 8;
		    
		    add = num1 + num2;
		    sub = num1 - num2;
		    mul = num1 * num2;
		    div = num1 / num2;
		    mod = num1 % num2;
		    
		    System.out.println("Addition num1+num2 is " + add); // add 
		    System.out.println("Subtraction num-1-num2 is "+ sub);
		    System.out.println("Multiplication num1*num2 is  "+ mul);
		    System.out.println("Division num1/num2 is  " + div);
		    System.out.println("Modulus num2%num1 is "+mod);
		}

}

