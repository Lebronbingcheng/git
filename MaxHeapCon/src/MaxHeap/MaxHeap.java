package MaxHeap;

public class MaxHeap {
	private int[] heap;
	private int heapSize;
	
	public MaxHeap(){}
	
	public MaxHeap(MaxHeap hp){
		heap = hp.getHeap();
		heapSize = heap.length;
	}

	public MaxHeap(int...args){
		this.heap = args;
		this.heapSize = heap.length;
	}
	
	/*判断堆是否为空*/
	public boolean isEmpty(){
		return heapSize == 0;
	}
	
	/*将以i位置节点为根的子树改造成最大堆*/
	public void maxify(int i){
		int left = Left(i);
		int right = Right(i);
		int max = i;
		if(left < heapSize) max = heap[left] > heap[i] ? left : i;
		if(right < heapSize) max = heap[right] > heap[max] ? right : max;	
		if(max == i || max >= heapSize){
			return;
		}
		int temp = heap[i];
	    heap[i] = heap[max];
	    heap[max] = temp;
	    maxify(max);
	}
	
	/*将以i位置节点为根的子树改造成最小堆*/
	public void minify(int i){
		int left = Left(i);
		int right = Right(i);
		int min = i;
		if(left < heapSize) min = heap[left] < heap[i] ? left : i;
		if(right < heapSize) min = heap[right] < heap[min] ? right : min;
		if(min == i || min < 0 || min >= heapSize){
			return;
		}
		int temp = heap[i];
		heap[i] = heap[min];
		heap[min] = temp;
		minify(min);
	}

	/*构造MaxHeap*/
	public void buildMaxHeap(){
	    for(int i = heapSize/2 - 1; i >= 0; i--){
	        maxify(i);
	    }
	}
	
	/*构造MinHeap*/
	public void buildMinHeap(){
		for(int i = heapSize/2 - 1; i >= 0; i--){
	        minify(i);
	    }
	}
	
	/*MaxHeap堆排序*/
	public void heapSort(){
		for(int i = 0; i < heap.length; i++){
		    int temp = heap[0];
		    heap[0] = heap[heapSize-1];
		    heap[heapSize-1] = temp;
		    heapSize--;
		    maxify(0);
		}
	}
	
	/*打印堆中的元素*/
	public void printHeap(){
		int[] array = getHeap();
		for(int i = 1; i < array.length; i = i * 2){
		    for(int k = i-1; k <2*(i)-1 && k < array.length; k++){
		        System.out.print(array[k]+" ");
		    }
		    System.out.println();
		}    
	}
	
	/*打印排序后的数组*/
	public void printAfterSort(){
		int[] array = getHeap();
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	/*获取堆中的最大元素*/
	public int getMaxNum(){
		buildMaxHeap();
		int max = heap[0];
		int temp = heap[0];
		heap[0]=heap[heapSize-1];
	    heap[heapSize-1]=temp;
	    heapSize--;
	    maxify(0);
	    return max;
	}
	
	/*在堆中添加一个数据*/
	public void insert(int data){
		int[] array = new int[heapSize+1];
		for(int i = 0; i < heap.length; i++){
			array[i] = heap[i];
		}
		array[heap.length] = data;
		heapSize++;
		heap = array;
		buildMaxHeap();
	}
	
	/*在堆中删除一个数据*/
	public void delete(int i){
		if(i < 0 || i > heapSize - 1){
			System.out.println("input wrong index");
			return;
		}
		int temp = heap[i];
		heap[i] = heap[heapSize - 1];
		heap[heapSize - 1] = temp;
		int[] array = new int[heap.length - 1];
		for(int a = 0; a < array.length; a++){
			array[a] = heap[a]; 
		}
		heap = array;
		heapSize--;
		buildMaxHeap();
	}
	
	private int Left(int i){
	    return 2 * i + 1;
	}
	
	private int Right(int i){
	    return 2 * i + 2;
	}
	
	private int Parent(int i){
	    return (i-1)/2;
	}
	
	public int getHeapSize(){
		return heapSize;
	}
	
	public int[] getHeap(){
		return heap;
	}
}
