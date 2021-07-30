
public class eighteen_one_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		int n = 2;
		int[] array = countBits(n);
		
		for(int i = 0;i<array.length;i++) {
			System.out.println(array[i]);
		}
	}
	public static int[] countBits(int n) {
		int[] result = new int[n+1];
		
		for(int i = 0;i<result.length;i++) {
			result[i] = countone(Integer.toBinaryString(i));
		}
		
		return result;
	}
	public static int countone(String s) {
		int sum = 0;
		for(int i = 0;i<s.length();i++) {
			if(s.substring(i,i+1).equalsIgnoreCase("1")) {
				sum++;
			}
		}
		return sum;
	}
}
