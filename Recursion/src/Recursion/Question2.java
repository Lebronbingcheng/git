/**
 * �����ֲƲ���ĳ��������ǰ�������ǷֲƲ������ѲƲ���Ϊ���ɷݣ�Ȼ�����һ������һ�ݣ�
 * �ټ���ʣ��Ʋ���1/10�����ڶ����������ݣ��ټ���ʣ��Ʋ���1/10��??��
 * ����i������i�ݣ��ټ���ʣ��Ʋ���1/10��ÿ�����Ӷ�������ϲ��
 * ��Ϊ�õ��˸�����ƫ�����벻֪�����ǡ�һ��ˮ��ƽ���ġ�
 * ���ó���ش��Ϲ������м������ӣ��Ʋ����ֳ��˶��ٷݣ�
 */
package Recursion;

public class Question2 {
	public static void main(String[] args){
		for(int i = 2; i < 100; i++){
			if(count(1, i) != 0){
				System.out.print("The number of son is " + count(1, i));
				System.out.println();
				System.out.print("The assert is divided to  " + i);
				System.out.println();
			}
		}	
	}
	
	public static int count(int bros, int num){
		if(num == 0) {
			return bros - 1;
		}
		if((num - bros) % 10 != 0) {
			return 0;
		}
		if(bros > num){
			return 0;
		}
		num = (9 * (num - bros)) / 10;
		return count(bros + 1, num);
	}
}
