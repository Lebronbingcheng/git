package HelloWorld;

public class Febonaci{

	public static void main(String[] args){
		int N = 40;
		int[] a = new int[N];
		a[0] = 0;
		a[1] = 1;
		for(int n = 2; n < N; n++){
			a[n]=a[n-1]+a[n-2];
		}
		for(int num=0;num<N;num++){
		System.out.println(a[num]);
		}
		
	}

}
