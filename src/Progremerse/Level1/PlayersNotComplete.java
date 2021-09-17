package Progremerse.Level1;

import java.util.Arrays;

// �������� ������
public class PlayersNotComplete {

    public static String solution(String[] participant, String[] completion) {
        Arrays.sort(participant);
        Arrays.sort(completion);
        
        for (int i = 0; i<completion.length; i++){

            // ���� ������ �߰��ϸ� Return
            if (!participant[i].equals(completion[i])){
                return participant[i];
            }
        }

        // �߰����� ���ϰ� for���� ������ �迭�� ������ �� Return
        return participant[participant.length - 1];
    }

	public static void main(String[] args) {
		

		String[] participant = { "leo", "kiki", "eden" };
		String[] completion = { "eden", "kiki" };
		
		String result = solution(participant, completion);

		System.out.print(result);

	}

}
