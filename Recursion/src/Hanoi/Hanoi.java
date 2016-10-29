package Hanoi;

public class Hanoi {
	 public void hanoi(int n, char origin, char assist, char destination) {
	        if (n == 1) {
	            move(origin, destination);
	        } else {
	            hanoi(n - 1, origin, destination, assist);
	            move(origin, destination);
	            hanoi(n - 1, assist, origin, destination);
	        }
	    }
	 
	    private void move(char origin, char destination) {
	        System.out.println("Direction:" + origin + "--->" + destination);
	    }
	 
	    public static void main(String[] args) {
	        Hanoi hanoi = new Hanoi();
	        hanoi.hanoi(3, 'A', 'B', 'C');
	    }
}
