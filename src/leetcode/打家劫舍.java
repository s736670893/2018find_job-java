package leetcode;

public class 打家劫舍 {

    public int rob(int[] nums) {
        int len = nums.length;
        if(len == 0)return 0;
        if(len == 1)return nums[0];
        if(len == 2)return Math.max(nums[0], nums[1]);
        
        int[] dp = new int[len];
        dp[0] = nums[0];
        dp[1] = nums[1];
        dp[2] = nums[2]+dp[0];
        int max = Math.max(Math.max(dp[0], dp[1]), dp[2]);
        for(int i=3;i<len;i++) {
        	dp[i] = Math.max(dp[i-2], dp[i-3]) + nums[i];
        	if(max < dp[i]) {
        		max = dp[i];
        	}
        }
        return max;
    }
	
	public static void main(String[] args) {
		int[] nums = {2,7,9,3,1};
		int result = new 打家劫舍().rob(nums);
		System.out.println(result);
	}

}
