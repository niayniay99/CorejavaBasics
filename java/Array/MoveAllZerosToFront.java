package java.Array;


public class MoveAllZerosToFront {
    public static void main(String[] args) {
        int array[] = {1,0,4,3,2,0,9,12,2,0};
        System.out.println("The given array is: ");
        for(int v : array)
            System.out.println(v+" ");
        int count = array.length - 1;
        for(int i = array.length-1; i >=0;i--)
            if(array[i] != 0)
                array[count--] = array[i];

            while(count >= 0)
                array[count--] = 0;

            System.out.println("\n After moving all zeros to start of array :: ");

            for(int v : array)
                System.out.println(v+ " ");
    }
}
