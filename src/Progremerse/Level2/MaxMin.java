package Progremerse.Level2;

import java.util.*;

// �ִ񰪰� �ּڰ�
// Integer.parseInt : int�� ��ȯ
// Ingeger.toString : String���� ��ȯ

public class MaxMin {
    public String solution(String s) {
        String[] num = s.split(" ");
        
        int[] list = new int[num.length];
        
        for(int i = 0; i < num.length; i++) {
            list[i] += Integer.parseInt(num[i]);
        }
            
        Arrays.sort(list);
        
        int max = list[num.length - 1]; 
        int min = list[0];
        
        return Integer.toString(min) + " " + Integer.toString(max);
    }

}
