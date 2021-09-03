package Progremerse.Level2;

public class SkillTree {
	  public int solution(String skill, String[] skill_trees) {
			int answer = 0;

			for (int i = 0; i < skill_trees.length; i++) {
				
				// Skill = C B A 
				
				String[] str = skill_trees[i].split("");  // B . A . C . D . E
				int next = 0;
				boolean ck = true;
				
				for(int j = 0; j < str.length; j++) {
					
					if(next < skill.indexOf(str[j])) {   // 0 < 3 
						ck = false;
					}
					
					else if (next == skill.indexOf(str[j])) { // °°´Ù¸é
						next++;
					}
				}
				
				if (ck) {
					answer++;
				}
				
			}
			return answer;
		}
	

	public static void main(String[] args) {
		SkillTree s = new SkillTree();
        String skill = "CBD";
        String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
        
        s.solution(skill, skill_trees);
        
        System.out.print(s.solution(skill, skill_trees));
	}

}
