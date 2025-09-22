class Demo extends Thread {

	Demo(){

		System.out.println("no para");	
	}
	Demo(ThreadGroup group,String name) {
	
		super(group,name);
		System.out.println("para");	
	}
	public void run() {
	
	}
	public static void main(String[] args) {

		ThreadGroup tg1 = new ThreadGroup("c2w");
	
		Demo d1 = new Demo(tg1,"t1");
		System.out.println(d1.getThreadGroup());
		Demo d2 = new Demo(tg1,"t2");
		System.out.println(d1.getThreadGroup());
		Demo d3 = new Demo(tg1,"t3");
		System.out.println(d1.getThreadGroup());
		
		Demo d4 = new Demo();
		System.out.println(d4.getThreadGroup());
		Demo d5 = new Demo();
		System.out.println(d4.getThreadGroup());
		Demo d6 = new Demo();
		System.out.println(d4.getThreadGroup());
	
	}
}
