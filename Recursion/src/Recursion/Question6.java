/**
 * 小华读书。第一天读了全书的一半加二页，第二天读了剩下的一半加二页，以后天天如此??，
 * 第六天读完了最后的三页，问全书有多少页？
 */
package Recursion;

public class Question6 {
	public static void main(String[] args){
		System.out.println("The total number of pages of a book is " + count(5, 3));
	}
	
	public static int count(int day, int left) {
		if(day == 0){
			return left;
		}
		return count(day - 1, 2 * (left + 1));
	}
}
