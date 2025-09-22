class Demo extends Thread {

	Demo(ThreadGroup td, String str) {
	
		super(td,str);
	}
	public void run() {
	
		for(int i=0;i<5;i++) {
		
			
			try {
			
				Thread.sleep(1000);
			}catch(Exception e) {
			
			}
			System.out.println("In run");
		}
	}
	public static void main(String[] args) throws Exception{
	
		ThreadGroup tg1 = new ThreadGroup("c2w");
		Demo d1 = new Demo(tg1,"t1");
		d1.start();
		
		Demo d2 = new Demo(tg1,"t1");
		d2.start();
		
		Demo d3 = new Demo(tg1,"t1");
		d3.start();
		//Thread.sleep(4000);

		System.out.println(tg1.getParent().activeGroupCount());
		System.out.println(tg1.activeCount());
	}
}
