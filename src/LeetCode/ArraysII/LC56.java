package LeetCode.ArraysII;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LC56 {
    public static void main(String[] args) {
        int[][] arr = {{1, 3}, {8, 10}, {2, 6}, {15, 18}};
        mergeIntervals(arr);
    }

    private static int[][] mergeIntervals(int[][] intervalArr) {
        Arrays.sort(intervalArr,(comp1, comp2)->comp1[0]-comp2[0]);
        List<int[]> mergedInterval = new ArrayList<>();
       int[] newInterval = intervalArr[0];
        mergedInterval.add(newInterval);
        for(int[] i:intervalArr){
            if(i[0] <=newInterval[1])
                newInterval[1] = Math.max(newInterval[1],i[1]);
            else {
                newInterval = i;
                mergedInterval.add(i);
            }
        }
     return mergedInterval.toArray(new int[0][0]);
    }

}
