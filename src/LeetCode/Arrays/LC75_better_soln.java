package LeetCode.Arrays;

import java.util.Arrays;

public class LC75_better_soln {
    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColors(nums);
    }

    private static void sortColors(int[] nums) {
        int n = nums.length;
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0)
                countZero++;
            else if (nums[i] == 1)
                countOne++;
            else
                countTwo++;

        }
        for (int i = 0; i < countZero; i++) {
            nums[i] = 0;
        }
        for (int i = countZero; i < countZero+countOne; i++) {
            nums[i] = 1;
        }
        for (int i = countZero+countOne; i < n; i++) {
            nums[i] = 2;
        }
        System.out.println("array.." + Arrays.toString(nums));
    }
}
