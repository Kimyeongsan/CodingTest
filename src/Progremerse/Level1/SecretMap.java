package Progremerse.Level1;

// �������

//String binaryString = Integer.toBinaryString(i); //2����
//String octalString = Integer.toOctalString(i);   //8����
//String hexString = Integer.toHexString(i);       //16����

public class SecretMap {

	 public String[] solution(int n, int[] arr1, int[] arr2) {
	        
	        String[] answer = new String[n];
	        
	        for (int i = 0; i < n; i++) {
	            String val1 = Integer.toBinaryString(arr1[i]);
	            String val2 = Integer.toBinaryString(arr2[i]);

	            //�ڸ��� ���߱�
	            while(val1.length() < n){
	                val1 = '0' + val1;
	            }
	            while(val2.length() < n){
	                val2 = '0' + val2;
	            }

	            //0�̸� ����, �ϳ��� 1�̸� #
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
