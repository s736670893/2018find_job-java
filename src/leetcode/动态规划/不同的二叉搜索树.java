package leetcode.��̬�滮;

// ��������
public class ��ͬ�Ķ��������� {
    public static int numTrees(int n) {	// ��̬�滮
        if(n<=2)return n;
    	int[] dp = new int[1+n];
        dp[0] = 1;
        dp[1] = 1;
        for(int i=2;i<=n;i++) {
        	for(int j=0;j<i;j++) {
        		dp[i] += dp[j]*dp[i-j-1];
        	}
        }
        return dp[n];
    }
	
//    public static long jiecheng(long n) {		//����������������C(2n, n)��Ҫʹ�õ�������
//    	long result = 1;
//    	for(long i=1;i<=n;i++) {
//    		result *= i;
//    	}
//    	return result;
//    }
//    
//    public static long C(long m, long n) {
//    	return jiecheng(m)/jiecheng(n)/jiecheng(m-n);
//    }
//    
//    public static int numTrees(int n) {
//    	return (int) (C(2*n, n)/(n+1));
//    }
//    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;
		int result = numTrees(n);
		System.out.println(result);
	}

}
