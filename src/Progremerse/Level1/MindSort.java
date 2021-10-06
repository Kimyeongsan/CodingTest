package Progremerse.Level1;

import java.util.*;

// 문자열 내 마음대로 정렬하기
public class MindSort {
    public String[] solution(String[] strings, int n) {
        String[] answer = {};
        
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < strings.length; i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        
        Collections.sort(list);
        
        answer = new String[list.size()];
        
        for(int j = 0; j < list.size(); j++) {
            answer[j] = list.get(j).substring(1, list.get(j).length());
        }
        
        return answer;
    }
}
