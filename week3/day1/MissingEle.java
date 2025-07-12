package week3.day1;

import java.util.Arrays;

public class MissingEle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr1[] = {1, 4,3,2,8, 6, 7};
		Arrays.sort(arr1);
		
		for(int i=0;i<arr1.length-1;i++) {
			if(arr1[i+1]!=arr1[i]+1) {
				System.out.println("Missing Element : "+(arr1[i]+1));
			}
		}

	}

}
