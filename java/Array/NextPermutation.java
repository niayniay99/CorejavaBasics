package java.Array;



public class NextPermutation {
    public static void main(String[] args) {
        int[] nums =new int[]{1,3,5,4,2} ;
                
        nextPermutation(nums);
        // Printing the answer
       for(int i : nums){
            System.out.println(i+" ");
        }
    
    }
    static void nextPermutation(int[] nums )
    {
        //starting from back position -2.
        int i = nums.length - 2;

       while(i>0 && nums[i] >= nums[i+1]) i--;

       if(i>=0)
       {
        int j = nums.length -1;
        while(nums[j] <= nums[i]) j--;
        swap(nums,i,j);
       }
       reverse(nums,i+1,nums.length-1);
    }    

    static void swap(int[] nums,int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    static void reverse(int nums[], int i, int j)
    {
        while(i<j)
        swap(nums,i++,j--);
    }

}
