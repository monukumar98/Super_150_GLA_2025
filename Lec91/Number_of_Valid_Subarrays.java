package Lec91;

import java.util.Stack;

public class Number_of_Valid_Subarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []arr= {1,4,2,5,3};

	}
	public static int NumberofSubArray(int [] arr) {
		int ans=0;
		Stack<Integer> st = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				st.pop();
			}
			st.push(i);
			ans+=st.size();
		}
		return ans;
		
	}

}
