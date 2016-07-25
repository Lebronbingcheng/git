/**
 * 利用递归方法求5!
 */
package DAY10;

public class FiveMu {
	public static void main(String[] args){
		System.out.println("the result is " + mu(2));
	}
	
	public static int mu(int n){
		int value = 0;
		if (n == 1 || n==0){
			value = 1;
		}else if(n > 1){
			value = n * mu(n-1);
		}
		return value;
	}
}
