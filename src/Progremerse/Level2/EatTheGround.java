package Progremerse.Level2;

public class EatTheGround {
	int hopscotch(int[][] land, int n) {
		int answer = 0;
		int[][] dx = { { 1, 2, 3 }, { -1, 1, 2 }, { -2, -1, 1 }, { -3, -2, -1 } };

		for (int i = 1; i < land.length; i++) {
			for (int j = 0; j < 4; j++) {
				land[i][j] += Math.max(land[i - 1][j + dx[j][0]], Math.max(land[i - 1][j + dx[j][1]], land[i - 1][j + dx[j][2]]));
				System.out.println("����" + land[i][j]);
			}
		}

		for (int i = 0; i < land[n - 1].length; i++) {
			if (answer < land[n - 1][i]) {
				answer = land[n - 1][i];
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		EatTheGround c = new EatTheGround();

		int[][] test = { { 1, 2, 3, 5 }, { 5, 6, 7, 100 }, { 4, 3, 2, 1 } };
		// �Ʒ��� �׽�Ʈ�� ����� ���� ���� �ڵ��Դϴ�.
		System.out.println("��" + c.hopscotch(test, 3));
	}

}