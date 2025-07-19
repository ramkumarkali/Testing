package week4.day1;

public class Learnoverloading {
	
	public static void reportStep(String msg, String status) {
		System.out.println(msg+status);
	}
	
	public static void reportStep(String msg, String status,boolean snap) {
		if(snap =true) {
			System.out.println(msg+status);
		}else {
			System.out.println("test");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Learnoverloading l1 = new Learnoverloading();
		
		l1.reportStep("hi ram", "you have passed");
		l1.reportStep("hi ram ", "you have selected", true);

	}

}
