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
	
	/*�ж϶��Ƿ�Ϊ��*/
	public boolean isEmpty(){
		return heapSize == 0;
	}
	
	/*����iλ�ýڵ�Ϊ�����������������*/
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
	
	/*����iλ�ýڵ�Ϊ���������������С��*/
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

	/*����MaxHeap*/
	public void buildMaxHeap(){
	    for(int i = heapSize/2 - 1; i >= 0; i--){
	        maxify(i);
	    }
	}
	
	/*����MinHeap*/
	public void buildMinHeap(){
		for(int i = heapSize/2 - 1; i >= 0; i--){
	        minify(i);
	    }
	}
	
	/*MaxHeap������*/
	public void heapSort(){
		for(int i = 0; i < heap.length; i++){
		    int temp = heap[0];
		    heap[0] = heap[heapSize-1];
		    heap[heapSize-1] = temp;
		    heapSize--;
		    maxify(0);
		}
	}
	
	/*��ӡ���е�Ԫ��*/
	public void printHeap(){
		int[] array = getHeap();
		for(int i = 1; i < array.length; i = i * 2){
		    for(int k = i-1; k <2*(i)-1 && k < array.length; k++){
		        System.out.print(array[k]+" ");
		    }
		    System.out.println();
		}    
	}
	
	/*��ӡ����������*/
	public void printAfterSort(){
		int[] array = getHeap();
		for(int i = 0; i < array.length; i++){
			System.out.print(array[i] + " ");
		}
	}
	
	/*��ȡ���е����Ԫ��*/
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
	
	/*�ڶ������һ������*/
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
	
	/*�ڶ���ɾ��һ������*/
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
