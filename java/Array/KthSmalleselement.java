package java.Array;


import java.util.Arrays;

public class KthSmalleselement {
    public static void main(String[] args) {
        int arr[] = {1,2,3,20,5,6,9,22};
        int k = 4;
        System.out.println("The Kth smallest element is : "+kthSmalleselement(arr , k));
    }

    public static int kthSmalleselement(int arr[], int k)
    {
        Arrays.sort(arr);
        return arr[k-1];
    }
}
