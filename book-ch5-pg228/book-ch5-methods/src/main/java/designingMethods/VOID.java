package designingMethods;

public class VOID {

	public void swim(int d) {
		if (d < 3){
			return;
		}
		System.out.println("can you get on this line?");
	}

	static public void main(String[] args) {
		VOID v = new VOID();
		v.swim(4);
	}
}
