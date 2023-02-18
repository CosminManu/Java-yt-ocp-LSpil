package abstractClasses;

public class Wolf extends Canine {

	public String getSound(){
		return "Woooooof!";
	}

	@Override
	public void bark() {
		super.bark();
	}
}
