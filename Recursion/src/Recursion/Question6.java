/**
 * С�����顣��һ�����ȫ���һ��Ӷ�ҳ���ڶ������ʣ�µ�һ��Ӷ�ҳ���Ժ��������??��
 * �����������������ҳ����ȫ���ж���ҳ��
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
