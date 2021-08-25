package Progremerse.Level1;

import java.util.Arrays;
import java.util.Scanner;

//x만큼 간격이 있는 n개의 숫자
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
        
    	System.out.print("행 갯수 : ");
        long x = sc.nextInt();
        
    	System.out.print("열 갯수 : ");
        int n = sc.nextInt();
        
        long[] answer = new long[n];

		answer = multiplication.solution(x, n);
        System.out.print(Arrays.toString(answer));
    }
}
