package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//
//����
//3
//1 3 23
//34 2
//0
class ��������_����ȷ��_ÿ��int��ֵ������ȷ�� {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		
		// ����һ��ԭ�� nextInt()ֻ�ǰѵ�һ��int��ֵ��ȡ�����з�\nû�ж�ȡ����nextLine�Ƕ������з�ֹͣ��
		// ������Ҫ�����д���ѵ�һ�еĻ��з���ȡ
		sc.nextLine();                 
		for(int i=0;i<n;i++){
			ArrayList<Integer> ls = new ArrayList<Integer>();
			String[] nums = sc.nextLine().split(" ");
			for(String s:nums){
				ls.add(Integer.parseInt(s));
			}
			l.add(ls);
		}
		for(ArrayList<Integer> line:l){
			for(int tmp:line){
				System.out.print(tmp+" ");
			}
			System.out.println();
		}
	}
}
