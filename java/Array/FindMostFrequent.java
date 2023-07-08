package java.Array;


public class FindMostFrequent {
    public static void main(String[] args) {
        int arr[] = {3,9,1,3,6,3,8,1,6};
      
        int max_freq = 0;
        int output = 0;
        int N = arr.length;

        for(int i = 0;i<N;i++){
            int cur_freq = 1;
            for(int j = i+1;j<N; j++)
            {
                if(arr[i] == arr[j])
                    cur_freq++;
            }
            if(cur_freq > max_freq)
                {
                    max_freq = cur_freq;
                    output = arr[i];
                }
            else if(cur_freq == max_freq && output > arr[i]){
                max_freq = cur_freq;
                output = arr[i];
            }
        }
        System.out.println("Most frequent array is :: "+output);
        System.out.println("Occurred "+max_freq+" times.");

    }
}
