
public class eighteen_five_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		int n = 4;
		int result = climbStairs(n);
		
		System.out.println(result);
	}
	public static int climbStairs(int n) {
		int a = 1;
		int b = 1;

		int sum = 0;
		if(n == 1) {
			sum = 1;
		}
		if(n == 2) {
			sum = 2;
		}
		for(int i =0;i<n-1;i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return sum;
	}
}
