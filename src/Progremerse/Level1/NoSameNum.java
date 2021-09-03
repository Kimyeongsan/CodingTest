package Progremerse.Level1;

import java.util.ArrayList;


public class NoSameNum {

	public int[] solution(int[] arr) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(arr[0]);

		for (int i = 1; i < arr.length; i++) {

			if (arr[i] != arr[i - 1])
				list.add(arr[i]);
		}

		int[] answer = new int[list.size()];

		for (int i = 0; i < list.size(); i++)
			answer[i] = list.get(i);

		return answer;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoSameNum n = new NoSameNum();

		int[] arr = { 1, 3, 0, 1 };

		System.out.print(n.solution(arr));
	}

}
