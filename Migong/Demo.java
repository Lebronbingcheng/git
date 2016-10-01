package Migong;

import java.util.List;

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
		Migong m = new Migong(mg);
		int[][] edge = m.edge;
		Node[] array = m.array;
		//m.depTravel(array[0], edge, array);
		System.out.println();
		System.out.println("............................");
		List<Node> list = m.findPath(array[0], array[array.length-1]);
		for(Node a : list){
			System.out.print("(" + a.x + "," + a.y + ")");
		}
	}
}
