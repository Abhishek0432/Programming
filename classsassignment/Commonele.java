package classsassignment;

public class Commonele {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {1,2,3,4,5};
		int[]arr1 = {4,5,6,7,8};
		System.out.println("common elements::");
//		int []arr2 = {7,8,9,10,11};
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr1.length; j++) 
			{
				if(arr[i]==arr[j]) {
					System.out.println(arr[j]);
				}
//				for (int j2 = 0; j2 < arr2.length; j2++)
//				{
					
//				}
			}
		}
	}

}
