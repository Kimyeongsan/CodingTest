package Inflearn.String;

import java.util.HashSet;

//������ ��
// toCharArray : �Ѱ��� ������ �迭�� �ֱ�
// set.contians : set�� ��� ��ġ����
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
