import java.util.*;
public class twenty_three_HanSeongHwa_20210729 {
	public static void main(String[] args) {
		String[] words = {"omk"};
		String[] result = findWords(words);
		
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static String[] findWords(String[] words) {
		List<String> list = new ArrayList<String>();
		
		boolean check = true;
		String one = "qwertyuiop";
		String two = "asdfghjkl";
		String three = "zxcvbnm";
		
		for(int i = 0;i<words.length;i++) {
			check = true;
			String sample = words[i].toLowerCase();
			int num = 0;
			
			if(one.contains(sample.substring(0,1))) {
				num = 1;
			}
			else if(two.contains(sample.substring(0,1))) {
				num = 2;
			}
			else if(three.contains(sample.substring(0,1))) {
				num = 3;
			}
			
			for(int j = 1;j<sample.length();j++) {
				String char_sample = sample.substring(j,j+1);
				if(one.contains(char_sample)) {
					if(num != 1) {
						check = false;
						break;
					}
				}
				else if(two.contains(char_sample)) {
					if(num != 2) {
						check = false;
						break;
					}
				}
				else if(three.contains(char_sample)) {
					if(num != 3) {
						check = false;
						break;
					}
				}
			}
			
			if(check == true) {
				list.add(words[i]);
			}
		}
		String[] result = new String[list.size()];
		
		for(int i = 0;i<list.size();i++) {
			result[i] = list.get(i);
		}
		return result;
	}
}
