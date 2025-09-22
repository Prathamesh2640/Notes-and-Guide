class ThreadDemo extends Thread {

	ThreadDemo() {
	
	}
	ThreadDemo(String str) {
	
		//super(name);
	}
	ThreadDemo(ThreadGroup tg, String name) {
	
		super(tg,name);
	}
	public void run() {

		System.out.println("in run");	
	}
}
class Demo {

	public static void main(String[] args) {
	
		Thread d1 = new Thread();
		//d.start();
		ThreadDemo t1 = new ThreadDemo();
		t1.start();

		ThreadGroup tg1 = new ThreadGroup("C2W");
		ThreadDemo d = new ThreadDemo(tg1,"t1");
		d.start();
		
		ThreadDemo d2 = new ThreadDemo(tg1,"t2");
		ThreadDemo d3 = new ThreadDemo();

		System.out.println(Thread.currentThread().getThreadGroup());
	}
}
