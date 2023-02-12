package nestedLoops;

public class NL {
	
	int[][] multidimArray = {
			{2,3,5,7},			//simpleArray1
			{5,30,35,77},		//simpleArray2
			{214,3632,435,7230},//simpleArray3
	};
	
	void f1(){
		for(int[] simpleArray : multidimArray){
			for (int i = 0; i < simpleArray.length; i++){
				System.out.print(simpleArray[i] + " ");
			}
			System.out.println();
		}
	}
	
	void f2(){
		for(int p = 0; p < multidimArray.length; p++){
			for(var element : multidimArray[p]){
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		NL nl = new NL();
		System.out.println("multidim array has length: " + nl.multidimArray.length);
		nl.f1();
		nl.f2();
	}
}
