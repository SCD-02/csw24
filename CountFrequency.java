import java.util.Scanner;

public class CountFrequency {
	
	public static int countFrequency(int n,int k) {
		int a[]=new int [10];
		int test=n;
		for(int i=test;i>0;i++) {
			a[test%10]++;
			test=test/10;
		}
		return a[k];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n=sc.nextInt();
		System.out.print("Enter the key: ");
		int k=sc.nextInt();
		System.out.println(countFrequency(n,k));
		sc.close();
	}

}
