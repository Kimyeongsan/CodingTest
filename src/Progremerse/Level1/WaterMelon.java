package Progremerse.Level1;

import java.util.Scanner;

// ���ڼ��ڼ��ڼ���?
public class WaterMelon {

	public String solution(int n) {
		String answer = "";

		for (int i = 0; i < n; i++) {
			if (i % 2 == 0) {
				answer += "��";
			} else {
				answer += "��";
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		WaterMelon result = new WaterMelon();

		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int a = sc.nextInt();

		System.out.print(result.solution(a));
	}
}
