package Progremerse.Level2;

import java.util.HashMap;
import java.util.Map;

// 전화번호 목록
public class PhoneList {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for(int i = 0; i < phone_book.length; i++) {
            map.put(phone_book[i], i);
        }
        
        for(int j = 0; j < phone_book.length; j++) {
            for(int k = 1; k < phone_book[j].length(); k++) {
                if(map.containsKey(phone_book[j].substring(0, k))) {
                    answer = false;
                    
                    return answer;
                }   
            }
        }
        

        return answer;
    }
}
