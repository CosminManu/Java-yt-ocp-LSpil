package thisRef;

public class Duck {

	private String color;
	private int height;
	private int length;
	
	public Duck(String color, int length, int height){
		this.color = color;
		this.height = height;
		this.length = length;
//		length = this.length;		// NOT GOOD
	}
	
}
