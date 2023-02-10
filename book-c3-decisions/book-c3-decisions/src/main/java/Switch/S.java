package Switch;

public class S {

	boolean v = true;
	int month = 2;
	
	void func(){
		switch (month) {		// 'switch' + (..) + { } required
			case 1:				// 'case' always with 2 dots : ; case data type MUST MATCH switch data type
				System.out.println("Jan");
				break;						// 'breaks' optional
			case 2:
				System.out.println("Feb");
				break;
			case 5:
				System.out.println("May");
				break;
			case 13, 14, 15:
				System.out.println("Incorrect no of month");
				break;
			default:							// 'default' optional
				System.out.println("No month");
		}
		var var = "var";
	}
	
	void func2(){
		switch (month){}		// perfectly valid
	}
	
//	void func3(){
//		switch (v){}		// ERR boolean in switch
//	}

	public static void main(String[] args) {
		S s = new S();
		s.func();
	}
	
//	public int addition(var a, var b){		VAR only as variable, not parameter
//		a + b;
//	}
}

/*
switch with NO BREAKS passes through EVERY 'case'
case data type MUST MATCH switch data type

All data types supported by switch
	- int & Integer
	- byte & Byte
	- short & Short
	- char & Character
	- String (non-primitive)
	- enum
	- var (if type resolves to one of the preceding types)
	
NO long, float, double, boolean
 */
