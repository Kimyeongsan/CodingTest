package Progremerse.Level1;

// ����� ��
public class MeasureSum {

	public int solution(int n) {
		int answer = 0;

		for (int i = 1; i <= n; i++) {
			if (n % i == 0) {
				answer += i;
			}
			
		}
		return answer;
	}

	public static void main(String[] args) {
		MeasureSum m = new MeasureSum();
		
		System.out.print(m.solution(12));
	}

}
