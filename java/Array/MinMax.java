package java.Array;


public class MinMax {
   // class pair used to return two values from getMinMax method.
    static class Pair 
    {
        int min;
        int max;
    }

    static Pair getMinMax(int array[], int arraysize)
    {
        Pair minmax = new Pair();
        int i;
        
        // if there is only single element in an array.
        if(arraysize == 1)
        {
            minmax.min = array[0];
            minmax.max = array[1];
            return minmax;
        }

        // if there are more then one element in an array.
        if(array[0] > array[1])
        {
            minmax.max = array[0];
            minmax.min = array[1];
        }
        else{
            minmax.max = array[1];
            minmax.min = array[0];
        }

        for( i = 2; i < arraysize; i++)
        {
            if(array[i] >minmax.max)
            {
                minmax.max = array[i];
            }
            else if(array[i] < minmax.min)
            {
                minmax.min = array[i];
            }

        }
        return minmax;
    }


    public static void main(String[] args) {
        int arr[] = {1,2,49, 3000, 200, 400};
        int arraysize = 6;
        Pair minimax = getMinMax(arr, arraysize);
        System.out.printf("\n Minimum array is %d", minimax.min);
        System.out.printf("\n Maximum array is %d", minimax.max);
    }
}
