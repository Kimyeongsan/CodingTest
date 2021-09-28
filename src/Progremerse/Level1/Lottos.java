package Progremerse.Level1;

import java.util.*;

// �ζ��� �ְ� ������ ���� ����
public class Lottos {

	 public int[] solution(int[] lottos, int[] win_nums) {
	        int[] answer = new int[2];
	        int count = 0;
	        int black = 0;
	        int result = 0;
	        
	        Arrays.sort(lottos);
	        Arrays.sort(win_nums);
	        
	        // ��� �´��� ��
	        for(int i = 0; i < lottos.length; i++) {
	            for(int j = 0; j < win_nums.length; j++) {
	                if(lottos[i] == win_nums[j]) {
	                    count++;
	                }
	            }
	        }
	        
	        System.out.print(count + " ");
	        // 0 ó��
	        
	        for(int j = 0; j < lottos.length; j++) {
	            if(lottos[j] == 0) {
	                black++;
	            }   
	        }
	        System.out.print(black + " ");
	        
	        result = count;
	        answer[1] = lottosFunction(result);
	        
	        // black�� ������
	        if(black != 0) {
	            // best
	            result = count + black;
	            answer[0] = lottosFunction(result);
	        } else {
	            answer[0] = answer[1];
	        }
	        
	        return answer;
	    }
	    
	 	// �ζ� �Լ�
	    public static int lottosFunction(int count) {
	        if(count == 6) {
	            return 1;
	        } else if(count == 5) {
	            return 2;
	        } else if(count == 4) {
	            return 3;
	        } else if(count == 3) {
	            return 4;
	        } else if(count == 2) {
	           return 5;
	        } else {
	           return 6;
	        }
	    } 
}
