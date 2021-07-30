
public class sixteen_six_HanSeongHwa_20210726 {
	public static void main(String[] args) {
		int num = 1221;
		boolean result = isHappy(num);
		
		System.out.println(result);
	}
	public static boolean isHappy(int n) {
		boolean res = true;
		int num = n;
		int count = 0;
		while(num != 1) {
			String string = Integer.toString(num);
			num = 0;
			for(int i = 0;i<string.length();i++) {
				num = num + Integer.parseInt(string.substring(i,i+1)) * Integer.parseInt(string.substring(i,i+1));
			}
			count++;
			if(count >100) {
				num = 2;
				break;
			}
		}
		
		if(num == 1) {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}
}
