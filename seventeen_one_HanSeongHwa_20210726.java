
public class seventeen_one_HanSeongHwa_20210726 {
	public static void main(String[] args) {
		int[] nums = {-1};
		int result = maxSubArray(nums);
		
		System.out.println(result);
	}
	public static int maxSubArray(int[] nums) {
		int max = nums[0];
		int max_subarray = nums[0];
		
		for(int i = 1;i<nums.length;i++) {
			int num = nums[i];
			
			max_subarray = Math.max(num, max_subarray + num);
			max = Math.max(max, max_subarray);
		}
		
		return max;
	}
}
