package day2.assigment2;

public class PrintDuplicatesInArray {

	public static void main(String[] args) {
		
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		System.out.println("Length of array is:");
		int length=arr.length;
		
		System.out.println(length);
		System.out.println("*******************************");
		
for (int i = 0; i < arr.length; i++) 
	//outer loop starts
{
	for(int j=i+1; j<arr.length; j++)
	{
		if(arr[i]==arr[j])
			
	System.out.println(arr[i]);
}
	}
	}

}
