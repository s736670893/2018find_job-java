package base;
import java.util.Scanner;

public class _360 {
	public static int LCS(int[]str1, int[] str2){
        int[][] c = new int[str1.length + 1][str2.length + 1];
        for(int row = 0; row <= str1.length; row++)
            c[row][0] = 0;
        for(int column = 0; column <= str2.length; column++)
            c[0][column] = 0;
        
        for(int i = 1; i <= str1.length; i++)
            for(int j = 1; j <= str2.length; j++)
            {
                if(str1[i-1] == str2[j-1])
                    c[i][j] = c[i-1][j-1] + 1;
                else if(c[i][j-1] > c[i-1][j])
                    c[i][j] = c[i][j-1];
                else
                    c[i][j] = c[i-1][j];
            }
        return c[str1.length][str2.length];
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] s = new int[n];
		int[] t = new int[n];
		for(int i=n-1;i>=0;i--) {
			s[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			t[i] = sc.nextInt();
		}
		System.out.println("t: ");
		for(int i=0;i<n;i++) {
			System.out.print(t[i]+" ");
		}
		int l = LCS(s,t);
		System.out.println(l);
	}

}
