package Day1;

public class primeNum {
	public static void main(String[] args){
		int testNum = 102;
		int primeNum = 0;
		System.out.println("THE LIST OF PRIME_NUM");	
		for(testNum = 102; testNum<200; testNum++){
		    boolean testResult = judgeisPrime(testNum);
		    if(testResult ==true){
		    	System.out.print(testNum+" ");	
		    	primeNum++;
		    }
		}
		System.out.println();
		System.out.println("The total number is " + primeNum);	
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

