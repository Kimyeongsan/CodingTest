package Inflearn.Sort;

import java.util.*;

//k번째 제일큰 원소
public class KthLargest {
	public static int solve_pq(int[] nums, int k) {
		int answer = 0;
		
		// min Heep
		// offer : 값 넣기
		// poll : 값 삭제
		// peek : 맨 위에 값 출력
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		for(int i : nums) {
			pq.offer(i);
			
			System.out.println(pq);
			
			// k = 2 : 즉 2개만 들고 간다 
			if(pq.size() > k) {
				pq.poll();
			}
		}
		
		answer = pq.peek();
		
		return answer;
	}
	
	public static void main(String[] args) {
		int[] nums = { 2, 3, 1, 5, 6, 4 };
		int k = 2;
		
		System.out.print(solve_pq(nums, k));
	}
}
