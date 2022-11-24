package ta6;

import java.util.*;

public class Employee_Management {

	public static void main(String[] args) {
	
	Employe e = new Employe();//creating object for employee class
	Manager m = new Manager();//creating a object for manager class
	e.set(); //calling a employee class method from employee class object
	System.out.println();
	System.out.println("----------------------------------------------------------");
	m.set(); //calling manager class method from manager calss object
	System.out.println();
	System.out.println("----------------------------------------------------------");
	e.display();//calling a employee class method from employee class object
	System.out.println();
	System.out.println("-------------------------------------------------------------");
	m.display();//calling manager class method from manager calss object
	}
}

 class Member {
	 
	 //to take input from user
	Scanner s = new Scanner(System.in);
	
	public int age,phone,salary;//creating a variables to reuse it in diffrent classes
	public String address,name;
	
	}
 
	class Employe extends Member
	{
	String specialization,department; //variables of employee class
	
	//method is used to set the values of employee class 
	public void set()
	{
	System.out.println("Enter the Employee name :");
	name=s.next();
	System.out.println("Enter the Employee age : ");
	age=s.nextInt();
	System.out.println("Enter the Employee Salary : ");
	salary=s.nextInt();
	System.out.println("Enter the Employee Specialization : ");
	specialization=s.next();
	System.out.println("Enter the Employee Department : ");
	department=s.next();
	System.out.println("Enter the Employee Address : ");
	address=s.next();
	}
	
	//used to print the vlaues of employee class
	public void display()
	{
	System.out.println(".......................The Employee Details.....................");
	System.out.println("Employee name : "+name);
	System.out.println("Employee age : "+age);
	System.out.println("Employee Salary : "+salary);
	System.out.println("Employee Department name : "+department);
	System.out.println("Employee Specialization : "+specialization);
	}
	}

	class Manager extends Member
	{
	String specialization,department;//variables of manager class
	
	//to set the value to the members of manager class
	public void set()
	{
	System.out.println("Enter the Manager name :");
	name=s.next();
	System.out.println("Enter the Manager age : ");
	age=s.nextInt();
	System.out.println("Enter the Manager Salary : ");
	salary=s.nextInt();
	System.out.println("Enter the Manager Specialization : ");
	specialization=s.next();
	System.out.println("Enter the Manager Department : ");
	department=s.next();
	System.out.println("Enter the Manager Address : ");
	address=s.next();
	}
	
	//print the members of manager class
	public void display()
	{
	System.out.println(".............................The Manager Details...............................");
	System.out.println("Manager name : "+name);
	System.out.println("Manager age : "+age);
	System.out.println("Manager Salary : "+salary);
	System.out.println("Manager Department name : "+department);
	System.out.println("Manager Specialization : "+salary);
	}
	}
	
