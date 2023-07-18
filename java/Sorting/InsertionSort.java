package java.Sorting;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
            int array[] = {3,60,23,4,45,67,44,33,21};
            System.out.println("Before Sorting ");
            System.out.println(Arrays.toString(array));
            selectionSort(array);
            System.out.println("After Sorting : ");
            System.out.println(Arrays.toString(array));
}
public static void selectionSort(int array[])
{
    for(int i=1;i<array.length;i++)
    {
        int minIndex = i;
        for(int j =i+1;j<array.length;j++)
            if(array[j] < array[minIndex])
                minIndex = j;
        //swap the minimum elt with the elt in index i.
			int temp = array[minIndex];
			array[minIndex] = array[i];
			array[i] = temp;
		
    }
}
    
}
