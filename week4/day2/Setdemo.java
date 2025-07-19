package week4.day2;

import java.util.LinkedHashSet;
import java.util.Set;

public class Setdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Google";
		
//		String str2 = str1.toLowerCase();
		
		char ch1[] = str1.toLowerCase().toCharArray();
		
		Set<Character> set1 = new LinkedHashSet<>();
		
		for(int i=0;i<ch1.length;i++) {
			set1.add(ch1[i]);
		}
		
		System.out.println(set1);
		

	}

}
