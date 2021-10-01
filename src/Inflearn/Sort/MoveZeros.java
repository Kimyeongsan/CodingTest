package Inflearn.Sort;

/*
* time complexity of O(n logn n) 
* space complexity of O(N).
*/

class MoveZeros {

	// 0 뒤로 출력
	private static String[] BackZero(int nums[]) {
		String[] answer = new String[nums.length];

		int index = 0;

		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != 0) {
				nums[index] = nums[i];
				index++;
			}
		}

		while (index < nums.length) {
			nums[index] = 0;
			index++;
		}

		return answer;
	};

	// 0 앞으로 출력
	private static int[] FrontZero(int nums[]) {

		int index = nums.length;

		for (int i = nums.length - 1; 0 < i; i--) {

			if (nums[i] != 0) {
				nums[index - 1] = nums[i];
				index--;
			}
		}
		
//		index : 2  | 
		System.out.println(index);
		
		while (index > 0) {
			nums[index - 1] = 0;
			index--;
		}

		return nums;
	};

	public static void main(String[] args) {
		int[] nums = { 0, 3, 2, 0, 8, 5 };

//		BackZero(nums);
		FrontZero(nums);

//		for(int i : nums) {
//			System.out.print(i);
//		}
	}

}