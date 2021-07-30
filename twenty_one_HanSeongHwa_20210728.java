import java.util.*;
public class twenty_one_HanSeongHwa_20210728 {
	public static void main(String[] args) {
		String s = "paper";
		String t = "title";
		
		boolean result = isIsomorphic(s,t);
		System.out.println(result);
	}
	public static boolean isIsomorphic(String s, String t) {
		if(s.length() != t.length()) {
			return false;
		}
		
		List<Character> list1 = new ArrayList<Character>();
		List<Character> list2 = new ArrayList<Character>();
		
		for(int i = 0;i<s.length();i++) {
			char s1 = s.charAt(i);
			char t1 = t.charAt(i);
			
			if(!list1.contains(s1) && !list2.contains(t1)) {
				list1.add(s1);
				list2.add(t1);
			}
			else if(list1.contains(s1) && list2.contains(t1)) {
				int a = list1.indexOf(s1);
				int b = list2.indexOf(t1);
				if(a!=b) {
					return false;
				}
			}
			else {
				return false;
			}
		}
		return true;
	}
}
