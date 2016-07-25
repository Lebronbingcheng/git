/**
 * Çó1+2!+3!+...+20!µÄºÍ 
 */
package DAY9;

public class Sum2 {
	public static void main(String[] args){
		int result = 0;
		for(int i = 1; i <= 20; i++){
			int k = multiply(i);
			result += k;
		}
		System.out.println("the result is " + result);
	}
	
	
	public static int multiply(int n){
		int result = 1;
		for(; n > 0 ; n--){
			result = result * n;
		}
		return result;
	}

}
