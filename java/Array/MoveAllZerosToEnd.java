package java.Array;


public class MoveAllZerosToEnd {
    public static void main(String[] args) {
        int array[] = {1,0,4,6,0,7,8,9,10};
        System.out.println("The Given array is :: ");
        for(int v : array)
            System.out.println(v+" ");
        
        int count = 0;
        for(int i = 0;i<array.length;i++)
            if(array[i] != 0)
                array[count++] = array[i];

            while(count < array.length)
                array[count++] = 0;

            System.out.println("\n After moving all zeros to end of array : ");

            for(int v : array)
                System.out.println(v+ " ");
                
    }
}
