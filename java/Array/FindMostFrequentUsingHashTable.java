package java.Array;


import java.util.Hashtable;

public class FindMostFrequentUsingHashTable {
    public static void main(String[] args) {
        int arr[] = {2,1,2,2,1,2,3};
        int N = arr.length;
        int output = 0;
        int max_freq = 0;
        Hashtable<Integer, Integer> table = new Hashtable<>();

        for(int i = 0;i<N;i++)
            {
                if(table.containsKey(arr[i]))
                table.put(arr[i],table.get(arr[i])+1);
            else
                table.put(arr[i],1);
            int val =  table.get(arr[i]);
            if(max_freq < val){
                output = arr[i];
                max_freq = val;
                }
            }
            System.out.println("Most frequent element is :: "+output);
            System.out.println("Frequency of element is :: "+max_freq);

    }

}
