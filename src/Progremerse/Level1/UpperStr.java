package Progremerse.Level1;

public class UpperStr {

	public String solution(String s) {
		String answer = "";
		String[] str = s.split("");
		int idx = 0;

		for (int i = 0; i < s.length(); i++) {

			if (str[i].equals(" ")) {  // try" "
				idx = 0;
			}

			else {
				if (idx % 2 == 0) {  // t -> T
					idx++;
					str[i] = str[i].toUpperCase();
				} else {             // r -> r
					idx++;
					str[i] = str[i].toLowerCase();
				}
			}
			answer += str[i];
		}

		return answer;
	}

	public static void main(String[] args) {
		UpperStr u = new UpperStr();

		String s = "try hello world";

		System.out.println(u.solution(s));
	}

}
