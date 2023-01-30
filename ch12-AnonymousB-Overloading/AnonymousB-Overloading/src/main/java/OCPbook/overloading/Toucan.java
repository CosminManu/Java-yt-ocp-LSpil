package OCPbook.overloading;

public class Toucan {

	public void fly(int[] lenghts) {
		System.out.println("array");
	}

	//	public void fly(int... lengths){}		// ERR 'fly(int...)' is already defined
	//Java treats varargs AS AN ARRAY
	//Arrays do not autobox  (int[] not Integer[])

}
