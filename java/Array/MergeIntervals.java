package java.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeIntervals {
    public static void main(String[] args) {
        int[][] arr = new Interval[4];
        arr[0] = new Interval(6,8);
        arr[1] = new Interval(7,9);
        arr[2] = new Interval(10,12);
        arr[3] = new Interval(13,18);
        mergeIntervals(arr);
    }

    static int[][]  mergeIntervals(int[][] intervals){

        List<int[]> answer = new ArrayList<>();

        if(intervals.length != 0 || intervals != null )
        {
            //sorted in ascending order.
        Arrays.sort(intervals, (a,b) -> a[0] - b[0]);
        
        int start = intervals[0][0];
        int end = intervals[0][1];

        for(int[] i : intervals)
        {
            if(i[0] <= end)
            {
                end = Math.max(end,i[1]);
            }
            else
            {
                answer.add(new int[]{start,end});
                start = i[0];
                end = i[1];
            }

        }
        answer.add(new int[]{start,end});

        }
        return answer.toArray(new int[0][]);

        }
}
    class Interval{
        int start,end;
        Interval(int start,int end)
        {
            this.start = start;
            this.end = end;
        }
    }

