import java.util.Scanner;

public class ReverseAString {
	public static String reverse(String s) {
		String r="";
		for(int i=0;i<s.length();i++) {
			r=s.charAt(i)+r;
		}
		return r;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		System.out.println("Initial String:"+s);
		String r=reverse(s);
		System.out.println("After reverse:"+r);
		sc.close();
	}

}
