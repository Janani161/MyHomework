package day2.assigment2;

public class FindIntersection {

	public static void main(String[] args) {
		int[] element1 = {3,2,11,4,6,7};
		int [] element2= {1,2,8,4,9,7};
		if(element1.length==element2.length)
		{
			System.out.println("Intersection of two arrays is");
		for(int i=0;i<element1.length;i++)
		{
			for(int j=0;j<element2.length;j++)
			{
				if(element1[j]==element2[i])
				{
				

					System.out.println(element1[i]);
			}
					
		}

	}
	}
		else
			System.out.println("none");
}
}
