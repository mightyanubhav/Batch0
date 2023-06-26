package stack;

import java.util.Stack;
public class StackWithArray {
	int ptr;
	int n;
	int stack[];
	
	StackWithArray(int n){
		this.n = n;
		stack = new int[n];
		ptr= -1;
	}
	boolean checkOverflow(int lo) {
		return lo == n;
	}
	boolean underFlow(int lo) {
		return lo == -1;
	}
	
	public void push(int data) {
		if(checkOverflow(ptr)) {
			System.out.println("The stack is full.");
			return;
		}
		
		ptr = ptr + 1;
		stack[ptr] = data;
		
	}
	public int pop() {
		if(underFlow(ptr))
		{
			System.out.println("The stack is empty");
			return -1;
		}
		
		int ans = stack[ptr];
		ptr = ptr-1;
		
		return ans;
		
	}
	
	public int top() {
		if(underFlow(ptr))
		{
			System.out.println("The stack is empty");
			return -1;
		}
		
		return stack[ptr];
	}
	public void show() {
		if(underFlow(ptr))
		{
			System.out.println("The stack is empty");
			return;
		}
		
		for(int i = 0;i<=ptr;i++) {
			System.out.print(stack[i]+ " , ");
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		StackWithArray st = new StackWithArray(5);
		
		st.push(1);
		st.push(2);
		st.push(3);
		st.show();
		st.pop();
		st.show();
		st.pop();
		st.pop();
		st.pop();
		
		Stack<Integer> str = new Stack<>();
		str.push(4);
		str.push(5);
		
		System.out.println(str);
	}

}
