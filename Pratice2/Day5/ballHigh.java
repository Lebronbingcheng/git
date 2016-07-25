package Day5;

public class ballHigh {
	public static void main(String[] args){
		System.out.println("the total distance is " + total(10));		
		System.out.println("the high is " + high(10));
	}
	
	public static double total(int bit){
		double high = 100;
		double road = 0;
		for(int i = 1; i <= bit; i++){					
			road = road + high;
			high = high/2;	
		}
		return road;
	}
	
	public static double high(int bit){
		double high = 100;
		double road = 0;
		for(int i = 1; i <= bit; i++){					
			road = road + high;
			high = high/2;	
		}
		return high;
	}

}
