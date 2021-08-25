package Progremerse.Level1;

import java.util.Arrays;
import java.util.Scanner;

public class Multiplication {
    public long[] solution(long x, int n) {
        long[] answer = new long[n];
        
        for(int i = 0; i < n; i++) {
        	answer[i] = x * (i + 1);
        }
        return answer;
    }
    
    public static void main(String[] args) {
    	
    	Multiplication multiplication = new Multiplication();
        Scanner sc = new Scanner(System.in);
        
    	System.out.print("Çà °¹¼ö : ");
        long x = sc.nextInt();
        
    	System.out.print("¿­ °¹¼ö : ");
        int n = sc.nextInt();
        
        long[] answer = new long[n];

		answer = multiplication.solution(x, n);
        System.out.print(Arrays.toString(answer));
    }
}
