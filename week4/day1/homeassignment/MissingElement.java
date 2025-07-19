package week4.day1.homeassignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int arr[] = {1, 2, 3, 4, 10, 6, 8};
//		
//		Arrays.sort(arr);
//		
//		for(int i=0;i<arr.length;i++) {
//			
//		}
		List<Integer> li = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 10, 6, 8));
		
		Collections.sort(li);
		
		System.out.println(li);
		
		for(int i=0;i<li.size()-1;i++) {
			int curr = li.get(i);
			int next = li.get(i+1);
			
			if(curr+1!=next) {
				for(int miss =curr+1;miss<next;miss++) {
					System.out.println("Missing number: " + miss);
				}
			}
		}
	}

}
