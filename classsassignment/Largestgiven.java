package classsassignment;

import java.util.Arrays;

public class Largestgiven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr = {18,17,23,54,14,33,21};
		int n = 18;
		Arrays.sort(arr);
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]==n) {
				System.out.println(arr[i]-1);
				break;
			}
		}

	}

}
