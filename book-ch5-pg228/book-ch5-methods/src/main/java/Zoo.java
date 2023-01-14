public class Zoo {
	
	public void zooAnimalCheckup(boolean isWeekend){
		final int rest;
		final var giraffe = new Animal("Giraffe", 200, 15, true);
		final int[] friends = new int[5];
		
		if(isWeekend) 
			rest = 5; 
		else rest = 20;
		System.out.println(rest);
		
//		if(isWeekend)
//			rest = 5;
//		System.out.println(rest);	// Variable 'rest' might not have been initialized
		
		giraffe.setName("Coco");
		friends[3] = 10;
		// rest = final primitive => data can't be modified
		//		rest=100;
		//		giraffe = new Animal();
		//		friends = new int[10];
	
	}
}
