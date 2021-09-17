package Progremerse.Level1;

import java.util.Arrays;

// ¿¹»ê
public class Budget {
	
	  public static int solution(int[] d, int budget) {
          int answer = 0;
            // 1, 2, 3, 4, 5
          Arrays.sort(d); 
          
          for(int i = 0; i < d.length; i++) { 
              if(budget == 0 || budget < d[i]) {
                break;
            }
              
            budget = budget - d[i]; 
            answer++;
          }
          return answer;
      }

	public static void main(String[] args) {
		int[] d = {1, 3, 2, 5, 4};
		int budget = 9;
		
		System.out.print("result : " + solution(d, budget));
	}

}
