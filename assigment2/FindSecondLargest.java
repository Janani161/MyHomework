package day2.assigment2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data = {3,2,11,4,6,7};
		
		
Arrays.sort(data);

//elements of array sorted in ascending order

System.out.println("Ascending order is:");

for(int i =0;i<data.length;i++)
	System.out.println(data[i] + "");

System.out.println("*********************************");

  System.out.println("second largest number from array is:" +data[data.length-2]);
	
	}
	}
