package base;

import java.util.Scanner;

public class 并查集_递归 {

	public int[] pre;
	
	public 并查集_递归(int N) {
		pre = new int[N+1];   //根据连通情况构建pre数组
		for(int i=1; i<=N; i++) {
			pre[i] = i;
		}
	}
	
	public int find(int a) {
		if(pre[a] != a) {
			pre[a] = find(pre[a]);
		}
		return pre[a];
	}
	
	public void join(int x, int y) {
		int fx = find(x);
		int fy = find(y);
		if(fx != fy) {
			pre[fy] = fx;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();   //总共多少个点
		int M = sc.nextInt();	//有多少对a和b
		
		int a;   //a和b是连通的两个点，可多次读取
		int b;
				
		并查集_非递归 s = new 并查集_非递归(N);
		for(int i=1;i<M;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			s.join(a, b);
		}
		
		int count = 0;
		for(int i=1; i<=s.pre.length-1;i++) {		//计算连通子图的个数count
			if(s.pre[i] == i)count++; 
		}
		System.out.println(count);
	}

}
