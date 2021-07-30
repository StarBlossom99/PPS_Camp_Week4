import java.util.Arrays;

public class twenty_two_HanSeongHwa_20210729 {
	public static void main(String[] args) {
		int[] nums = {3,0,1};
		
		int result = missingNumber(nums);
		
		System.out.println(result);
	}
	public static int missingNumber(int[] nums) {
		int result = 0;
		boolean tick = false;
		Arrays.sort(nums);
		
		for(int i = 0;i<nums.length;i++) {
			if(nums[i] !=i) {
				return i;
			}
		}
		if(tick == false){
			return nums.length;
		}
		return result;
	}
}
