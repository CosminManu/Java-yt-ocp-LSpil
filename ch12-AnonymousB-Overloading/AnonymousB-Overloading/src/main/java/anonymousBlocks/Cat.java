package anonymousBlocks;

public class Cat {

	static String emoji = ":)";
	final static String finalEmoji = ":]";
	// => 1) assign at declaration
	// => 3) assign in anonym block
	final private String name;
	// => 1) assign at declaration
	// => 2) assign in ctor
	// => 3) assign in anonym block

	
	static {	//1st one executed
		System.out.println("Static Anonymous block #1");
		
	}

	public Cat(){		// executed last
		name = "csie";
		System.out.println("anonymousBlocks.Cat created from ctor");
	}

	//anonymous block (NOT clean code)
	//no name
	{	// executed in the order they're declared in class, only at instantiation
		System.out.println(
				"normal anonymous block"
		);
	}

	//anonymous static block
	static {	//2nd one executed
		System.out.println("Static Anonymous block #2");
	}

	static {
		System.out.println(emoji);
	}
	
	{
		System.out.println(finalEmoji);
	}

	static void sayMeow(){
		System.out.println("Meow!");
	}
}
