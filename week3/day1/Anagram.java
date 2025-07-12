package week3.day1;

import java.util.Arrays;

public class Anagram {
  public static void main(String[] args) {
	
	  String str1 = "stops";
	  String str2 = "potss";
	  
	  if(str1.length() != str2.length()) {
		  System.out.println("Lengths mismatch");
	  }
		 
	  char s1[] = str1.toCharArray();
	  char s2[] = str2.toCharArray();
	  
	  Arrays.sort(s1);
	  Arrays.sort(s2);
	  
	  if(Arrays.equals(s1, s2)) {
		  System.out.println("The given strings are Anagram.");
	  }
	  else {
		  System.out.println("The given strings are not an Anagram.");
	  }
	  
}

}
