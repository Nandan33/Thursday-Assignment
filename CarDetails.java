package ta4;

public class CarDetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       enum car_model{Toyota(2001),Tata(2005),Ford(2010),kia(2018);
        //creating a enum and storing a value
	 int i;
	 //creating empty variable and parameteraized constructore

	car_model(int i) {
		// TODO Auto-generated constructor stub
		this.i=i;
	}
    	   
       };
       
       //using foreach loop to print the car name and model
       System.out.println("Carname\t model");
       System.out.println("------------------");
       for ( car_model c : car_model.values()) {
		System.out.println(c+" \t "+c.i);
	}
	}

}
