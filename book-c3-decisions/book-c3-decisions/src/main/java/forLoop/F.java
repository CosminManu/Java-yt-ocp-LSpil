package forLoop;

public class F {

	public static void main(String[] args) {

		int i= 1;
		for (i = 0; i < 10; i++) {
			System.out.println(i);		// 0 ... 9
		}
		System.out.println(i);			// 10
		// 0, 1, 2,.. 10 inclusiv (first is i++ then i<10)

		System.out.println();
		for(var counter = 5; counter >= 0; counter--){
			System.out.print(counter + " ");		// 5 4 3 2 1
		}
	}
}
