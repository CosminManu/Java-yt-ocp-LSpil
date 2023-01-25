package accessModif.pond.duck;

public class BadDuck {
	
	void makeNoise(){
		var duck = new FatherDuck();
		
//		duck.quack();					ERR 'quack()' has private access
//		System.out.println(duck.noise);		'noise' has private access
		
	}

}
