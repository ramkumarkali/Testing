package week4.day1.homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 2, 11, 4, 9, 7};
		Arrays.sort(arr);
		
		List<Integer> li = new ArrayList<Integer>();
		
		for(int i=0;i<arr.length;i++) {
			li.add(arr[i]);
		}
		System.out.println("Second largest element :"+li.get(li.size()-2));
	}

}
