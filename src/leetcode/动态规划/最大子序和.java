package leetcode.动态规划;

import java.util.stream.IntStream;

public class 最大子序和 {

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
        	dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }
//        Integer max = IntStream.range(0, dp.length).reduce((i,j) -> dp[i] > dp[j] ? dp[i] : dp[j]).getAsInt();
        int max = Integer.MIN_VALUE;
        for(int i:dp) {
        	if (i>max)
        		max = i; 
        }
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2, 1, -3, 4, -1 ,2, 1, -5, 4};
		int result = maxSubArray(nums);
		System.out.println(result);
//		int[] a = {8, 6, 3, 10};			
//		int index = IntStream.range(0, a.length).reduce((i, j) -> a[i] > a[j] ? j : i).getAsInt();
//		System.out.println("min index = " + index);
	}

}
