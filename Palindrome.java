import java.util.Scanner;

public class Palindrome {

	public static boolean checkPalindrome(String s) {
		s=s.toLowerCase();
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(s.length()-1-i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		System.out.println(checkPalindrome(s));
		sc.close();
	}

}
