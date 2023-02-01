package constructors;

public class Hamster {
	
	private int weight;
	private String color;
	
	public Hamster(int weight, String color){
		this.weight = weight;
		this.color = color;
	}
	
	public Hamster(int weight){
//		new Hamster(weight, "brown");
		this(weight, "brown");			// call ctor from another ctor (always 1st statement this() )
	}

	public static void main(String[] args) {
		Hamster h = new Hamster(20);
		System.out.println(h.color + " " + h.weight);
	}

}
