package base;

import java.util.Scanner;

public class ���鼯_�ǵݹ� {
	public int[] pre;
	
	public ���鼯_�ǵݹ�(int N) {
		pre = new int[N+1];   //������ͨ�������pre����
		for(int i=1; i<=N; i++) {
			pre[i] = i;
		}
	}
	
	public int find(int a) {
		int r = a;
		while(r != pre[r]) {
			r = pre[r];
		}
		
		//������δ����·������ѹ��
		int i=a, j;
		while(pre[i] != r) {
			j = pre[i];
			pre[i] = r;
			i = j;
		}
		
		return r;
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
		int N = sc.nextInt();   //�ܹ����ٸ���
		int M = sc.nextInt();	//�ж��ٶ�a��b
		
		int a;   //a��b����ͨ�������㣬�ɶ�ζ�ȡ
		int b;
				
		���鼯_�ǵݹ� s = new ���鼯_�ǵݹ�(N);
		for(int i=1;i<M;i++) {
			a = sc.nextInt();
			b = sc.nextInt();
			s.join(a, b);
		}
		
		int count = 0;
		for(int i=1; i<=s.pre.length-1;i++) {		//������ͨ��ͼ�ĸ���count
			if(s.pre[i] == i)count++; 
		}
		System.out.println(count);
	}
}
