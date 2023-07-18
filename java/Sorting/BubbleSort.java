package java.Sorting;


import java.util.Arrays;

public class BubbleSort {
      public static void main(String[] args) {
        int array[] = {3,60,23,4,45,67,44,33,21};
        System.out.println("Before Sorting ");
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println("After Sorting : ");
        System.out.println(Arrays.toString(array));

    }

    public static void bubbleSort(int array[])
    {
        int n = array.length;
        for(int i = 0;i<n-1;i++)
        {
            for(int j = 0;j<n-i-1;j++)
            {
                if(array[j] > array[j+1])
                {
                        int temp = array[j];
                        array[j] = array[j+1];
                        array[j+1] = temp; 
                }
        }
        }
    }

}
