package base;

import java.util.Scanner;

public class ���鼯_С������ {
	public int[] pre;
	
	public int numIslands(int[][] grid) {
		if(grid.length == 0 || grid[0].length == 0) {
			return 0;
		}
		int row = grid.length;
		int col = grid[0].length;
		pre = new int[row*col+1];
		
		// ��pre������г�ʼ��
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int num = col*i+j;
				pre[num] = num;
			}
		}
		
		//����;��ÿ����
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(grid[i][j] == 1) {
                    int down=i+1,right=j+1;
                    if(down < row && grid[down][j] == 1)
                        join(col*i + j,col*down + j);
                    if(right < col && grid[i][right] == 1)
                        join(col*i + j,col*i + right);
				}
			}
		}
		
		//�ٱ���һ�Σ�����island�ĸ���
		int count = 0;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				int num = col*i + j;
				if(pre[num] == num && grid[i][j] == 1) {
					count++;
				}
			}
		}
		return count;
	}
	
	//����ͨ�ĵ��pre��Ϊͬһ��ֵ
	void join(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if(fx != fy)
			pre[fx] = fy;
	}
	
	//�ҵ�a�����ȣ�����·��ѹ��
	int find(int a) {
		if(pre[a] != a)
			pre[a] = find(pre[a]);
		return pre[a];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] grid = new int[m][n];
		for(int i=0;i<m;i++) {
			for(int j=0;j<n;j++) {
				grid[i][j] = sc.nextInt();
			}
		}
		���鼯_С������ s = new ���鼯_С������();
		int result = s.numIslands(grid);
		System.out.println(result);
	}

}
