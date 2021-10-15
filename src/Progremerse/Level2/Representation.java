package Progremerse.Level2;


// 숫자의 표현
public class Representation {
	
	 public int solution(int n) {
	        int answer = 0;
	        
	        for(int i = 1; i <= n; i++) {
	            int result = 0;
	            
	            for(int j = i; j <= n; j++) {
	                result += j;
	                
	                if(result == n) {
	                    answer++;
	                    break;
	                }
	                //효율성 테스트 추가
	                else if(result > n) {
	                    break;
	                }
	            }
	            
	        }
	        
	        return answer;
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
