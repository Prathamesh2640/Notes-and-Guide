class YeildDemo extends Thread{

	public void run() {
	
		for(int i=0; i<5; i++) {
		
			System.out.println("In run");
			try {
			
				Thread.sleep(2000);
			} catch(Exception e) {
			

			}
		}
	}
}
class Demo {

	public static void main(String[] args) {
	
		YeildDemo obj = new YeildDemo();
		obj.start();

		for(int i=0; i<50; i++) {
		
			System.out.println("In main");
			if(i%5 == 0)
				obj.yield();

			try {
			
				Thread.sleep(2000);
			} catch(Exception e) {
			

			}
		}
		//System.out.println("In main");
	}
}
