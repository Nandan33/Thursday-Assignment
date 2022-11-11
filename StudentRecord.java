package ta4;



public class StudentRecord {
public static void main(String[] args) {
	
	//creating the Static arrays to store Students_names , Student_ID,and Courses 
	String[] student_Name = {"Arun  ","kumar ","Suresh","Ramesh"};
	int Student_id[]  = {100,101,102,103};
	String Course[] = {"Java","Python","Devops","Testing"}; 
	
	//printing headers for better visibility
	System.out.println("Name " + "    ID " +"   Courses");
	//this print the dotted line for design
	System.out.println("------------------------");
	
	//using for loop to print the values stored in the diffrent arrays 
			for (int i = 0; i < student_Name.length; i++) {
				System.out.println(student_Name[i]+"   "+Student_id[i]+"   "+Course[i]);
			}
			System.out.println("--------------------------");
		}
		
	
}

