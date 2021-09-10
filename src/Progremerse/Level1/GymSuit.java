package Progremerse.Level1;

// 체육복
public class GymSuit {

	public static int solution(int n, int[] lost, int[] reserve) {

		// 학생은 총 5명 : 좌우 비교를 위해! 좌, 우 두개의 공간 추가
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
			if (clothes[i] == -1) { // 도난당한 학생
				if (clothes[i - 1] == 1) { // 왼쪽에 여벌이 있는 학생이 있다면
					clothes[i - 1]--;
					clothes[i]++;
				} else if (clothes[i + 1] == 1) { // 오른쪽에 여벌이 있는 학생이 있다면
					clothes[i + 1]--;
					clothes[i]++;
				}
			} 
			
			if (clothes[i] == 0 || clothes[i] == 1) { // 도난을 당하지 않은 학생
				answer++;
			}
		}

		return answer;
	}

	public static void main(String[] args) {
		int n = 5;
		int[] lost = { 2, 4 };
		int[] reserve = { 1, 3, 5 };

		System.out.print("체육복을 입을 수 있는 학생 : " + solution(n, lost, reserve));
	}

}
