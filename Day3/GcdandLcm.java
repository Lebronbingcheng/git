package Day3;

public class GcdandLcm {

	public static void main(String[] args) {
		for(int a = 200 , b = 1 ; a > 0 ; a-- , b++){
			System.out.print(gcd(a , b));
			System.out.print("  ");
			System.out.print(lcm(a , b));
			System.out.println();
		}



	}
	
	public static int gcd(int testNum1, int testNum2){
		if(testNum1 == testNum2){
			return testNum1;
		}else if(testNum1 < testNum2){
			int a = testNum1;
			testNum1 = testNum2;
			testNum2 = a;
		}
		int r = testNum1 % testNum2;
		if(r == 0){
			return testNum2;
		}
		while(r != 0){
			testNum1 = testNum2;
			testNum2 = r;
			r = testNum1 % testNum2;
		}
		return testNum2;
	}
	public static int lcm(int testNum1 , int testNum2){
		int result = (testNum1 * testNum2) / gcd(testNum1 , testNum2);
		return result;
	}

}
