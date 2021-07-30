import java.util.*;

public class nineteen_seven_HanSeongHwa_20210728 {
	public static void main(String[] args) {
		String string = "abcabcbb";
		int result = lengthOfLongestSubstring(string);
		
		System.out.println(result);
	}
	public static int lengthOfLongestSubstring(String s) {
		int result = 1;
		if(s.length() == 0) {
			return 0;
		}
		Set<Character> set = new HashSet<Character>();
		int i = 0;
		int j = 0;
		while(i<s.length()) {
			while (set.contains(s.charAt(i))) {
                set.remove(s.charAt(j));
                j++;
            }
			
			set.add(s.charAt(i));
			
			result = Math.max(result, i-j+1);
			i++;
		}
		
		return result;
	}
}
