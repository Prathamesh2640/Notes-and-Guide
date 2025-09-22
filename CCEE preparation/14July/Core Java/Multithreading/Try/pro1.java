class Demo {

	Demo(int x) {
	
		System.out.println(x);
	}
	Demo() {
	
		this(10);
	}
	public static void main(String[] args) {
	
		Demo d = new Demo();
	}
}
