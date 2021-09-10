package Progremerse.Level1;

// ü����
public class GymSuit {

	public static int solution(int n, int[] lost, int[] reserve) {

		// �л��� �� 5�� : �¿� �񱳸� ����! ��, �� �ΰ��� ���� �߰�
		int[] clothes = new int[n + 2];
		int answer = 0;

		// lost : 2, 4
		for (int i : lost) {
			clothes[i]--; // clothes[2 , 4] = -1
		}

		// reserve : 1, 3, 5
		for (int i : reserve) {
			clothes[i]++;// clothes[1, 3, 5] = 1
		}

		for (int i = 1; i < n + 1; i++) {
			if (clothes[i] == -1) { // �������� �л�
				if (clothes[i - 1] == 1) { // ���ʿ� ������ �ִ� �л��� �ִٸ�
					clothes[i - 1]--;
					clothes[i]++;
				} else if (clothes[i + 1] == 1) { // �����ʿ� ������ �ִ� �л��� �ִٸ�
					clothes[i + 1]--;
					clothes[i]++;
				}
			} 
			
			if (clothes[i] == 0 || clothes[i] == 1) { // ������ ������ ���� �л�
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		System.out.print("ü������ ���� �� �ִ� �л� : " + solution(n, lost, reserve));
	}

}
