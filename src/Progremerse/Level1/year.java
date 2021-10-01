package Progremerse.Level1;

public class year {
    public String solution(int a, int b) {
        String answer = "";
        
        String[] day = {"SUN","MON","TUE","WED","THU","FRI","SAT"};
        String[] year = new String[366];
        int[] month = {31,29,31,30,31,30,31,31,30,31,30,31};
        int want_day = 0;
        
        for(int i = 0; i < year.length; i++) {
            year[i] =  day[(i + 5) % 7];
        }
        
        // 월 계산
        for(int j = 0; j < a - 1; j++) {
            want_day += month[j]; 
           // System.out.println(want_day);
        }
        
        // 일 계산
        want_day += b - 1;
        
        answer = year[want_day];
        
        return answer;
    }


}
