package Progremerse.Level1;

import java.util.ArrayList;
import java.util.List;

// 모의고사
public class MockExam {
	
	// 입력 값 : 1, 3, 2, 4, 2
    public static int[] solution(int[] answers) {
    	
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] c = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        
        int[] score = new int[3];
        
        for(int i = 0; i < answers.length; i++) {
        	
        	if(answers[i] == a[i % a.length]) {
        		score[0]++;
        	}
        
        	if(answers[i] == b[i % b.length]) {
        		score[1]++;
        	}

        	if(answers[i] == c[i % c.length]) {
        		score[2]++;
        	}
        }
     
        int max = score[0];
        List<Integer> win = new ArrayList<>();
        
        for(int i = 0; i < score.length; i++) {
        	if(max < score[i]) { // score[0] 보다 다른게 큰 경우 max 이동
        		max = score[i];
        	} else if(max == score[i]){  // 최종일 경우 List에 넣기
        		win.add(i);
        	}
        }
        
        int[] answer = new int[win.size()];
        
        // 배열에 저장된 부분 answer에 넣어 주기
        for(int k = 0; k < win.size(); k++) {
        	answer[k] = win.get(k) + 1;
        }
        
        return answer;
    }

	public static void main(String[] args) {
		int[] answers = {1, 3, 2, 4, 2};
		int[] result = solution(answers);
		
        for(int i : result)
        	System.out.print(i + " ");
	}

}
