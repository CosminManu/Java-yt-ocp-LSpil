package switchExpression;

public class SExp2 {
	
	public void printDayOfWeek(int day){
		var result = switch (day){
			case 1 -> "Luni";
			case 2 -> "Marti";
			case 3 -> "Miercuri";
			case 4 -> "Joi";
			case 5 -> "Vineri";
			case 6 -> "Sambata";
			case 7 -> "Duminica";
			default -> "Ai introdus gresit - o saptamana are 7 zile";
		};
		System.out.println(result);		
	}
	// no breaks
	
	static public void main(String... args){
		SExp2 sExp2 = new SExp2();
		sExp2.printDayOfWeek(9);
	}
}
