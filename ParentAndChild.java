package ta6;

public class ParentAndChild {

	public static void main(String[] args) {
		//creating a object for both class
		Parent p =new Parent();
		Child c = new Child();
		
		p.P_Status();//calling method of parent class by object parent class
		c.C_Status();//calling method of child class by object child class
		c.P_Status();//calling method of parent class by object child class
	}
}

class Parent{
	//creating a method that will print this is a parent class
	void P_Status() {	
		System.out.println("This is a Parent Class");
	}
}

class Child extends Parent{
	
	//creating a method that will print this is a child class
	void C_Status(){
		System.out.println("This is a Child class ");
	}
}
