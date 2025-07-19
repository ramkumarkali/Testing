package week4.day1;

public class Learoverriding extends Learnoverloading {
	
	public static void reportStep(String msg, String status) {
		System.out.println(msg+status);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learoverriding l2 = new Learoverriding();
		l2.reportStep("hi ramk ", "you passed");

	}

}
