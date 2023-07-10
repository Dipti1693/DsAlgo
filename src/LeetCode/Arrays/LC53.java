package LeetCode.Arrays;

import static java.lang.Math.max;

public class LC53 {
    public static void main(String[] args) {
        int arr[] = {-2, -3, 4, -1, -2, 1, 5, -3};
        maxSubArray(arr);
    }

    private static void maxSubArray(int[] arr) {
        int max = Integer.MIN_VALUE;
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum + arr[i];
            if(sum>max){
                max=sum;
            }
            if(sum<0){
                sum=0;
            }


        }
        System.out.println("max..." +max);
    }
}
