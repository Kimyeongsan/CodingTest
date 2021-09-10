package Progremerse.Level1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// 두개 뽑아서 더하기
public class TwoSum {
    public int[] solution(int[] numbers) {
        int[] answer = new int[numbers.length + 1];
        
        Set<Integer> set = new HashSet<Integer>();
        
        Arrays.sort(numbers); // 오름차순
        
        // 1, 1, 2, 3, 4
        for(int i = 0; i < numbers.length; i++) {
        	for(int j = i + 1; j <numbers.length; j++) {
        		set.add(numbers[i] + numbers[j]);
        	}
        }
        
        System.out.print(set);
        
        return set.stream().sorted().mapToInt(Integer::intValue).toArray();
    }
    
	public static void main(String[] args) {
		int[] num = {5, 0, 2, 7};

		TwoSum twoSum = new TwoSum();
		
		System.out.print(twoSum.solution(num));
	}
}
