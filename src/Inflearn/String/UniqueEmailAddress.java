package Inflearn.String;

import java.util.HashSet;

public class UniqueEmailAddress {

	public int solution(String[] emails) {
		
		HashSet<String> set = new HashSet<>(); 
		
		for (String email : emails) {
			
			// split을 기준으로 part[0] 에는 앞부분, part[1]에는 뒷부분이 저장됨
			String[] part = email.split("@");
			String[] localName = part[0].split("\\+");
			
			set.add(localName[0].replace(".", "") + "@" + part[1]);
			
			
//			String domain = makeDomain(email);
//			String local = makeLocal(email);			
//			set.add(local + "@" + domain);	
		}
		
		System.out.println(set);
		
		return set.size();
	}

	
// StringBuilder . charAt . IndexOf
	
	// "test.email+james : Local
	private String makeLocal(String email) {
		StringBuilder sb = new StringBuilder();
		
		for(int i = 0; i < email.length(); i++) {
			if(email.charAt(i) == '.') {
				continue;
			} 
			else if(email.charAt(i) == '+' || email.charAt(i) == '@') {
				break;
			}
			sb.append(email.charAt(i));
		}
		
		return sb.toString();
	}

	// @coding.com : Domain
	private String makeDomain(String email) {
		return email.substring(email.indexOf('@') + 1);
	}

	public static void main(String[] args) {
		UniqueEmailAddress Address = new UniqueEmailAddress();

		String[] emails = { 
				"test.email+james@coding.com", 
				"test.e.mail+toto.@cod.ing.com",
				"testemail+jom@cod.ing.com", 
				};

		System.out.print(Address.solution(emails));
	}

}
