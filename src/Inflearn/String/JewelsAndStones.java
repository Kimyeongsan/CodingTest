package Inflearn.String;

import java.util.HashSet;

//보석과 돌
// toCharArray : 한개씩 꺼내서 배열에 넣기
// set.contians : set에 몇개가 겹치는지
public class JewelsAndStones {

	public static int solve(String jew, String stones) {
		int result = 0;

		HashSet<Character> set = new HashSet<>();

		char[] jewArr = jew.toCharArray();
		for (int i = 0; i < jewArr.length; i++) {
			set.add(jewArr[i]);
		}

		char[] stonArr = stones.toCharArray();
		for (int i = 0; i < stonArr.length; i++) {
			if (set.contains(stonArr[i])) {
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		String jewels = "aA";
		String stones = "aAAbbbb";

		System.out.println(solve(jewels, stones));
	}

}
