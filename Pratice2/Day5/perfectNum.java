package Day5;

public class perfectNum {
	public static void main(String[] args){
		System.out.println("the list of perfect number");
		for(int i = 1; i < 1000; i++){
			if(judgeisPerNum(i)){
				System.out.print(i + " ");
			}
		}
	}
	
	public static boolean judgeisPerNum(int testNum){ 
		if(judgeisPrime(testNum) || testNum <= 0){
			return false;
		}else{
			int result = 0;
			int k = 2;
			while(k <= testNum){
				if(testNum % k == 0){
					result = result + k;
				}
				k++;
			}
			result = (result + 1)/2;
			return result == testNum;
		}
	}
	
	public static boolean judgeisPrime(int testNum){
		for(int i = 2, a = 0; i < testNum; i++, a++){
			if(testNum%i == 0){
				return false;
			}
		}
		return true;
	}
}
