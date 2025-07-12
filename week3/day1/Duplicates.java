package week3.day1;

public class Duplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "We learn Java basics as part of java sessions in java week1";
		
		int count =0;
		
		String words[] = text.split(" ");
		
		for(int i=0;i<words.length;i++) {
			if(words[i].equals(""))continue;
			for(int j=i+1;j<words.length;j++) {
				if(words[i].equalsIgnoreCase(words[j])) {
					words[j]="";
					count++;
				}
			}
		}
		
		if(count>0) {
			for(String word:words) {
				if(!word.equals("")) {
					System.out.println(word+" ");
				}
			}
			
			System.out.println("Number of duplicates found: "+count);
		}else {
			System.out.println("No duplicates found");
		}

	}

}
