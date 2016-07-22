package Test;

import MaxHeap.MaxHeap;

public class Demo1 {
	public static void main(String[] args){
		int[] array = new int[]{1,2,3,4,6,90,7};
		MaxHeap heap = new MaxHeap(array);
		heap.buildMaxHeap();
		/*heap.heapSort();
		heap.printAfterSort();*/
		//heap.insert(9);
		//heap.delete(0);
		//heap.delete(0);
		heap.printHeap();
		//heap.heapSort();
		//heap.printAfterSort();
		//System.out.println(heap.getHeapSize());
	}

}
