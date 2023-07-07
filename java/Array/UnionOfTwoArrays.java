package java.Array;
public class UnionOfTwoArrays {
    public static void main(String[] args) {
        int array1[] = {17,23,31,14,25,26};
        int array2[] = {23,44,14,8,17};

        int unionArrayMaxLength = array1.length + array2.length;
        int unionArray[] = new int [unionArrayMaxLength];

        int k = 0;

        for(int i = 0; i<array1.length;i++)
            unionArray[k] = array1[i];
        
        for(int i = 0; i< array2.length;i++)
        {
            int j = 0;
            for(j = 0; j < k; j++)
                if(unionArray[j] == array2[i])
                    break;
            if(j == k)
                unionArray[k++] = array2[i];

        }

        System.out.println("The Given array 1 is : ");
        for(int i =0; i< array1.length;i++)
            System.out.println(array1[i]+" ");

        System.out.println("The Given array 2 is : ");
        for(int i =0; i< array2.length;i++)
            System.out.println(array2[i]+" ");

        System.out.println("The Union of two array is : ");
        for(int i =0; i< k;i++)
            System.out.println(unionArray[i]+" ");

    }
}
