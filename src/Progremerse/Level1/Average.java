package Progremerse.Level1;

import java.util.Scanner;

// 평균값 구하기
public class Average {
    public double solution(int[] arr) {
        double answer = 0;
        double sum = 0;
        
        for(int i = 0; i < arr.length; i++) {
        	sum += arr[i];
        	
    		System.out.println(sum);
        }
        
        answer = sum / arr.length;
     
        return answer;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] names = new int[4];
		
		Average result = new Average();
		
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			names[i] = sc.nextInt();
		}
		
		System.out.print(result.solution(names));
	
	}

}
