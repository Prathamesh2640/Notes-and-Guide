class Demo extends Thread {

	public void run() {
	
		try {
		
			Thread.sleep(2000);
		} catch(Exception e) {
		
		}
		System.out.println("run");
	}
	Demo() {
	
	}
	Demo(ThreadGroup tg, String str) {
	
		super(tg,str);
	}
	public static void main(String[] args) {

		ThreadGroup tg = new ThreadGroup("c2w");
		Demo d1 = new Demo(tg,"t1");
		//d1.start();

		ThreadGroup tg1 = new ThreadGroup(tg,"Child");
		//System.out.println(tg1.getParent());
		
		Thread.currentThread().getThreadGroup().list();
		tg.list();
	}
}
