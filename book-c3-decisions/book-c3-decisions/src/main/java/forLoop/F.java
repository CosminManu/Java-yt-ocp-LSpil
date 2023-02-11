package forLoop;

public class F {

	public static void main(String[] args) {

		int i = 1;
		for (i = 0; i < 10; i++) {
			System.out.println(i);        // 0 ... 9
		}
		System.out.println(i);            // 10
		// 0, 1, 2,.. 10 inclusiv (first is i++ then i<10)

		System.out.println();
		for (var counter = 5; counter >= 0; counter--) {
			System.out.print(counter + " ");        // 5 4 3 2 1
		}

		// multiple items for (only one data type at declaration) 
		int x = 0;
		for (int y = 0, z = 4; x < 5 && y < 10; x++, y++) {
			System.out.print(y + " ");
		}
		System.out.print(x + " ");

		// out of scope variable 'w'
		for (int w = 0, q = 1; w < 3 && q < 5; w++, q++) {
			System.out.println(q + " ");
		}
		//		System.out.println(w);		// out of scope 'w'

		for (int d = 0; d < 5; ) {
			System.out.println(d);
			d++;
		}
		
		// INFINITE loop
		for (; ; ) {
			System.out.println("Infinite loop");
		}

	}
}
