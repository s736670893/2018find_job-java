package leetcode;

import java.util.stream.IntStream;

public class �������� {

    public static int maxSubArray(int[] nums) {
        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        for(int i=1;i<nums.length;i++) {
        	dp[i] = Math.max(dp[i-1] + nums[i], nums[i]);
        }
        for(int i:dp) {
        	System.out.print(i+" ");
        }
        Integer max = IntStream.range(0, dp.length).reduce((i,j) -> dp[i] > dp[j] ? dp[i] : dp[j]).getAsInt();
        return max;
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2,-3,-1};
		int result = maxSubArray(nums);
		System.out.println(result);
//		int[] a = {8, 6, 3, 10};			
//		int index = IntStream.range(0, a.length).reduce((i, j) -> a[i] > a[j] ? j : i).getAsInt();
//		System.out.println("min index = " + index);
	}

}
