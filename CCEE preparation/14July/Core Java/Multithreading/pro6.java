// We can set the priority of threads using setPriority method
// If we give the priority <1 or >10 then it will give IllegalArgumentException (runtime exception)



class Demo extends Thread {

	public void run() {
	
		for(int i=0; i<20; i++) {
		
			System.out.println("In run");
		}
		System.out.println(Thread.currentThread().getPriority());
	}
	public static void main(String[] args) {
	
		Demo d = new Demo ();
		//Thread.currentThread().setPriority(1);
		System.out.println(Thread.currentThread().getPriority());
		d.setName("C2W");
		d.setPriority(10);
		d.start();

		for(int i=0; i<20; i++) {
		
			System.out.println("In main");
		}
	}
}
