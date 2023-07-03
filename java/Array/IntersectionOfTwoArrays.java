package java.Array;

public class IntersectionOfTwoArrays {
    public static void main(String[] args) {
        int array1[] = {44,49,39,26,67,69};
        int array2[] = {44,39,27,68,69,135};
        
        System.out.println("Given array 1 is ");
        for(int v :array1)
        System.out.println(v+"");

        System.out.println("Given array 2 is ");
        for(int v :array2)
        System.out.println(v+"");
        
        int interSectionLength = array1.length;
        if(array2.length < array1.length)
            interSectionLength = array2.length;

        int interSectionArray[] = new int[interSectionLength];
        int k = 0;
        for(int a : array1){
            for(int b : array2){
                if(a==b){
                    interSectionArray[k++] = a;
                    break;
                }

            }
        }
        System.out.println("\n Intersection of the array 1 &  2 is : ");
        for(int i =0;i<k;i++)
            System.out.println(interSectionArray[i] + " ");
    }
}
