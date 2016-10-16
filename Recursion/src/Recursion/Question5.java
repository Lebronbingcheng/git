/**
 * 猴子吃桃。有一群猴子摘来了一批桃子，猴王规定每天只准吃一半加一只（即第二天吃剩下的一半加一只，以此类推），
 * 第九天正好吃完，问猴子们摘来了多少桃子？
 */
package Recursion;

public class Question5 {
	public static void main(String[] args) {
		System.out.println("the orginal number of peach is " + count(9, 0));
	}
	
	public static int count(int day, int left) { 
		if(day == 0){
			return left;
		}
		return count(day - 1,2 * (left + 1));
	}
	
}
