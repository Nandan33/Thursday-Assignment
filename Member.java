package thursday_Assignment10;

//programe 3 inheritance

public class Member {
	  // data members
	  String name;
	  int age;
	  long phoneNumber;
	  String address;
	  double salary;

	  // method to print salary
	  public void printSalary() {
	    System.out.println("Salary: " + salary);
	  }
	  
	  
	  public static void main(String[] args) {
		  
		  //To create an object of the Employee class and assign values to its data members
				Employee employee = new Employee();
				employee.name = "John";
				employee.age = 30;
				employee.phoneNumber = 1234567890;
				employee.address = "123 Main  bengaluru";
				employee.salary = 50000.0;
				employee.specialization = "Software Development";
				
				//To create an object of the Manager class and assign values to its data members
				Manager manager = new Manager();
				manager.name = "cena";
				manager.age = 35;
				manager.phoneNumber = 1235648755;
				manager.address = "456 Park tumkur ";
				manager.salary = 75000.0;
				manager.department = "Human Resources";
				
				//To print the salary of the employee and manager, you can use the printSalary() method 
				employee.printSalary();
				manager.printSalary();
	}
	  
	}

	 class Employee extends Member {
	  // data member for specialization
	  String specialization;
	}

	 class Manager extends Member {
	  // data member for department
	  String department;
	}
	
	 
	
