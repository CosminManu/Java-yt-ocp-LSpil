package abstractClasses;

public abstract class Canine {
	public abstract String getSound();
	
	public void bark(){
		System.out.println(getSound());
	}
}
