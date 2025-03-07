package classsassignment;

import java.util.Arrays;

public class Countpositive {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {12,23,12,-1,34,-2,-3};
		Arrays.sort(arr);
		int count=0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>0) {
				count++;
				System.out.println(arr[i]);
				
			}
		}
		System.out.println(count);

	}

}
