import java.util.Scanner;

public class twenty_six_HanSeongHwa_20210730 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int N = kb.nextInt();
		int M = kb.nextInt();
		int sum = 0;
		
		int[] nums = new int[N];
		for(int i = 0;i<N;i++) {
			nums[i] = kb.nextInt();
		}
		kb.close();
		
		for(int i = 0;i<N-2;i++) {
			for(int j = i+1;j<N-1;j++) {
				for(int k = j+1;k<N;k++) {
					if(nums[i] + nums[j] + nums[k] <= M) {
						sum = Math.max(sum, nums[i] + nums[j] + nums[k]);
					}
				}
			}
		}
		
		System.out.println(sum);
	}
}
