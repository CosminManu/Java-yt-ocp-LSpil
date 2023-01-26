package Lspil.encapsulation;

public class Ex1 {

	public static void main(String[] args) {
		Cat Tom = new Cat();
		
		Tom.setName("Tom");
		Tom.setAge(3);
		
		// encapsulation : fields are private, methods are public
		// getters & setters PUBLIC ALWAYS
		
		// clean code: avoid smart setters/getters (normal setters/getters + computation)
		
	}
}
