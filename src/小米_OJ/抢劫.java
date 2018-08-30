package 小米_OJ;

public class 抢劫 {
	
    public static int rob(int[] nums) {
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

	private static String solution(String line) {
	    // 在此处理单行数据
	    String[] s_nums = line.split(",");
	    int[] nums = new int[s_nums.length];
	    for(int i=0;i<nums.length;i++) {
	    	nums[i] = Integer.parseInt(s_nums[i]);
	    }
	    int result = rob(nums);
	    // 返回处理后的结果
	    return "" + result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "2,7,9,3,1";
		String result = solution(s);
		System.out.println(result);
	}

}
