
public class eighteen_six_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		int n = 4;
		int result = fib(n);
		
		System.out.println(result);
	}
	public static int fib(int n) {
		int a = 0;
		int b = 1;

		int sum = 0;
		if(n == 1) {
			sum = 1;
		}
		if(n == 2) {
			sum = 1;
		}
		for(int i =0;i<n-1;i++) {
			sum = a + b;
			a = b;
			b = sum;
		}
		
		return sum;
	}
}