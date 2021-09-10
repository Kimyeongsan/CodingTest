package Inflearn.String;

public class PlusOne {

	public static int[] solve(int[] k) {

		int n = k.length; // 3

		for (int i = n - 1; i >= 0; i--) { // i = 2 / 1 / 0

			k[i]++;

			if (k[i] < 10) {
				return k; // 10보다 작을경우
			} else {
				k[i] = 0; // 10보다 클 경우
			}
		}

		int[] result = new int[n + 1];
		result[0] = 1;

		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PlusOne plusOne = new PlusOne();

		int[] digits = { 5, 2, 4 };
		int[] result = solve(digits);

		for (int i : result) {
			System.out.print(i + " ");
		}
	}

}
