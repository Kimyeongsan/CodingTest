package Progremerse.Level1;

import java.util.Arrays;

// 완주하지 못한자
public class PlayersNotComplete {

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i<completion.length; i++){

            // 같지 않은걸 발견하면 Return
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        // 발견하지 못하고 for문을 나오면 배열의 마지막 값 Return
        return participant[participant.length - 1];
    }

	public static void main(String[] args) {
		

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		
		String result = solution(participant, completion);

		System.out.print(result);

	}

}
