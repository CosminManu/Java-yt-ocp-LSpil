package Lspil.anonymousBlocks;

public class Example1 {
	
	static public void main(String args[]){
		
		Cat.sayMeow();
		//execution of the static anonymous blocks and declared static method sayMeow()
		
		Cat.sayMeow();
		Cat.sayMeow();
		//execution ONLY of declared static method sayMeow()
		System.out.println();
		
		Cat cat = new Cat();		//instantiation
		new Cat();
	}

}
