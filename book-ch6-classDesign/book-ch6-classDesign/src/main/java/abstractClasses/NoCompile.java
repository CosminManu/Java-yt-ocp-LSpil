package abstractClasses;

public class NoCompile extends Animal {

	@Override
	public String getName() {
		return "null";
	}
}
// ERR Class 'NoCompile' must either be declared abstract 
// or implement abstract method 'getName()' in 'Animal'
