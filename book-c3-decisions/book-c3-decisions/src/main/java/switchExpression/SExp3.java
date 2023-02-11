package switchExpression;

public class SExp3 {
	
	public void printSeason(int month){
		switch (month){
			case 1, 2, 12 -> System.out.print("Winter");
			case 3, 4, 5 -> System.out.print("Spring");	
			case 6, 7, 8 -> System.out.print("Summer");	
			case 9, 10, 11 -> System.out.print("Autumn");	
		}
	}
	//no need for a variable 
	//if it only prints out an output

	public static void main(String[] args) {
		SExp3 sExp3 = new SExp3();
		sExp3.printSeason(9);
	}
}