package exStatic;

public class ex1 {

	static public void main(String... args) {

		var pinguin = new Penguin();
		pinguin.name = "Coco";
		pinguin.nameOfTallestPenguin = "Mata";
		var altPinguin = new Penguin();
		altPinguin.name = "Pipi";
		altPinguin.nameOfTallestPenguin = "Tactu";

		System.out.println(pinguin.name);					//instance of class
		System.out.println(Penguin.nameOfTallestPenguin);	// shared atribute STATIC
		System.out.println(altPinguin.name);
		System.out.println(Penguin.nameOfTallestPenguin);	// shared atribute STATIC

	}

}
