import java.util.Scanner;

public class AddTwoBigNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.next();
		String s2=sc.next();
		int i1=s1.length()-1,i2=s2.length()-1;
		while(i1!=0||i2!=0) {
			int n=((int)s1.charAt(i1)+(int)s2.charAt(i2));
		}
	}

}
