/**
 * 打印出所有的水仙花数
 */
package Day2;

public class Narcissus {

	public static void main(String[] args) {
		int testNum = 100;
		System.out.println("the list of Narcissus");
		for(testNum = 100; testNum < 1000; testNum++){
			boolean result = judgeisNar(testNum);
			if(result == true){
				System.out.print(testNum+" ");
			}
		}
	}
	public static boolean judgeisNar(int testNum){
		int hunNum = testNum/100;
		int tenNum = (testNum - hunNum*100)/10;
		int unitNum = testNum - hunNum*100 - tenNum*10;
		int narTest = hunNum*hunNum*hunNum + tenNum*tenNum*tenNum + unitNum*unitNum*unitNum;
		if(narTest == testNum){
			return true;
		}else{
			return false;
		}
	}

}
