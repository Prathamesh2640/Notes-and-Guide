// ***Diagram

class Demo extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread().getName());
	}
}
class MyThread extends Thread {

	public void run() {
	
		System.out.println(Thread.currentThread().getName());
		Demo d = new Demo();
		d.start();
	}
}
class ThreadDemo {

	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		MyThread obj = new MyThread();
		obj.start();
	}
}
