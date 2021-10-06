package Progremerse.Level2;

import java.util.*;

// 최솟값 만들기
public class MakeMin {
    public int solution(int[] A, int[] B) {
		Arrays.sort(A); 
		Arrays.sort(B);
		
		int sum = 0;
		for(int i = 0; i < A.length; i++) { 
			sum += A[i] * B[A.length - i - 1];
            System.out.println(sum);
		}
		return sum;
	}
}
