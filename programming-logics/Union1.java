package com.Jspiders.Jft;

import java.util.Arrays;
import java.util.HashSet;

public class Union1 {

	public static void main(String[] args) {
		Integer[]arr1 = {2,3,2,4,6,76};
		Integer[]arr2 = {5,8,9,0,2,1};
		union(arr1,arr2);
	}
	public static void union(Integer[] arr1,Integer[] arr2) {
		HashSet<Integer> s = new HashSet<>();
		s.addAll(Arrays.asList(arr1));
		s.addAll(Arrays.asList(arr2));
		Integer[]arr = {};
		arr = s.toArray(arr);
		System.out.println(s);
		System.out.println("union of arrays:"+Arrays.toString(arr));
	}

}
