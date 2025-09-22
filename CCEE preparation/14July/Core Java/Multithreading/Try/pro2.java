class JoinDemo extends Thread {

	public void run() {

		for(int i=0; i<5; i++) {
		
			System.out.println("In run");	
		}
	}
}
class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		JoinDemo jd1 = new JoinDemo();
		//jd1.join();
		jd1.start();
		//jd1.join();
		Thread.currentThread().join();
		for(int i=0; i<5; i++) {
		
			System.out.println("In main");	
		}
	}
}
