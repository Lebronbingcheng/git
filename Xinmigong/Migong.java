package Xinmigong;

import java.util.Stack;

public class Migong {
	int[][] mg;
	int end_x;
	int end_y;
	
	public Migong(int[][] mg){
		this.mg = mg;
	}
	
	public void depthTravel(int i, int j){
		System.out.print("(" + i + "," + j + ")");
		mg[i][j] = 2;
		if(up(i, j) == 0){
			depthTravel(i-1, j);
		}
		if(down(i, j) == 0){
			depthTravel(i+1, j);
		}
		if(left(i, j) == 0){
			depthTravel(i, j-1);
		}
		if(right(i, j) == 0){
			depthTravel(i, j+1);
		}
		//mg[i][j] = 0;
	}
	
	public void printMg(int[][] mg){
		for(int i = 0; i < mg.length; i++){
			for(int a = 0; a < mg[i].length; a++){
				System.out.print(mg[i][a] + " ");
			}
			System.out.println();
		}
	}

	Stack<Point> paths = new Stack<Point>();
	public void Zoumigong(int start_x, int start_y, int end_x, int end_y){
		this.end_x = end_x;
		this.end_y = end_y;
		Zoumigong(start_x,start_y);
	}
	public void Zoumigong(int start_x, int start_y){
		if(start_x == end_x && start_y == end_y){
			for(int s = 0; s < paths.size(); s++){
				System.out.print("[" + paths.get(s).x + "," + paths.get(s).y + "]");
			}
			System.out.println();
			return;
		}else{
			if(right(start_x, start_y) == 0){
				paths.push(new Point(start_x, start_y+1));
	            mg[start_x][start_y] = 2;
	            mg[start_x][start_y+1] = 2;
                Zoumigong(start_x, start_y+1);
                mg[start_x][start_y+1] = 0;
                mg[start_x][start_y] = 0;
                paths.pop();  
			}
			if(left(start_x, start_y) == 0){
				paths.push(new Point(start_x, start_y-1));
                mg[start_x][start_y-1] = 2;
                mg[start_x][start_y] = 2;
                Zoumigong(start_x, start_y-1);
                mg[start_x][start_y-1] = 0;
                mg[start_x][start_y] = 0;
                paths.pop();  
			}
			if(up(start_x, start_y) == 0){
				paths.push(new Point(start_x-1, start_y));
				mg[start_x-1][start_y] = 2;
                mg[start_x][start_y] = 2;
                Zoumigong(start_x-1, start_y);
                mg[start_x-1][start_y] = 0;
                mg[start_x][start_y] = 0;
                paths.pop();  
			}
			if(down(start_x, start_y) == 0){
				paths.push(new Point(start_x+1, start_y));
                mg[start_x+1][start_y] = 2;
                mg[start_x][start_y] = 2;
                Zoumigong(start_x+1, start_y);
                mg[start_x+1][start_y] = 0;
                mg[start_x][start_y] = 0;
                paths.pop();  
			}
		}
	}
		
	
	private int up(int i, int j){
		if(i == 0){
			return -1;
		}
		return mg[i-1][j];
	}
	
	private int down(int i, int j){
		if(i == mg.length){
			return -1;
		}
		return mg[i+1][j];
	}
	
	private int left(int i, int j){
		if(j == 0){
			return -1;
		}
		return mg[i][j-1];
	}
	
	private int right(int i, int j){
		if(j == mg.length){
			return -1;
		}
		return mg[i][j+1];
	}
}
