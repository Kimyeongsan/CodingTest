package Inflearn.String;

import java.util.*;

// 최고 숫자
public class LargestNum {

	public static void main(String[] args) {
		int[] nums = {3, 2, 3, 1, 2, 4, 5 ,5 ,6};
		int k = 2;
		int result = 0;
		
		Arrays.sort(nums);
		
		result = nums[nums.length - k];
		
		
		System.out.print(result);
	}

}
