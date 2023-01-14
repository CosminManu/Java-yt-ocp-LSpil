public class Animal {
	
	private String name;
	private double weight;
	private double length;
	private boolean isHerbivoric;
	
	public Animal(String name, double weight, double length, boolean herbivoric){
		this.name = name;
		this.weight = weight;
		this.length = length;
		this.isHerbivoric = herbivoric;
	}
	public Animal(){}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public boolean isHerbivoric() {
		return isHerbivoric;
	}

	public void setHerbivoric(boolean herbivoric) {
		isHerbivoric = herbivoric;
	}
}
