/**
 * ��5��������һ���ʵ�����˶����ꣿ��˵�ȵ�4���˴�2�ꡣ�ʵ�4������������˵�ȵ�3���˴�2�ꡣ��
�������ˣ���˵�ȵ�2�˴����ꡣ�ʵ�2���ˣ�˵�ȵ�һ���˴����ꡣ����ʵ�һ���ˣ���˵��10�ꡣ���ʵ����
�˶�� 
 */
package DAY10;

public class Apply {
	public static void main(String[] args){
		int[] age = new int[5];
		age[0] = 10;
		int finalAge = 0; 
		for(int i = 1; i <= 4; i++){
			age[i] = age[i-1] + 2;
			finalAge = age[i];
		}
		System.out.println("the age of the fifth child is " + finalAge);
	}

}
