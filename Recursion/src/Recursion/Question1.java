/**
 * 运动会开了N天，一共发出金牌M枚。第一天发金牌1枚加剩下的七分之一枚，
 * 第二天发金牌2枚加剩下的七分之一枚，
 * 第3天发金牌3枚加剩下的七分之一枚，以后每天都照此办理。
 * 到了第N天刚好还有金牌N枚，到此金牌全部发完。编程求N和M
 */
package Recursion;

public class Question1 {
	public static void main(String[] args){
		for(int i = 2; i < 50; i++){
			if(count(1, i) != 0){
				System.out.print("The total number of Golden is " + i + " ");
				System.out.println();
				System.out.print("The game lasts for  " + count(1, i));
				System.out.println();
			}
		}	
	}
	
	public static int count(int day, int M){
		if(day == M){
			return day;
		}
		if(day > M){
			return 0;
		}
		if((M - day) % 7 != 0) {
			return 0;
		}
		int N = day + (M - day) / 7;
		return count(day + 1, M - N);
	}
}
