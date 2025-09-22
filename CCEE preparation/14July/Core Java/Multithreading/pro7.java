


class Demo extends Thread{

	static Thread x = Thread.currentThread();
	public void run() {
	
		try{
		
			System.out.println(x.getName());
		} catch (Exception e) {
		
		}
	}
}
class MultiThread {

	public static void main(String[] args) {
		
		Thread x = Thread.currentThread(); 
		Demo obj = new Demo();
		obj.start();
	}
}
