/**
 * ��һ���������ֽ������������磺����90,��ӡ��90=2*3*3*5�� 
 */

package Day2;

public class primeFactorize {
	public static void main(String[] args){
		for(int testNum = 1; testNum <=100; testNum++){
			factorizeResult(testNum);
			System.out.println();
		}
		
		
	}
	public static void factorizeResult(int testNum){
		if(judgeisPrime(testNum) == true || testNum == 2){
			System.out.print(testNum + " = 1 * "+testNum);
		}else{
		int[] minPrime = new int[] {2,3,5,7};
		System.out.print(testNum+" = 1");
		for(int i = 0; i <= 3; i++){
			int b = testNum % minPrime[i];
			if(b == 0){				
				testNum = testNum / minPrime[i];
				System.out.print(" * " + minPrime[i]);
				i = -1;                                       //��i���¸�ֵ�����¿�ʼִ��ѭ��
				if(judgeisPrime(testNum) == true){
					System.out.print(" * " + testNum);
					break;
				}
			}
		}
	    }
	}
	
	public static boolean judgeisPrime(int testNum){
		int[] res = new int[300];
		for(int i = 2, a = 0; i < testNum; i++, a++){
			res[a] = testNum%i;
		}
		int zeroNum = 0;
		for(int pos = 0; pos <testNum-2; pos++){
			int resNum = res[pos];
			if(resNum == 0){
				zeroNum++;
			}
		}
		if(zeroNum != 0){
			return false;
		}else{
			return true;
		}
	}

}
