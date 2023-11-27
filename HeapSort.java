package Lab9;

public class HeapSort {
    
    /**
     * This method takes in an array on integers and sort them using heap-sort
     * @param input array of integer items
     * @return sorted array
     */
    public static int[] sort(int[]input)
    {
        MaxHeap maxHeap = new MaxHeap(input);
        // Your code goes here
        int[] array = { 3, 6, 7, 2, 9, 1};
        
        // sort the array
        int n = array.length;
        for (int fill = 0; fill < n - 1; fill++) {
        	int posMin =fill;
        	for (int next = fill + 1; next < n; next ++) {
        		if(((Comparable) array[next]).compareTo(array[posMin] < 0) {
        			
        		}
        	}
        }
        
        
        // You might change this line and return the sorted array
        return input;
    }
}
