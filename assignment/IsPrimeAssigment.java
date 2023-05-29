package week1.day1.assignment;

public class IsPrimeAssigment {

	public static void main(String[] args) {
		int n=5; 
		boolean value=false;
		for (int i=2 ; i<=n-1 ; i++)
		{
			
			if(n%i==0)
			{ 
				value = true;
				break;
			}
			
		}
	
		if (value == false)
		{
		
				System.out.println(n+ " is  Prime Number");
		}
		else
		{
			System.out.println(n+ "is not prime number");
		}
		}
	}


