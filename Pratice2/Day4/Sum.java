/**
 * ��s=a+aa+aaa+aaaa+aa...a��ֵ������a��һ�����֡�����2+22+222+2222+22222(��ʱ����5�������)��
����������м��̿��ơ� 
 */
package Day4;

public class Sum {
	public static void main(String[] args){
		System.out.println(sum(11,2));
	}
	
	public static int sum(int a, int b){
		if(a >= 10 || b <= 0){
			System.out.println("������������");
		}
		int firstNum = 1;
		int n0 = 1;
		int n1 = 0;
		int k = n1 + firstNum;
		for(int i = 1; i < b; i++){
			n1 = n0 + (int)Math.pow(10,i);
			k = n1 + k;
			n0 = n1;
		}
		return k * a;
	}
}
