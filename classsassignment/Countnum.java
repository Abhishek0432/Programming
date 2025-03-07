package classsassignment;

import java.util.Arrays;

public class Countnum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[]arr = {13,14,18,17,21,22};
		int n = 14;
		Arrays.sort(arr);
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>n) {
				count++;
			}
		}
		System.out.println("total no greater then specific value are " +count);

	}

}
