package OCPbook.passData;

public class ReturningObj {
	
	static public void main(String a[]){
		
		int t = 2;
		String guests = "abc";
		addTickets(t);				// remains unchanged; return values is ignored
		guests = addGuests(guests);	
		System.out.println(t);
		System.out.println(guests);
		
	}

	private static String addGuests(String guests) {
		guests = guests + "defg";
		return guests;
	}

	private static int addTickets(int t) {
		t++;
		return t;
	}
}
