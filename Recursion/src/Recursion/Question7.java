/**
 * �ձ�������ѧ��Ϸר���д����������������һ�����⣺���׽�2520�����ӷָ��������ӡ�
 * ���� ����˵�����ϴ󽫷ָ���Ľ��ӵ�1/8���϶����϶��õ�����ͬԭ�ȵĽ��ӷ�1/7��������
 * �����õ�����ͬԭ�ȵĽ��ӷ�1/6�����ģ������õ�����ͬԭ�ȵĽ��ӷ�1/5�����壻
 * �����õ�����ͬԭ�ȵĽ��ӷ�1/4�������������õ�����ͬԭ�ȵĽ��ӷ�1/3���ϴ󡱡�
 * ���������еĽ�������һ���ࡣ�����ֵ�ԭ�����и��ж��ٽ��ӣ�
 */
package Recursion;

public class Question7 {
	public static void main(String[] args){
		for(int i = 1; i < 7; i++){
			System.out.print("the" + i + "-th man has " + count(1, i, 240) + " oranges at the beginning");
			System.out.println();
		}
	}
	
	public static int count(int last, int bro, int last_num){
		if(bro == 1){
			return 240;
		}
		if(bro == last + 1){
			return (420 * (8 - last) * (9 - last) - (7 - last) * last_num) / ((7 - last) * (9 - last));
		}
		return count(last + 1, bro, (420 * (8 - last)) / (7 - last));
	}


}
