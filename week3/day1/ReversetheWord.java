package week3.day1;

public class ReversetheWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "I am a software tester";
		
		
		String word[] = str1.split(" ");
		
		for(int i=0;i<word.length;i++) {
			if(i%2!=0) {
				char ch[] = word[i].toCharArray();
				
				for(int j=ch.length-1;j>=0;j--) {
					System.out.print(ch[j]);
				}
			}else {
				System.out.print(word[i]);
			}
			System.out.print(" ");
		}

	}

}
