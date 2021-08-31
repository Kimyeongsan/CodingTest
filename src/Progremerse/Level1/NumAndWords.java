package Progremerse.Level1;

import java.util.HashMap;
import java.util.Map;

public class NumAndWords {
	
    public int solution(String s) {
        int answer = 0;
        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
        
        Map<String, Integer> map = new HashMap<>();
       
        for(int i = 0; i < arr.length; i++){
            map.put(arr[i], i);
        }

        for(int j = 0; j < arr.length; j++){
            s = s.replace(arr[j], map.get(arr[j]).toString());
        }
        
        answer = Integer.valueOf(s);
        
        return answer;
    }
    
    public static void main(String[] args) {
    	NumAndWords reuslt = new NumAndWords();
        String s = "1zerotwozero3";
        
        int res = reuslt.solution(s);
        
        System.out.println("res = " + res);
    }
}
