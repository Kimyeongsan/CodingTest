package Progremerse.Level1.weekly;

// 4주차 : 직업군 추천하기
public class Recommendation {
	
    public String solution(String[] table, String[] languages, int[] preference) {
        int max = 0;
        String maxJob = "";

        // 한 문단씩 나누기
        for (int i = 0; i < table.length; i++) {
            String jobLang[] = table[i].split(" ");
            String job = "";
            int sum = 0;

            // "SI JAVA JAVASCRIPT SQL PYTHON C#"
            for (int j = 0; j < jobLang.length; j++) {
                int score = jobLang.length - j;

                //0번째 직업군 이름 : SI
                if (j == 0) {
                    job = jobLang[j];
                    continue;
                }

                //직업군 언어와 개발자언어가 같은 경우 점수 계산
                // "PYTHON", "C++", "SQL"
                for (int k = 0; k < languages.length; k++) {
                    if (languages[k].equals(jobLang[j])) {
                        sum += preference[k] * score;
                    }
                }
            }

            //점수가 가장 크거나 같을때
            if (max <= sum) {
                //점수가 같으면 사전순으로 비교 (음수일 경우 사전순으로 더 빠르기 때문에 스킵)
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
