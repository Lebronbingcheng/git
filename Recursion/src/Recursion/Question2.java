/**
 * 国王分财产。某国王临终前给儿子们分财产。他把财产分为若干份，然后给第一个儿子一份，
 * 再加上剩余财产的1/10；给第二个儿子两份，再加上剩余财产的1/10；??；
 * 给第i个儿子i份，再加上剩余财产的1/10。每个儿子都窃窃自喜。
 * 以为得到了父王的偏爱，孰不知国王是“一碗水端平”的。
 * 请用程序回答，老国王共有几个儿子？财产共分成了多少份？
 */
package Recursion;

public class Question2 {
	public static void main(String[] args){
		for(int i = 2; i < 100; i++){
			if(count(1, i) != 0){
				System.out.print("The number of son is " + count(1, i));
				System.out.println();
				System.out.print("The assert is divided to  " + i);
				System.out.println();
			}
		}	
	}
	
	public static int count(int bros, int num){
		if(num == 0) {
			return bros - 1;
		}
		if((num - bros) % 10 != 0) {
			return 0;
		}
		if(bros > num){
			return 0;
		}
		num = (9 * (num - bros)) / 10;
		return count(bros + 1, num);
	}
}
