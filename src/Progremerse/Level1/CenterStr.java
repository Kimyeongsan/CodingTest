package Progremerse.Level1;

public class CenterStr {
	
    public String solution(String s) {
        String answer = "";
        
        if(s.length() % 2 == 0) {
        	
        	int i = (s.length() / 2) - 1; // (4 / 2) - 1
        	
        	answer = s.substring(i, i + 2);  // 1  , 2
        	
        } else {
        	int j = s.length() / 2;
        	
        	answer = s.substring(j, j + 1);
        }
        
        
        return answer;
    }

	public static void main(String[] args) {
		CenterStr c = new CenterStr();
		
		String skill = "qwer";
//		
		c.solution(skill);
//		
		 System.out.print(c.solution(skill));
//		System.out.print(skill.substring(0, 3));
	}

}
