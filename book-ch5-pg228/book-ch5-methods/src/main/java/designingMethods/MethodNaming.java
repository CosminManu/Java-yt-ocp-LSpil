package designingMethods;

public class MethodNaming {
	//method names allow only letters, numbers, currency symbols or _
	
	public class Beachtrip {
		public void jeg1(){}
//		public void 2jeg(){}		// ERR 1st character is not allowed to be a digit/number
		public void joG_(){}
//		public void JoG_%(){}
		public void JoG_$(){}		// no good practice
//		public void _(){}			// ERR not just _
		
//		public void(){}		// ERR missing name
	}
}
