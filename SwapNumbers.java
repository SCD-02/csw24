
public class SwapNumbers {
	public static int[] swap(int a[],int i, int j) {
		a[i]=a[i]+a[j];
		a[j]=a[i]-a[j];
		a[i]=a[i]-a[j];
		return a;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,2,3,4,5};
		swap(a,1,3);
		for(int e:a) {
			System.out.print(e+" ");
		}

	}

}
