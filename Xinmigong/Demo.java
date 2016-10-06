package Xinmigong;

public class Demo {
	public static void main(String[] args){
		int[][] mg = {
				{1,1,1,1,1,1},
		        {1,0,0,0,1,1},
		        {1,0,1,0,0,1},
		        {1,0,0,0,1,1},
		        {1,1,0,0,0,1},
		        {1,1,1,1,1,1}
		};
		Migong mdg = new Migong(mg);
		mdg.Zoumigong(1, 1, 4, 4);
	}
}
