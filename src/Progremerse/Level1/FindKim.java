package Progremerse.Level1;

// 서울에서 김서방 찾기..
public class FindKim {
    public String solution(String[] seoul) {
        String answer = "";
        int result = 0;
        
        for(int i = 0; i < seoul.length; i++) {
            if(seoul[i] == "Kim") {
            	answer = "김서방은" + result + "에 있다.";
            }
        }
        
        return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] names = {"Jane", "Kim"};
		
		FindKim result = new FindKim();
		
		System.out.print(result.solution(names));
	
	}
}
