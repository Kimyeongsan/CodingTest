package Progremerse.Level1;

import java.util.Scanner;

public class MostSmall {
	
    public int[] solution(int[] arr) {
        int[] answer = {};
        
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] < arr[i + 1]) {
  
            }
        }
        
        
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
