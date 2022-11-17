package ta5;

public class FunctionofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring a string 
        String str1="AnudipFoundation";
        String str2="Anudip";
        String str3="Foundation";
        
        //1.toLowercase function will convert all the character in the string to lowercase ---------> anudip foundation
        System.out.println(str1.toLowerCase());
        
        //2.toUppercase function will convert all the character in the string to uppercase----------> ANUDIP FOUNDATION
        System.out.println(str1.toUpperCase());
        
        //3.concat function Appends a string to the end of another string--------->  AnudipFoundation
        System.out.println(str2.concat(str3));
        
        //4.replace function replace the values of  str2 to str3 ----------->AnudipAnudip
        System.out.println(str1.replaceAll(str3, str2));
        
        //5.length returns the length of string ------->16
        System.out.println(str1.length());

	}

}
