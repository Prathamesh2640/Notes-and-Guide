// Recursive call to run()
// Unlimited time of execution because new method will also call run() method but previous threads will complete its work and hence there will not be any memory related error

class Demo extends Thread{

	public void run() {
	
		System.out.println("In run");
		System.out.println(Thread.currentThread().getName());
		fun();
		Demo d2 = new Demo();
		d2.start();
		System.out.println("End");
	}
	void fun() {
	
		System.out.println("In fun");
	}
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		Demo d = new Demo();
		d.start();
	}
}
