/**
 * ���ӳ������⣺���ӵ�һ��ժ�����ɸ����ӣ���������һ�룬����񫣬�ֶ����һ�� �ڶ��������ֽ�ʣ
�µ����ӳԵ�һ�룬�ֶ����һ�����Ժ�ÿ�����϶�����ǰһ��ʣ�� 
��һ����һ��������10���������ٳ�ʱ����ֻʣ��һ�������ˡ����һ�칲ժ�˶��١� 
 */
package Day7;

import tool.Print;

public class Monkey {
	public static void main(String[] args){
		int sum = 1;
		for(int i = 0; i < 9; i++){
			sum = (sum + 1) * 2;
		}
		System.out.println("the total number is " + sum);
		//Print.println("the total number is " + sum);
	}

}
