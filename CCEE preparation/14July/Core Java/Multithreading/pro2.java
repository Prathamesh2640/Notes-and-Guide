// Rules for Multithreading:-
// 1. extend/implement Thread class/Runnable interface
// 2. override run() method compulsory
// 3. compulsory call start() method
// 4. not to override start() method of Thread class.

// Thread creation using Runnable interface
//
// Difference between Thread and Runnable :-
// 1. Runnable has only one method run() which os abstract while Thread class has variaous methods 
// 2. When we extend Thread class we cannot extend other classes as Java does not support multiple inheritance
// 3. When we implement Runnable interface we can extend other parent class as well 
// 4. After creating the Thread we have to start the Thread using start() method
// 5. After starting the thread JVM calls the run() method of Runnable
// 6. If we does not override run() then run() method of Runnable is executed which is abstract and we will not getany output
// 7. Hence we have to override run().
//
//
// We have to create object of Thread compulsory in this case to call the start method
// When we pass our class object to the Thread class then Thread(Runnable runnable) constructor gets invoked

class Demo implements Runnable {

	public void run() {
	
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<20; i++) {
		
			System.out.println("In run"+Thread.currentThread().getName());
			if(i == 5) {
			
				Thread.currentThread().stop();	
			}
		}
	}
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		Demo r = new Demo();
		Thread t = new Thread(r);
		t.start();
		
		Thread t2 = new Thread(r);
		t2.start();
		/*
		for(int i=0; i<20; i++) {
		
			System.out.println("In main"+Thread.currentThread().getName());
		}*/
	}
}
