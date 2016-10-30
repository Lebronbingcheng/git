package EightQueen;

public class Queen {
	int n;
	int[] queen;
	
	public Queen(int n) {
		this.n = n;
		this.queen = new int[n];
		for(int a : queen) {
			a = -1;
		}
	}
	boolean re = false;
	public void putQueen(int row) {
		if(row == n) {
			print();
			re = true;
		}
		else{
			for(int col = 0; col < n; col++) {
				if(re) break;
				if(isSafe(row, col)){
					queen[row] = col;
					putQueen(row + 1);
				}
			}
		}
	}
	
	private boolean isSafe(int row, int col) {
		for(int i = 0; i < row; i++) {
			if(queen[i] == col || queen[i] - i == col - row || queen[i] + i == col + row){
				return false;
			}
		}
		return true;
	}
	
	public void print() {
		for(int row = 0 ; row < n; row++) {
			for(int col = 0; col < n; col++) {
				if(queen[row] == col) {
					System.out.print("* ");
				}else{
					System.out.print(0 + " ");
				}
			}
			System.out.println();	
		}
		System.out.println("********************");
	}
	
	public static void main(String[] args) { 
		Queen q = new Queen(8);
		q.putQueen(0);
	}
}
