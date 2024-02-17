package New_jan24;

public class thismethod {
	public void m1() {
		
		System.out.println("default method");
		
	}
	public void m2(int a) {
		this.m4(12,22,33);
		this.m5(12,22,44,44);
		this.m1();
		System.out.println("one method");
		
	}
	public void m3(int a, int b) {
		System.out.println("two method");
		
	}
	public void m4(int a, int b, int c) {
		System.out.println("three method");
		
	}
	public void m5(int a, int b,int c,int d) {
		System.out.println("four method");
		
	}
	public static void main(String[] args) {
		thismethod th=new thismethod();
		th.m2(12);
	}

}
