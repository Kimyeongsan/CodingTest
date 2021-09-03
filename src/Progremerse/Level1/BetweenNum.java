package Progremerse.Level1;

// 두 정수 사이의 합 
public class BetweenNum {
    public long solution(int a, int b) {
        long answer = 0;
        
        // 3 < 5
        if(a < b) {
        	for(int i = a; i <= b; i++) {
        		answer += i;
        	}
        } else {
        	for(int i = b; i <= a; i++) {
        		answer += i;
        	}
        }
        
        return answer;
    }
	
	public static void main(String[] args) {
		BetweenNum B = new BetweenNum();
		
		System.out.print(B.solution(3, 5));
    }
}
