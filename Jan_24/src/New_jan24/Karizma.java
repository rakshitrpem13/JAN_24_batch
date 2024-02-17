package New_jan24;

public class Karizma {
	int a;
	int b;
	public void display1() {
		System.out.println("welcome to all of you");
		
	}
	public void display2() {
		System.out.println("automation is easy");
	}
	public static void main(String[] args) {
		Karizma k = new Karizma();
		k.display1();
		k.display2();
		k.a=122;
		k.b=123;
		System.out.println("value of a is"+k.a);
		System.out.println("value of b"+k.b);
		
	}

}
