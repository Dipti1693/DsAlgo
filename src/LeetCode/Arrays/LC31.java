package LeetCode.Arrays;

import java.util.Arrays;

public class LC31 {
    public static void main(String[]args){
        int[]nums={1,9,7,3,0};
        nextPermutation(nums);
    }

    private static void nextPermutation(int[] nums) {
        int index=-1;
        int n=nums.length;
        for(int i=n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index=i;
                break;
            }
        }
        if(index!=-1){
            for(int i=n-1;i>=0;i--){
                if(nums[index]<nums[i]){
                    swapIntegers(nums,index,i);
                    break;
                }
            }
        }
        int i=index+1; int j=n-1;
        while(i<j){
            swapIntegers(nums,i++,j--);
        }
        System.out.println("next permutation.." + Arrays.toString(nums));
    }

    private static void swapIntegers(int[] nums, int index, int i) {
        int tmp=nums[i];
        nums[i]=nums[index];
        nums[index]=tmp;
    }


}
