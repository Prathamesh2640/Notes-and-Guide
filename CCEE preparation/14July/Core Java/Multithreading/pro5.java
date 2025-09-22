// Thread life cycle :-
// 1. Born/New - Thread t = new Thread();
// 2. Ready to run - t.start();
// 3. Running - Thread scheduler(Java CPU allocation)
// 4. Exit - After operation
// Threads are handled by the thread scheduler i.e threads are scheduled by thread scheduler according to the priority of that thread
// By default priority of thread is 5
// Min priority - 1
// Max priority - 10
//
// Controlling Threads - We can  control thread execution using sleep , join methods
// void join() throws InterruptedException :- it allows one thread to complete its execution
// 2. Thread waits until the other thread to complete its execution on which join is called


class JoinDemo extends Thread {

	public void run() {
	
		for(int i=0; i<20; i++) {
		
			System.out.println("In run");
		}
	}
	public static void main(String[] args) throws InterruptedException {
	
		JoinDemo jd = new JoinDemo();
		//Thread.currentThread().join();
		jd.start();
		//jd.join();
		Thread.currentThread().join();
		//jd.start();

		for(int i=0; i<10; i++) {
		
			System.out.println("In main");
		}
	}
}
