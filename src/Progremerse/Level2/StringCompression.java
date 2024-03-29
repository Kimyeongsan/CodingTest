package Progremerse.Level2;

// 문자열 압축
public class StringCompression {

	public static int solution(String s) {

		//	s : aabbaccc  : 초기 문자열의 길이
		int answer = s.length(); 

		for (int n = 1; n <= s.length() / 2; n++) {
			StringBuilder temp = new StringBuilder();

			for (int i = 0; i < s.length(); i = i + n) {
				String word = "";

				
				// word에 잘라진 문자열이 들어감
				if (i + n >= s.length()) {
					word = s.substring(i, s.length()); //
				} else {
					word = s.substring(i, i + n);  // aa
				}

				int cnt = 1;
				
				StringBuilder sb = new StringBuilder();

				for (int j = i + n; j < s.length(); j = j + n) {
					String word2 = "";

					if (j + n >= s.length()) {
						word2 = s.substring(j, s.length());
					} else {
						word2 = s.substring(j, j + n);
					}

					if (word.equals(word2)) {
						cnt++;
						i = j;
					} else {
						break;
					}
				}

				if (cnt == 1)
					sb.append(word);
				else
					sb.append(cnt).append(word);

				temp.append(sb.toString());
			}

			answer = Math.min(answer, temp.toString().length());
		}

		return answer;
	}

	public static void main(String[] args) {
		String[] s = { "aabbaccc", "ababcdcdababcdcd", "abcabcdede", "abcabcabcabcdededededede", "xababcdcdababcdcd" };

		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i] + " -> " + solution(s[i]));
		}

	}

}
