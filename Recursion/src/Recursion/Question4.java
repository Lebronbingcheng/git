/**
 * ĳ·�����������ܹ��а�վ����һ��վ����ʱ��������nλ�˿ͣ����˵ڶ�վ����һ��˿ͣ�
 * ����������λ�˿ͣ����˵���վҲ����һ��˿ͣ�����������λ�˿ͣ�
 * �Ժ�ÿ��һվ�����³������е�һ��˿ͣ��������˳˿ͱ�ǰһվ��һ��??��
 * �����յ�վ���ϻ��г˿����ˣ��ʷ���ʱ���ϵĳ˿��ж��٣�
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
