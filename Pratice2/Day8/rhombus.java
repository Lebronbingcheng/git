package Day8;

public class rhombus {
	public static void main(String[] args){
		for(int line = 1; line <= 4 ;line++){
			for(int space = 0; space < 5 - line; space++)
				System.out.print(" ");
				for(int star = 0; star < line * 2 - 1; star++)
					System.out.print("*");
					System.out.println();			
		}
		for(int i = 1; i <= 3; i++){
			for(int s = 0; s < i+1; s++)
				System.out.print(" ");
			for(int k = 0; k < 2 * (4 - i) - 1; k++)
				System.out.print("*");
			    System.out.println();	
		}
	}

}
