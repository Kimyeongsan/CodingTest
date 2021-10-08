package Progremerse.Level1.weekly;

// 4���� : ������ ��õ�ϱ�
public class Recommendation {
	
    public String solution(String[] table, String[] languages, int[] preference) {
        int max = 0;
        String maxJob = "";

        // �� ���ܾ� ������
        for (int i = 0; i < table.length; i++) {
            String jobLang[] = table[i].split(" ");
            String job = "";
            int sum = 0;

            // "SI JAVA JAVASCRIPT SQL PYTHON C#"
            for (int j = 0; j < jobLang.length; j++) {
                int score = jobLang.length - j;

                //0��° ������ �̸� : SI
                if (j == 0) {
                    job = jobLang[j];
                    continue;
                }

                //������ ���� �����ھ� ���� ��� ���� ���
                // "PYTHON", "C++", "SQL"
                for (int k = 0; k < languages.length; k++) {
                    if (languages[k].equals(jobLang[j])) {
                        sum += preference[k] * score;
                    }
                }
            }

            //������ ���� ũ�ų� ������
            if (max <= sum) {
                //������ ������ ���������� �� (������ ��� ���������� �� ������ ������ ��ŵ)
                if (max == sum) {
                    if (maxJob.compareTo(job) < 0) {
                        continue;
                    }
                }

                max = sum;
                maxJob = job;
            }
        }

        //System.out.println(maxJob + " : " + max);

        return maxJob;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
