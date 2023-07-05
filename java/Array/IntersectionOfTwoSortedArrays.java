package java.Array;

public class IntersectionOfTwoSortedArrays {
    public static void main(String[] args) {
        int array1[] = {1,2,3,4,5,6,};
        int array2[] = {2,3,4,5,6};

        System.out.println("Given array 1 is : ");

        for(int v : array1 )
            System.out.println(v+" ");
        
        System.out.println("Given array 2 is : ");

        for(int v : array2 )
            System.out.println(v+" ");

        int interSectionLength = array1.length;
        if(array2.length < array1.length)
             interSectionLength = array2.length;

        int interSectionArray[] = new int[interSectionLength];
        int i = 0,j = 0, k = 0;
        // merging the common elements of both the array.
        while(i < array1.length && j < array2.length)
            if(array1[i] == array2[j] ){
                interSectionArray[k++] = array1[i];
                i++;
                j++;
                }
            else if (array1[i] > array2[j])
                j++;
            else 
                i++;
        
        interSectionLength = k;
        System.out.println("\n Intersection of array1 and array2 is : ");
        for(k =0; k<interSectionLength;k++)
                System.out.println(interSectionArray[k]+" ");
    }
}
