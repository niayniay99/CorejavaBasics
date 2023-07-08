package java.Array;



import java.util.Arrays;

public class FindPairForZ {
    public static void main(String[] args) {
        int arr[] = {1,4,45,56,6,7,10,8,12};
        int Z = 16;

        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while(left<right)
        {
            int sum = arr[left] + arr[right];
            if(sum == Z){
                System.out.println("Pair is "+arr[left]+", "+arr[right]);
                left++;
            }
            else if(sum > Z)
                right--;
            else
                left++;
        }
    }
}
 