/**
 * ��һ�������У�2/1��3/2��5/3��8/5��13/8��21/13...���������е�ǰ20��֮��
 */
package DAY9;

public class Sum {
	public static void main(String[] args){
		int a = 2;
		int b = 1;
		double result = 0;
		for(b = 1; b <= 21; a++, b++){
			result += a/b;
		}
		System.out.println("the result is " + result);
	}
}

