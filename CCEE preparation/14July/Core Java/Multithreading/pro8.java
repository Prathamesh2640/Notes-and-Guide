// do not override start() method because start() method of thread class has power to start the thread 
// but if you override start() method then it does not have that power

class StartDemo {

	public void run() {
	
	}
	public void start() {
	
	}
	public static void main(String[] args) {
	
		StartDemo d = new StartDemo();
		d.start();
	}
}
