/**
 * �˶��Ὺ��N�죬һ����������Mö����һ�췢����1ö��ʣ�µ��߷�֮һö��
 * �ڶ��췢����2ö��ʣ�µ��߷�֮һö��
 * ��3�췢����3ö��ʣ�µ��߷�֮һö���Ժ�ÿ�춼�մ˰���
 * ���˵�N��պû��н���Nö�����˽���ȫ�����ꡣ�����N��M
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
