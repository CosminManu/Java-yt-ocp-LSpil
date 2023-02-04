package initializingObjects.WatchOut;

public class ZooTickets {
	//what will be the output?
	private String name = "BestZoo";
	{
		System.out.print(name + "-");
	}
	private static int COUNT = 0;

	static {
		System.out.print(COUNT + "-");
	}

	static {
		COUNT += 10;
		System.out.print(COUNT + "-");
	}

	public ZooTickets() {
		System.out.print("zoo-");
	}

	public static void main(String[] args) {
		new ZooTickets();
	}
}
