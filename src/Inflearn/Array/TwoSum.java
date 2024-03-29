package Inflearn.Array;

import java.util.HashMap;
import java.util.Map;

// 두개의 합
public class TwoSum {

	public int[] solve(int[] nums, int target) {
		// 2.담을 그릇
		Map<Integer, Integer> map = new HashMap<>();
		int[] result = new int[2];

		// 3.for
		for (int i = 0; i < nums.length; i++) {
			if (map.containsKey(nums[i])) {
				int mapValue = map.get(nums[i]); // i=1일때 8 , map(8,0)
				
				result[0] = mapValue + 1; // 1
				result[1] = i + 1; // 2

			} else {
				map.put(target - nums[i], i); // key 10-2=8, value i=0
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 8, 11, 21 };
		int target = 10;
		
		TwoSum a = new TwoSum();
		int[] result = a.solve(nums, target);
		
		for (int i : result)
			System.out.println(i);
	}

}
