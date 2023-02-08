package redundantImports;

//import java.lang.System;
//import java.lang.*;			// redundant; autom imported
import java.util.Random;
import java.util.*;
//import java.util.*.*;		// ONLY 1 wildcard

public class NumberPicker {

	public static void main(String[] args) {
		Random random = new Random();
		System.out.println(random.nextInt(31));
	}
}

/*
Wildcards * (normal import)
	no child packages	no import java.nio.*;	=> import java.nio.file.*;	+ import java.nio.file.Paths;
	no methods			no java.nio.file.Paths.*;
	no fields
	
	only classes
	cat mai specific cu putinta
 */
