/**
 * ���ӳ��ҡ���һȺ����ժ����һ�����ӣ������涨ÿ��ֻ׼��һ���һֻ�����ڶ����ʣ�µ�һ���һֻ���Դ����ƣ���
 * �ھ������ó��꣬�ʺ�����ժ���˶������ӣ�
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
