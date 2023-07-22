package LeetCode.Arrays;

public class LC121 {
    public static void main(String[] args) {
        int arr[]={7,1,5,3,6,4};
        int maxProfit=maxProfit(arr);
        System.out.println("maximum profit is..." +maxProfit);
    }

    private static int maxProfit(int[] arr) {
        int n=arr.length;
        int min=arr[0],profit=0;
        for(int i=1;i<n;i++){
            int cost=arr[i]-min;
            profit=Math.max(profit,cost);
            min=Math.min(min,arr[i]);
        }
        return profit;
    }
}
