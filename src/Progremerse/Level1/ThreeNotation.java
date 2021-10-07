package Progremerse.Level1;

import java.util.*;

// 3진수 바꾸기
public class ThreeNotation {
    public int solution(int n) {
        int answer = 0;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        while(true) {
            if(n < 3) {
                list.add(n);
                break;
            }else {
                list.add(n % 3);
                n = n / 3;
            }
        }
        
        for(int i = 0; i < list.size(); i++) {
            answer += Math.pow(3, list.size() - i - 1) * list.get(i);
        }
        
        System.out.print(answer);
        
        return answer;
    }
}
