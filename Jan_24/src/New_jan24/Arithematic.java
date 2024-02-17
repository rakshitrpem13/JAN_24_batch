package New_jan24;

public class Arithematic {
	
	public int sum(int a, int b) 
	{
		int c;
		c=a+b;
		System.out.println("the value of c is"+c);
		return c;
		
	}
	public int mul(int x, int y) 
	{
		int z;
		z=x*y;
		System.out.println("the value of z is"+z);
		return z;
		
	}
	public int sub(int c,int d) 
	{
		int e;
		e=c-d;
		System.out.println("the value of e"+e);
		return e;
	}
	public void div(int h,int i) 
	{
		int j;
		j=h/i;
		System.out.println("the value of j"+j);
	}
	public static void main(String[] args) 
	{
		Arithematic ar = new Arithematic();
		int sumresult =ar.sum(10,2);
		int sumresult1=ar.sum(sumresult, 2);
		int subresult= ar.sub(sumresult1, 2);
		int mulresult=ar.mul(subresult,2);
		ar.div(mulresult,2);
		
				
	}
	
	
}
