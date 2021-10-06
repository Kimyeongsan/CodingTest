package Progremerse.Level1;

import java.util.*;

// 정수 내림차순으로 배치하기
public class DescendingNum {

	public long solution(long n) {
        String num = String.valueOf(n);
        char[] str = new char[num.length()];
        
        for(int i = 0; i < str.length; i++) {
            str[i] += num.charAt(i);
        }
        
        Arrays.sort(str);
        System.out.print(str);
        
        String ansnum = "";
        
        for (int j = str.length - 1; j >= 0; j--) { 
            ansnum += str[j]; 
        }

        long answer = Long.parseLong(ansnum);
            
        return answer;
    }
}
