package Shortest;

public class Demo {
	public static void main(String[] args){
		Graph g = new Graph(1,2,3,4,5);
		g.creatEdge(1, 4, 3);
		g.creatEdge(1, 5, 12);
		g.creatEdge(2, 4, 23);
		g.creatEdge(2, 5, 23);
	    g.creatEdge(4, 3, 34);
	    g.creatEdge(4, 5, 2);
	    g.printEdgeArray();
	    System.out.println();
	    System.out.println("...............................................");
		int[] array = g.Dijkstra(1);
		System.out.println("1的最短路径是：");
		for(int i : array){
			if(i == 9999){
				System.out.print("MAX ");
			}else{
				System.out.print(i + " ");
			}
		}

	}
}
