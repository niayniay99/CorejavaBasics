package java.Array;


import java.util.Arrays;
import java.util.HashSet;

public class UnionArrayUsingHashset {
    public static void main(String[] args) {
        Integer array1[] = {17,23,45};
        Integer array2[] = {17,20,23,45};

        HashSet<Integer> set = new HashSet<>();
        //add all elements of array1
        set.addAll(Arrays.asList(array1));
        // add all elements of array2
        // duplicate elements will not be added 
        set.addAll(Arrays.asList(array2));

        //convert HashSet to array[]
        Integer unionArray[] = set.toArray(new Integer[set.size()]);

        System.out.println("The Given array 1 is  : ");
        for(int v : array1)
            System.out.println(v+ " ");
        
        System.out.println("The Given array 2 is  : ");
        for(int v : array2)
            System.out.println(v+ " ");
        
        System.out.println("The union of array is  : ");
        for(int v : unionArray)
            System.out.println(v+ " ");
        
        
    }
}
