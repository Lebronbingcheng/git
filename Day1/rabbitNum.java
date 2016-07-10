package Day1;

public class rabbitNum {
	public static void main(String[] args){
		for(int month = 1; month <= 40; month++){
			int rabbit_Num = number(month);
			System.out.println("the number of Rabbit is "+" "+rabbit_Num );	
		}	
	}
	
	public static int number(int month){
		int[] rabbitNum = new int[100];
		rabbitNum[1] = 1;
		rabbitNum[2] = 1;
		for(int i = 3; i < 100; i++){
			rabbitNum[i] = rabbitNum[i-1] + rabbitNum[i-2];
		}
			return rabbitNum[month];
	}

}
