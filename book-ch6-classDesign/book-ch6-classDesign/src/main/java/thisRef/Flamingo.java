package thisRef;

public class Flamingo {
	private String color = null;
	
	public void setColor(String color){
		this.color = color;		// din 'null' this.color devine color dat ca parametru
	}						// fara 'this' color ar fi ramas la val initiala null

	public String getColor() {
		return color;
	}
}
