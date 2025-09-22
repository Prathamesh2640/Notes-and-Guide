// sleep() throws InterruptedException(checked)
// When we use sleep method in run() method we have to handle InterruptedExxception using try catch as we cannot use throws InterruptedException on run() method because run() method of runnable does not throw that exception

// Thread class has 10 constructors
// Thread is created inside contructor of thread class.
// Inside thread class there is a call to VMThread.create() which actually creates the thread
// Separate stack is created for separate thread i.e if 5 threads are there then there will be 5 stacks on which functions are running simultaneously
// When we call start() method on thread i.e. t.start() then thread goes in ready to run state
// void sleep() :- sleep() method is used to pause the execution of program for specific time
// sleep() method throws the InterruptedException
//

class Demo {

	public static void main(String[] args) throws InterruptedException {
	
		for(int i=0; i<5; i++) {
		
			System.out.println("In main");
			Thread.sleep(1000);
		}
	}
}
