import java.util.Scanner;

public class RemoveWhiteSpace {

	public static String removeSpace(String s) {
		char c[]=s.toCharArray();
		String ts="";
		for(int i=0;i<c.length;i++) {
			if(c[i]!=' ') {
				ts=ts+c[i];
			}
		}
		return ts;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the INPUT:");
		String s=sc.nextLine();
		System.out.println("After trimed: "+removeSpace(s));
		sc.close();
	}

}
