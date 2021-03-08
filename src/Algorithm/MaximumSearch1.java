package Algorithm;


//순차탐색(Sequential Search)

public class MaximumSearch1 {
	
	public static void main(String[] args) {
		int[] nums = {45, 60, 90, 75, 20, 55, 85, 35, 10, 25};
		int max_result = 0;
		
		//시간복잡도 O(N)
		for(int i = 0; i < nums.length; i++) { 
			if(max_result < nums[i]) {
				max_result = nums[i];
			}
			else {
				continue;
			}
		}
		
		System.out.print(max_result);

	}
}
