package week1.day2.homeassignment;

public class Palindrome {
	public static void Ispalin(int n) {
		int original = n;
		int reverse = 0;
		for(int i=n;i>0;i = i/10) {
			int num = i%10;
			reverse = reverse*10+num;
			
		}
		System.out.println(reverse);
		if(reverse == original) {
			System.out.println("palindrome");
		}else {
			System.out.println("Not a palindrome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Ispalin(121);

	}

}
