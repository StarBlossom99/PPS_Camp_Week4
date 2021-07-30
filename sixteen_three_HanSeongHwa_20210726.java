
public class sixteen_three_HanSeongHwa_20210726 {
	public static void main(String[] args) {
		String string= "MCDLXXVI";
		int result = romanToInt(string);
		
		System.out.println(result);
	}
	public static int romanToInt(String s) {
		int result = 0;
		for(int i = 0;i<s.length();i++) {
			String sample = s.substring(i,i+1);
			if(sample.equalsIgnoreCase("i")) {
				if(i==s.length()-1) {
					result++;
					break;
				}
				else if(i==s.length()-2) {
					if(s.substring(i+1,i+2).equalsIgnoreCase("v")) {
						result = result + 4;
						i++;
						break;
					}
					else if(s.substring(i+1,i+2).equalsIgnoreCase("x")) {
						result = result + 9;
						i++;
						break;
					}
					else {
						result++;
					}
				}
				else {
					if(s.substring(i+1,i+2).equalsIgnoreCase("x")) {
						result = result + 9;
						i++;
					}
					else if(s.substring(i+1,i+2).equalsIgnoreCase("v")) {
						result = result + 4;
						i++;
					}
					else {
						result++;
					}
				}
			}
			else if(sample.equalsIgnoreCase("v")) {
				if(i==s.length()-1) {
					result = result + 5;
					break;
				}
				else {
					result = result + 5;
				}
			}
			else if(sample.equalsIgnoreCase("x")) {
				if(i==s.length()-1) {
					result = result + 10;
					break;
				}
				else if(i==s.length()-2) {
					if(s.substring(i+1,i+2).equalsIgnoreCase("c")) {
						result = result + 90;
						i++;
						break;
					}
					else if(s.substring(i+1,i+2).equalsIgnoreCase("l")) {
						result = result + 40;
						i++;
						break;
					}
					else {
						result = result + 10;
					}
				}
				else {
					if(s.substring(i+1,i+2).equalsIgnoreCase("c")) {
						result = result + 90;
						i++;
					}
					else if(s.substring(i+1,i+2).equalsIgnoreCase("l")) {
						result = result + 40;
						i++;
					}
					else {
						result = result + 10;
					}
				}
			}
			else if(sample.equalsIgnoreCase("l")) {
				if(i==s.length()-1) {
					result = result + 50;
					break;
				}
				else {
					result = result + 50;
				}
			}
			else if(sample.equalsIgnoreCase("c")) {
				if(i==s.length()-1) {
					result = result + 100;
					break;
				}
				else if(i==s.length()-2) {
					if(s.substring(i+1,i+2).equalsIgnoreCase("m")) {
						result = result + 900;
						i++;
						break;
					}
					else if(s.substring(i+1,i+2).equalsIgnoreCase("d")) {
						result = result + 400;
						i++;
						break;
					}
					else {
						result = result + 100;
					}
				}
				else {
					if(s.substring(i+1,i+2).equalsIgnoreCase("m")) {
						result = result + 900;
						i++;
					}
					else if(s.substring(i+1,i+2).equalsIgnoreCase("d")) {
						result = result + 400;
						i++;
					}
					else {
						result = result + 100;
					}
				}
			}
			else if(sample.equalsIgnoreCase("d")) {
				if(i==s.length()-1) {
					result = result + 500;
					break;
				}
				result = result + 500;
			}
			else if(sample.equalsIgnoreCase("m")) {
				if(i==s.length()-1) {
					result = result + 1000;
					break;
				}
				result = result + 1000;
			}
		}
		return result;
	}
}
