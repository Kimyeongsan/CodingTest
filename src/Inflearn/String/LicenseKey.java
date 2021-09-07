package Inflearn.String;

public class LicenseKey {
	
	public String solve(String s, int k) {
		
		String newStr = s.replace("-", "");
		newStr = newStr.toUpperCase();
		
		StringBuilder sb = new StringBuilder(newStr);
		
		int sbLength = sb.length();
		
		for(int i = k; i < sbLength; i = i + k) {  // 4 + 4
			sb.insert(sbLength - i, '-');  // 8 - 4
		}
		
		newStr = sb.toString();
		
		return newStr;
	}
	

	public static void main(String[] args) {
		LicenseKey license = new LicenseKey();
		
		String s = "8F3Z-2e-9-w-wabcdef";
		int i = 4;
		
		System.out.print(license.solve(s, i));

	}

}
