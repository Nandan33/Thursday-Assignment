package thursday_Assignment10;

public class Rectangle {
	
		  // data members
		  double length;
		  double breadth;

		  // constructor
		  Rectangle(double length, double breadth) {
		    this.length = length;
		    this.breadth = breadth;
		  }
		  
		  public static void main(String[] args) {
			  //create an object of the Rectangle class to print its area and perimeter
			  Rectangle rectangle = new Rectangle(10, 5);//passing value
			  System.out.println("----------Rectangle-----------");
			  rectangle.printArea();
			  rectangle.printPerimeter();
			  
			  //create an object of the Square class to print its area and perimeter
			  System.out.println("----------square-----------");
			  Square square = new Square(5);//passing value
			  square.printArea();
			  square.printPerimeter();


		}

		  // method to print the area of the rectangle
		  public void printArea() {
		    double area = length * breadth;
		    System.out.println("Area is: " + area);
		  }

		  // method to print the perimeter of the rectangle
		  public void printPerimeter() {
		    double perimeter = 2 * (length + breadth);
		    System.out.println("Perimeter is : " + perimeter);
		  }
		}

		 class Square extends Rectangle {
		  // constructor
		  public Square(double side) {
		    super(side, side);//this is reffering to superclass constructore (rectangle)
		  }
		}


