/**
 * ���۽������⣺��һ������ȫ�������һ��Ӷ���֮һ�����㣻�ڶ�������������������֮һ������֮һ�����㣻
 * ����������ʣ�������ķ�֮һ���ķ�֮һ�����㣻
 * ���Ĵ�����ʣ���������֮һ�����֮һ�����㣻���ڻ�ʣ��11�����㣬��
 * ���۽���ʱ���ܰѽ����п��������κ�����ġ����������ԭ�ж��������㣿
 */
package Recursion;

public class Question3 {
	public static void main(String[] args) {
		System.out.println("the original number of fishes is " + count(4, 11));
	}
	
	public static int count(int time, int left){
		if(time == 0){
			return left;
		}
		return count(time - 1, (((time + 1) * left) + 1) / time);
	}
}
