class Demo extends Thread {

	public void run() {
	/*
		try {
		
			Thread.sleep(2000);
		} catch(Exception e) {
		
		}*/
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
		d1.start();
		Demo d2 = new Demo(tg,"t1");
		d2.start();
		Demo d3 = new Demo(tg,"t1");
		d3.start();

		tg.suspend();
		try{
		
			Thread.sleep(1000);
		}catch(Exception e) {
		
		}
		tg.resume();
	}
}
