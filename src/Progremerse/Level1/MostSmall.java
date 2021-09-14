package Progremerse.Level1;

// ���������� ����
public class MostSmall {
	
    public int[] solution(int[] arr) {
        if(arr.length == 1){
            int[] answer = {-1};
            
            return answer;
        }
    	
        int[] answer = new int[arr.length - 1];  // 4 , 3 , 2 , 1
        int small = arr[0];
        
        for(int i = 0; i < arr.length; i++) {  
        	small = Math.min(small, arr[i]); // ���� ���� �� ���ϱ�
        }
        
        System.out.println("���� ���� �� : " + small);
        
        for(int j = 0; j < arr.length; j++) {
        	if(small == arr[j]) {
        		continue;
        	}
        	answer[j] += arr[j];
        	
        	System.out.println("�迭 : " + answer[j]);
        }
        return answer;
    }
	
	
	public static void main(String[] args) {
		MostSmall m = new MostSmall();
		
		int[] arr = {4, 3, 2, 1};
		
		m.solution(arr);
	
	}

}
