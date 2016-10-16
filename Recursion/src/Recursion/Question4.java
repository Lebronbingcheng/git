/**
 * 某路公共汽车，总共有八站，从一号站发轩时车上已有n位乘客，到了第二站先下一半乘客，
 * 再上来了六位乘客；到了第三站也先下一半乘客，再上来了五位乘客，
 * 以后每到一站都先下车上已有的一半乘客，再上来了乘客比前一站少一个??，
 * 到了终点站车上还有乘客六人，问发车时车上的乘客有多少？
 */
package Recursion;

public class Question4 {
	public static void main(String[] args){
		System.out.println("the original number of passngers is " + count(7, 6));
	}
	
	public static int count(int stop, int left){
		if(stop == 1){
			return left;
		}
		return count(stop - 1, 2 * (left - 8 + stop));
	}

}
