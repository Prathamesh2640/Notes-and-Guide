class Demo extends Thread {

	Demo(ThreadGroup tg, String str) {
	
		super(tg,str);
	}
	public void run() {
	
		ThreadGroup tg1 = new ThreadGroup("cbien");
		System.out.println(tg1.getParent());
	}

	public static void main(String[] args) {
	
		ThreadGroup tg1 = new ThreadGroup("c2w");
		System.out.println(tg1.getParent());
		System.out.println(Thread.currentThread().getThreadGroup().getParent());

	//	Demo d1 = new Demo(tg1,"t1");
		//d1.start();
	}
}
