import java.util.Scanner;

public class CountNoOfWords {

	public static int countWords(String s) {
		s=s.trim();
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=' ') {
				count++;
				while(i<s.length()&& s.charAt(i)!=' ') {
					i++;
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		System.out.println(countWords(s));
		sc.close();
	}

}
