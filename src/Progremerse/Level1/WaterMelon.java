package Progremerse.Level1;

import java.util.Scanner;

// 수박수박수박수박?
public class WaterMelon {

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "수";
			} else {
				answer += "박";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		WaterMelon result = new WaterMelon();

		Scanner sc = new Scanner(System.in);
		System.out.print("문자 갯수 : ");
		int a = sc.nextInt();

		System.out.print(result.solution(a));
	}
}
