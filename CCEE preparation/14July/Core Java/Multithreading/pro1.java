// Multithreading is used to improve the performance of the code
// Execution time is decreased 
// Multithreading is used to fast the execution irrespective of result

// There are two ways of creating threads 
// 1. Extending thread class
// 2. Implementing Runnable interface
// If we extend thread class then we cannot extend other class with it
// Hence implementing runnable allows you to extend other class so that we add other funtinalites to our program
// Also we require two methods start() and run() for the thread
// start() - Thread class method
// run() - method of Runnable interface
//
// Runnable interface is parent of Thread class
// As Thread is child of Runnable, Thread class has both start() and run() methods
//
// Thread class contains variaous methods getName(), setName() etc
// Runnable interface contains only one methods run() which is abstract
//
// Thread creation using Thread class


class Demo extends Thread {

	
	public void run() {
	
		System.out.println(Thread.currentThread().getName());
	}
	public static void main(String[] args) {
	
		System.out.println(Thread.currentThread().getName());
		Demo obj1 = new Demo();
		obj1.start();
		obj1.start();	//	IllegalThreadStateException       we cannot use same thread multiple times
	}
}
