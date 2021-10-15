package Inflearn;

import java.util.*;

public class BaseballGame {
	
	public static int solve(String[] input) {
		int result = 0;
		
		Stack<Integer> stack = new Stack<>();
		
		for(String s : input) {
			switch(s) {
				case "C" :
					stack.pop();
					break;
					
				case "D" :
					stack.push(stack.peek() * 2);
					break;
					
				case "+" :
					int x = stack.pop();
					int y = stack.pop();
					
					stack.push(y);
					stack.push(x);
					stack.push(x + y);
					
					break;
					
				default :
					stack.push(Integer.parseInt(s));
			}
		}
		
		System.out.println(stack);
		
		for(int i : stack) {
			result += i;
		}
		
		return result;
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] input = {"5", "-2", "4", "C", "D", "9", "+", "+"};
		
		System.out.print(solve(input));
	}

}
