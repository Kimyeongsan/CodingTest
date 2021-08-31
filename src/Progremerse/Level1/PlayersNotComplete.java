package Progremerse.Level1;

import java.util.Arrays;

public class PlayersNotComplete {

	public String solution(String[] participant, String[] completion) {

		Arrays.sort(participant);
		Arrays.sort(completion);

		int i;
		
		for (i = 0; i < participant.length; i++) {
			if (!participant[i].equals( completion[i])) {
				return participant[i];
			}
		}

		return participant[i];
	}

	public static void main(String[] args) {

		PlayersNotComplete playersNotComplete = new PlayersNotComplete();

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };

		System.out.print(playersNotComplete.solution(participant, completion));

	}

}
