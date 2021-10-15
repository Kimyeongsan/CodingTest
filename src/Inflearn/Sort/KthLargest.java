package Inflearn.Sort;

import java.util.*;

//k��° ����ū ����
public class KthLargest {
	public static int solve_pq(int[] nums, int k) {
		int answer = 0;
		
		// min Heep
		// offer : �� �ֱ�
		// poll : �� ����
		// peek : �� ���� �� ���
		
		Queue<Integer> pq = new PriorityQueue<>();
		
		for(int i : nums) {
			pq.offer(i);
			
			System.out.println(pq);
			
			// k = 2 : �� 2���� ��� ���� 
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
