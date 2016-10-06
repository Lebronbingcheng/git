package Xinmigong;

import java.util.Stack;

public class Migong {
	int[][] mg;
	
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
	Stack<Integer> map = new Stack<Integer>();
	public void Zoumigong(int i, int j, int a, int b){
		if(i == a && j == b){
			for(int s = map.size() - 1; s >= 0; s -= 2){  
                System.out.print("[" + map.get(s-1) + "," + map.get(s) + "]");  
            }  
            System.out.println();  
            return;  
		}else{
			if(right(i, j) == 0){
				map.push(i);  
	            map.push(j+1); 
	            mg[i][j] = 2;
	            mg[i][j+1] = 2;
                Zoumigong(i, j+1, a, b);
                mg[i][j+1] = 0;
                mg[i][j] = 0;
                map.pop();  
                map.pop();  
			}
			if(left(i, j) == 0){
				map.push(i);  
                map.push(j-1);  
                mg[i][j-1] = 2;
                mg[i][j] = 2;
                Zoumigong(i, j-1, a, b);
                mg[i][j-1] = 0;
                mg[i][j] = 0;
                map.pop();  
                map.pop();  
			}
			if(up(i, j) == 0){
				map.push(i-1);  
                map.push(j);  
                mg[i-1][j] = 2;
                mg[i][j] = 2;
                Zoumigong(i-1, j, a, b);
                mg[i-1][j] = 0;
                mg[i][j] = 0;
                map.pop();  
                map.pop();  
			}
			if(down(i, j) == 0){
				map.push(i+1);  
                map.push(j);  
                mg[i+1][j] = 2;
                mg[i][j] = 2;
                Zoumigong(i+1, j, a, b);
                mg[i+1][j] = 0;
                mg[i][j] = 0;
                map.pop();  
                map.pop();  
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
