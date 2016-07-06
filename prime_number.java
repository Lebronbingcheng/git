package HelloWorld;
public class prime_number {

	public static void main(String[] args){
		int testNum = 10;
		int result = primeTest(testNum);
		if(result == 0){
			System.out.println(testNum+" is not prime number");
			return;
		}
	    System.out.println(testNum+" is prime number");	
	}
	
	public static int primeTest(int testNum){
		int[] array = new int[testNum-2]; 
		
		for(int b=2,n=0;b<testNum;b++,n++){
			array[n] = testNum%b;
			//System.out.println(array[n]);
		}
		int result = array[0];
		for(int num=1;num<testNum-2;num++){
			result = result* array[num]; 
			//System.out.println(result);
		}
		return result;
	}

}
