package demo;

public class SingletonDemo {
	
	private static SingletonDemo instance = new SingletonDemo();
	
	
	
	public static SingletonDemo getInstance() {
		
		return instance;
	}


	private SingletonDemo() {
		// ok
	}
	
	
	public void log(String message) {
		System.out.println(message);
	}

}
