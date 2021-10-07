package Progremerse.Level1;

// 비밀지도

//String binaryString = Integer.toBinaryString(i); //2진수
//String octalString = Integer.toOctalString(i);   //8진수
//String hexString = Integer.toHexString(i);       //16진수

public class SecretMap {

	 public String[] solution(int n, int[] arr1, int[] arr2) {
	        
	        String[] answer = new String[n];
	        
	        for (int i = 0; i < n; i++) {
	            String val1 = Integer.toBinaryString(arr1[i]);
	            String val2 = Integer.toBinaryString(arr2[i]);

	            //자리수 맞추기
	            while(val1.length() < n){
	                val1 = '0' + val1;
	            }
	            while(val2.length() < n){
	                val2 = '0' + val2;
	            }

	            //0이면 공백, 하나라도 1이면 #
	            answer[i] = "";
	            
	            for (int j = 0; j < n; j++) {
	                if (val1.charAt(j) == '0' && val2.charAt(j) == '0') {
	                    answer[i] += " ";
	                } else {
	                    answer[i] += "#";
	                }
	            }
	        }
	        
	        return answer;
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
