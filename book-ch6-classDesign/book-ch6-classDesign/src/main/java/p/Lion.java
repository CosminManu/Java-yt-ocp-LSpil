package p;

public class Lion extends Animal{

	protected void setProperties(int age, String n){
		setAge(age);
		name = n;
	}
	
	protected void vocal(){
		System.out.print(name + ", age " + getAge() + " says ROAR!");
	}

	public static void main(String[] args) {
		var lion = new Lion();
		lion.setProperties(5, "Lion King");
		lion.vocal();
		
	}
	
}
