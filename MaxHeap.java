package Lab9;

import java.lang.reflect.Array;

public class MaxHeap {
    private int[] data;
    
    /**
     * @param data
     */
    public MaxHeap(int[]data)
    {
        this.setData(MaxHeapMaker.heapify(data));
    }
    
    /**
     * Remove the max value from the root of the tree while 
     * keeping the remaining the items as a max-heap
     * @return max value
     */
    public int delete()
    {
        // Your codes goes here
    	int max = 0; 
    	
        for (i=0; i <= Array.getLength(data); i++) {
        	if (i > i-1) {
        		i == max;
        	}
        }
        
        // You should change this line and return the max value
        return max;
    }
    
    /**
     * Adds new item to the max-heap
     * @param newData the input value to be added to the max-heap
     */
    public void add(int newData)
    {
        // Your code goes here
    	
    }

    /**
     * @return Returns the max-heap
     */
    public int[] getData() {
        return data;
    }

    /**
     * Note that you might to need to 
     * @param data set the array
     */
    public void setData(int[] data) {
        this.data = MaxHeapMaker.heapify(data);
    }
}
