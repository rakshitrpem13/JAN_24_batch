package New_jan24;

public class paracon {
	
	public paracon() {
		this(22,11,14);
		System.out.println("dwfault parameterised constructor");
	}
	public paracon(int a) {
	
		System.out.println("one parameterised constructor");
	}
	public paracon(int a, int b) {
		this();
		System.out.println("two parameterized constructor");
	}
	public paracon(int a,int b,int c) {


		System.out.println("three parameterised constructor");
	}
	public paracon(int a,int b,int c,int d) {
		this(22,11);
		System.out.println("four parameterized constructor");
	}
	public static void main(String[] args) {
		paracon pr = new paracon(22,11,14,18);
	}

}
