package Progremerse.Level1;

// 번호 숨기기
public class HidePhoneNumber {

	public String Solution(String phoneNumber) {
		String result = "";
		
		for(int i = 0; i < phoneNumber.length(); i++) {
			if(i < phoneNumber.length() - 4) {
				result += "*";
			}else {
				result += phoneNumber.charAt(i);
			}
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		String test = "010123456789"; 
		HidePhoneNumber H = new HidePhoneNumber();
		
		H.Solution(test);
		
		System.out.print(H.Solution(test));
		
	}

}

// charAt
// toCharArray
// substring
// StringBuilder