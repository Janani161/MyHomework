package week3.day1;

public class Calculator {
	
	public void add(int a, int b)
	{
		int ans=a+b;
		System.out.println("Addition of 2 integers is");
		System.out.println(ans);
	}
	public void add(int a, int b, int c)
	{
		System.out.println("Addition of 3 integers is");
		int ans1=a+b+c;
		System.out.println(ans1);
	}
public void multiple(double d, double e)
{
	System.out.println("Multiplication of 2 values is ");
	double ans2=d*e;
	System.out.println(ans2);
}
public void multiple(float f, float g)
{
	System.out.println("Multiplication of 3 values is ");
	float ans3=f*g;
	System.out.println(ans3);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator C = new Calculator();
		C.add(2,5);
		C.add(2, 5, 1);
		C.multiple(5, 5);
		C.multiple(1.8, 1.7);
		
	}

}
