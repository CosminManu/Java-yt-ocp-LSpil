package varargs;

public class VisitAttractions {

	public void walk1(int... steps) {
		int[] stepsArr = steps;
		System.out.println(stepsArr.length);
	}

	public void run(int... s) {
		System.out.println(s[0]);
	}

	public void walk2(int start, int... steps) {
		System.out.println(steps.length);
	}
	//	public void walk3(int... steps, int start){}					// Vararg parameter must be the last
	//	public void walk4(int start, int... steps, int... s){}		// int... steps Vararg must be the last

}
