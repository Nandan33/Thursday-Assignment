package ta4;

public class CommonElememts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating a 2 static array of strings A and B and string some values in it
		String A[]= {"apple","ball","cat"};
		String B[]= {"apple","banana","camel"};
		
		//creating a empty array to store the similar element in array C
		String C[]=new String[A.length];
		int n=0;//to count the size of common elements creating variable n initializing with zero
		
		//comparing Array A with B and storing common elements in Array C if common element found n is incrementing 
		for (int i = 0,k=0; i < A.length; i++) {
			for (int j = 0; j < B.length; j++) {
				if(A[i]==B[j]) {
					C[k++]=A[i];
					n++;
				}
			}
			
		}
		
		//printing the Array C it will give common element b/w A and B 
		System.out.println("Common Elements B/W A and B are ");
		for (int i = 0; i <n; i++) {
			System.out.println(C[i]+" ");
		}

	}

}
