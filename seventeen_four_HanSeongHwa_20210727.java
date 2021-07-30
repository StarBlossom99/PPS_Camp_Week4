import java.util.Arrays;

public class seventeen_four_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		String s = "anagram";
		String t = "nagaram";
		
		boolean result = isAnagram(s,t);
		
		System.out.println(result);
	}
	public static boolean isAnagram(String s, String t)	 {
		boolean result = true;
		if(s.length() != t.length()) {
			result = false;
			return result;
		}
		char[] s1 = new char[s.length()];
		char[] t1 = new char[t.length()];
		
		for(int i = 0;i<s.length();i++) {
			s1[i] = s.charAt(i);
			t1[i] = t.charAt(i);
		}
		Arrays.sort(s1);
		Arrays.sort(t1);
		
		for(int i = 0;i<s.length();i++) {
			if(s1[i] != t1[i]) {
				result = false;
				return result;
			}
		}
		return result;
	}
}
