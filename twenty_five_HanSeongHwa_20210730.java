public class twenty_five_HanSeongHwa_20210730 {
	public static void main(String[] args) {
		String s = "dddccdbba";
		int result = firstUniqChar(s);
		
		System.out.println(result);
	}
	public static int firstUniqChar(String s) {
		for(int i = 0;i<s.length();i++) {
			String sample = s.substring(0,i) + s.substring(i+1);
			String ch = s.substring(i,i+1);
			
			if(!sample.contains(ch)) {
				return i;
			}
		}
		
		if(s.length() == 1) {
			return 0;
		}
		return -1;
	}
}
