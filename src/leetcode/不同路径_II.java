package leetcode;

public class 不同路径_II {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
    	if(obstacleGrid.length < 1 || obstacleGrid[0].length < 1)return 0;
    	if(obstacleGrid[0][0] == 1) return 0;
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int[][] dp = new int[m][n];
        dp[0][0] = obstacleGrid[0][0] == 0?1:0;
        for(int i=1;i<m;i++) {
        	if(obstacleGrid[i][0] == 1) {
        		dp[i][0] = 0;
        	}
        	else {
        		dp[i][0] = dp[i-1][0];
        	}
        }
        for(int i=1;i<n;i++) {
        	if(obstacleGrid[0][i] == 1) {
        		dp[0][i] = 0;
        	}
        	else {
        		dp[0][i] = dp[0][i-1];
        	}
        }
        for(int i=1;i<m;i++) {
        	for(int j=1;j<n;j++) {
        		if(obstacleGrid[i][j] == 1) {
        			dp[i][j] = 0;
        		}
        		else {
        			dp[i][j] = dp[i-1][j]+dp[i][j-1];
        		}
        	}
        }
//        for(int[] i:dp) {
//        	for(int j:i) {
//        		System.out.print(j+" ");
//        	}
//        	System.out.println();
//        }
        return dp[m-1][n-1];
    }
	
	public static void main(String[] args) {
		int[][] grid = {{0,1,0},{0,0,0},{0,0,0}};
		int result = new 不同路径_II().uniquePathsWithObstacles(grid);
		System.out.println(result);
	}

}
