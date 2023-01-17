package exStatic;

public class ex2 {
	
	static public void main(String args[]){
	
		Snake snake = new Snake();
		System.out.println(snake.length);		// 10
		
		snake = null;
		System.out.println(snake.length);		// 10 (doesn't care snake became null)
		
		
		
	}
}
