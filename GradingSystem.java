package ta4;

public class GradingSystem {

	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			//creating array contains marks
			int marks[] = {86,90,70,77,61,50,97};
			//array rank contains ranks
			String rank[]= {"1st","2nd","3rd","4th","5th","6th","7th"};
			
			//creating a temprovary variable 
			int temp;
			int n=marks.length;
			
			
			//this loops sort marks in ascending order 
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n-i-1; j++) {
					if(marks[j]<marks[j+1]) {
						temp=marks[j];
						marks[j]=marks[j+1];
						marks[j+1]=temp;
					}
				}
			}
			
			//for printing a rank with marks 
			for (int i = 0; i < n; i++) {
				System.out.println(rank[i]+" - "+marks[i]);
			}
			
		}

}
