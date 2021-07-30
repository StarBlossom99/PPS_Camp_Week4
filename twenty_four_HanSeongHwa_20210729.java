import java.util.*;

public class twenty_four_HanSeongHwa_20210729 {
	public static void main(String[] args) {
		String s = "jglknendplocymmvwtoxvebkekzfdhykknufqdkntnqvgfbahsljkobhbxkvyictzkqjqydczuxjkgecdyhixdttxfqmgksrkyvopwprsgoszftuhawflzjyuyrujrxluhzjvbflxgcovilthvuihzttzithnsqbdxtafxrfrblulsakrahulwthhbjcslceewxfxtavljpimaqqlcbrdgtgjryjytgxljxtravwdlnrrauxplempnbfeusgtqzjtzshwieutxdytlrrqvyemlyzolhbkzhyfyttevqnfvmpqjngcnazmaagwihxrhmcibyfkccyrqwnzlzqeuenhwlzhbxqxerfifzncimwqsfatudjihtumrtjtggzleovihifxufvwqeimbxvzlxwcsknksogsbwwdlwulnetdysvsfkonggeedtshxqkgbhoscjgpiel";
		int result = longestPalindrome(s);
			
		System.out.println(result);
	}
	public static int longestPalindrome(String s) {
		int result = 0;
		HashMap<String,Integer> list = new HashMap<String,Integer>();
		List<Integer> array = new ArrayList<Integer>();
		
		if(s.length()==1) {
			return 1;
		}
		for(int i = 0;i<s.length();i++) {
			String sample = s.substring(i,i+1);
			if(!list.containsKey(sample)) {
				list.put(sample, 1);
			}
			else {
				list.replace(sample, list.get(sample)+1);
			}
		}
		
		for(Map.Entry<String, Integer> e : list.entrySet()) {
			System.out.println(e.getKey()+ "   " + e.getValue());
			if(e.getValue()%2 == 0) {
				result = result+e.getValue();
			}
			else {
				array.add(e.getValue());
			}
		}
		
		if(array.size()==1) {
			result = result + array.get(0);
		}
		else if(array.size()>1) {
			for(int i = 0;i<array.size();i++) {
				result = result +  array.get(i)-1;
			}
			result++;
		}
		
		return result;
	}
}
