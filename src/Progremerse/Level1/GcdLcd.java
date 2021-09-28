package Progremerse.Level1;

// 최대공약수와 최소공배수
public class GcdLcd {
	  public int[] solution(int n, int m) {
	      	int[] answer = new int[2];
	          
			answer[0] = gcd(n, m);
			answer[1] = n * m / answer[0];
	          
			return answer;
		}
	    
	  // 해당 공식은 외울것.. 이해 안되면..?
		static int gcd(int a, int b) {
			while(b != 0) {
				int r = a % b;
	            
				a = b;
				b = r;
			}
			return a;
		}
}
