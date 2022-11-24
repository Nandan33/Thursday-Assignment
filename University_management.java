package ta6;
import java.util.*;


public class University_management {
  public static void main(String[] args) {
	  
	  // for better visibility in console we print this 
	  System.out.println("................University Management System....................");
	  System.out.println();
	  System.out.println("Press 1 To Enter Student Details\nPress 2 To Enter Employee Details");
	  
	  //used to give input for user
	Scanner sc=new Scanner(System.in);
	int input=sc.nextInt();
	System.out.println("------------------------------------------------------");

	Student s = new Student();//creating a student class object
	  Employee e = new Employee();//creating a employee class object
	  
	  //using switch case to give a choice to user to chose b\w them
	switch (input) {
	case 1:
		
		//if user press one it will call thease method from student class
		s.set_StudentDetails();
		System.out.println("................University Management System....................");
		s.Show_StudentDetails();
		
		
		break;
		
	case 2:
		//if user press 2 it will call thease method from employee class
		e.Set_EmplyeeDetails();
		System.out.println("................University Management System....................");
		e.Show_EmployeeDetails();
		
		break;

	default:
		
		// user presses other than 1 or 2 it will print this
		System.out.println("........Invalid Input Please Press 1 or 2 ........");
		break;
		
	}
	
}
}

class Details{
	
	//this is a details class where we created variables these variables later we use it in diffrent classes through inheritance
	Scanner sc=new Scanner(System.in);
	String Student_Id,Student_FirstName,Student_LastName,Student_Age,Course;
	String Employee_Id,Employee_FirstName,Employee_LastName,Employee_Age,Salary,Designation,Department;
}


class Student extends Details{
	
	// method will set the values to the student class variable 
	public void set_StudentDetails() {
		
		System.out.println("Enter Student_id");
		Student_Id= sc.next();
		System.out.println("Enter Student_FirstName");
		Student_FirstName=sc.next();
		System.out.println("Enter Student_Lastname");
		Student_LastName=sc.next();
		System.out.println("Enter Age");
		Student_Age=sc.next();
		System.out.println("Enter Course");
		Course=sc.next();
		
	}
	
	// to print the values present in that variable
	public void Show_StudentDetails() {
		System.out.println(" ......................Student Details.........................");
		System.out.println("ID        : "+Student_Id);
		System.out.println("FirstName : "+Student_FirstName);
		System.out.println("LastName  : "+Student_LastName);
		System.out.println("Age       : "+Student_Age);
		System.out.println("Course    : "+Course);
	}
}

class Employee extends Details{
	
	// method will set the values to the employee class variable 
	void Set_EmplyeeDetails() {
		//Scanner s=new Scanner(System.in);
		System.out.println("Enter Employee ID");
		Employee_Id=sc.next();
		System.out.println("Enter Employee FirstName");
		Employee_FirstName=sc.next();
		System.out.println("Enter Employee LastName");
		Employee_LastName=sc.next();
		System.out.println("Enter Employee Age");
		Employee_Age=sc.next();
		System.out.println("Enter Employee Salary");
		Salary=sc.next();
		System.out.println("Enter Designation");
		Designation=sc.next();
		System.out.println("Enter Department");
		Department=sc.next();
	}
	void Show_EmployeeDetails(){
		System.out.println("....................... Employee Details.......................");
		System.out.println("Employee ID : "+Employee_Id);
		System.out.println("Employee first name : "+Employee_FirstName);
		System.out.println("Employee last name : "+Employee_LastName);
		System.out.println("Employee age : "+Employee_Age);
		System.out.println("Employee Salary : "+Salary);
		System.out.println("Employee Department name : "+Department);
		System.out.println("Employee Designation : "+Designation);
	}
}
