package Lec34;

import java.util.List;

public class Lexico_Counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n= 1000;
		PrintCounting(0,n);

	}

	public static void PrintCounting(int curr, int n) {
		// TODO Auto-generated method stub
		if(curr>n) {
			return ;
		}
		System.out.println(curr);
		int i = 0;
		if(curr==0) {
			i=1;
		}
		for (; i <=9; i++) {
			PrintCounting(curr*10+i, n);
		}
		
	}
	public static void PrintCounting(int curr, int n,  List<Integer> ans) {
		// TODO Auto-generated method stub
		if(curr>n) {
			return ;
		}
		//System.out.println(curr);
        if(curr!=0){
        ans.add(curr);
        }
		int i = 0;
		if(curr==0) {
			i=1;
		}
		for (; i <=9; i++) {
			PrintCounting(curr*10+i, n,ans);
		}
		
	}
}
