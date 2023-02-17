package unreachableCode;

public class B {

	int min = 1;
	int hour = 2;
	
	void f(){
		WATCH:
		while (min > 2) {
			if (min++ > 2) {
				continue WATCH;
//				System.out.println(min);		// ERR Unreachable statement
			}
		}
	}
	
	void f2(){
		switch (hour){
			case 1: return; 
//			hour++;			// ERR Unreachable statement
			case 2:
//			case 3: continue;	// ERR Continue outside of loop
		}
	}
}
// NO CONTINUE IN SWITCH
