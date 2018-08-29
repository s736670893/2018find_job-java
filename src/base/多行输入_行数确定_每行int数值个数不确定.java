package base;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//
//样例
//3
//1 3 23
//34 2
//0
class 多行输入_行数确定_每行int数值个数不确定 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<ArrayList<Integer>> l = new ArrayList<ArrayList<Integer>>();
		
		// 加这一行原因： nextInt()只是把第一行int数值读取，换行符\n没有读取，而nextLine是读到换行符停止，
		// 所以需要用这行代码把第一行的换行符读取
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
