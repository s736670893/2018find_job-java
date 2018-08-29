package leetcode;

public class 区域和检索_数组不可变 {

	private int[] dp; 
	
    public 区域和检索_数组不可变(int[] nums) {
    	int len = nums.length;
        this.dp = new int[len+1];
        dp[0] = 0;
        for(int i=1;i<=len;i++) {
        	dp[i] = dp[i-1] + nums[i-1];
        }
    }
    
    public int sumRange(int i, int j) {
        return dp[j+1] - dp[i];
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {-2, 0, 3, -5, 2, -1};
		区域和检索_数组不可变 obj = new 区域和检索_数组不可变(nums);
		int param_1 = obj.sumRange(0,5);
		System.out.println(param_1);
	}

}
