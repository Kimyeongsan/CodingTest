package Inflearn.StackQueue;

import java.util.Stack;

public class Bracket {
	
	public static boolean solve(String s) {
		
		Stack<Character> stack = new Stack<>();
		
		for(int i = 0; i < s.length(); i++) {
			
			if(s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			} else if(s.charAt(i) == ')' && !stack.empty() && stack.peek() == '(') {
				stack.pop();
			} else if(s.charAt(i) == ']' && !stack.empty() && stack.peek() == '[') {
				stack.pop();
			} else if(s.charAt(i) == '}' && !stack.empty() && stack.peek() == '{') {
				stack.pop();
			} else {
				return false;
			}
		}
	
		return stack.empty();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "()[]{}";
		
		System.out.print(solve(str));
	}
}
