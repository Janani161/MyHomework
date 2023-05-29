package week1.day1.assignment;

public class fibonacci {

	public static void main(String[] args) {
		// to Print Fibonacci series for first 11 numbers
//0  1  1  2  3  5  8  13  21  34  55  89  144
		int firstNum = 2;
		int secNum = 3;
		int sum = 5;
		System.out.println(firstNum);
		System.out.println(secNum);
		for(int i = 1; i<=11; i++)
			 sum = firstNum+secNum;
		firstNum=secNum;
		secNum=sum;
		System.out.println(sum);

	}

}
