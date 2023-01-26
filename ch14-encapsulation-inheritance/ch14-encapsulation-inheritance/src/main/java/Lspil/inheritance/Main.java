package Lspil.inheritance;

public class Main {

	public static void main(String[] args) {
		
		Square patrat = new Square();
		Shape patrat2 = new Square();
//		Square patrat3 = new Shape();		ERR read it from right to left
		/*
		you can say every square is in fact a shape
		 BUT NOT every shape can be a square
		 
		 it goes from general -> more particular
		Shape is too general to be put in a Square 
		 */
		
		patrat.side = 5.0;
		patrat.area = 25.0;
		

		// hiding fields 
		Circle cerc = new Circle();
//		cerc.area = 20.8;			// area from Circle (String) not from Shape
		cerc.area = "pi*100";
		cerc.radius = 10;
	}
}
