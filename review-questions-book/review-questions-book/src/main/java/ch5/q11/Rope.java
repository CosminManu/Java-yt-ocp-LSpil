package ch5.q11;

public class Rope {

	public static void swing() {
		System.out.print("swing");
	}
	
	public void climb(){
		System.out.println("climb");
	}
	public static void play() {
		swing();
//		climb();
	}

	public static void main(String[] args) {
		Rope rope = new Rope();
		rope.play();			// fine; Static member 'Rope.play()' accessed via instance reference
		Rope rope1 = null;
		System.out.print("-");
		rope1.play();
	}
	
}
