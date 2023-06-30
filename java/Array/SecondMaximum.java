package java.Array;
import java.util.Arrays;

public class SecondMaximum {
        public static void main(String[] args)
        {
            int array[] = { 10,32,34,54,19,29,38,45};

            // assume 0th index value is maximum 
            int max = array[0];
            // assume 1st index value is 2nd maximum
            int secondMax = array[1];
            
            // if 1st index value is greater than 0th index value
            //then swap the max and second max

            if(max < secondMax){
                max = array[1];
                secondMax = array[0];

            }
            // iterating from the 2nd index
            for(int i =2;i<array.length;i++)
                if(array[i] > max)
                {
                // if ith index is greater than maximum
               // then update the max and secondMax
               secondMax = max;
               max = array[i];
                }
                else if(array[i] > secondMax)
                {
                    //if ith index is not greater than max
				//still need to check with secondMax
				//if ith index greater than second max
				//then update only second max

                secondMax = array[i];

                }

                System.out.println("Given array is "+Arrays.toString(array));
                System.out.println("Max value of array is : "+max);
                System.out.println("Second max value of array is : "+secondMax);
                
        }
}
