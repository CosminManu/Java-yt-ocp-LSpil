package OCPbook.overloading;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class Parrot {
	
	public static void print(List<Integer> x){
		System.out.print("I");
	}
//	public static void print(List<Double> x){
//		System.out.print("C");
//	}		// ERR 'print(List<Integer>)' clashes with 'print(List<Double>)'; both methods have same erasure
	
	public static void print(CharSequence charSequence){
		System.out.print("C");
	}
	
	public static void print(Object o){
		System.out.print("O");
	}

	public static void main(String a[]){
		print("a");
		print(Arrays.asList(3));	// 1 element = 3
		print(LocalDate.of(2023, Month.JANUARY, 30));		// calls object parameter
	}
	
}
