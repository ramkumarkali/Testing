package week1.day2.homeassignment;

public class IsPrimeNumber {
	
	public static boolean Ismain(int n) {
		if(n>1) {
			return true;
		}
		for(int i =2;i<=n-1;i++) {
			if(n%i == 0) {
				return false;
				}
		}
		return true;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean res = Ismain(1);
		if(res == true) {
			System.out.println("Prime");
		}else {
			System.out.println("Not Prime");
		}
		

	}

}
