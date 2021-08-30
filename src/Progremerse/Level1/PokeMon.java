package Progremerse.Level1;

import java.util.HashSet;
import java.util.Scanner;

public class PokeMon {

	public int solution(int[] nums) {
		int answer = 0;

		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < nums.length; i++) {
			set.add(nums[i]);
		}

		answer = set.size();
		
		System.out.println(answer);
		
		if (answer > nums.length / 2) {
			answer = nums.length / 2;
		}

		return answer;
	}

	public static void main(String[] args) {
		int[] names = new int[6];
		
		PokeMon result = new PokeMon();
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextInt();
		}
		
		System.out.print(result.solution(names));
	}

}
