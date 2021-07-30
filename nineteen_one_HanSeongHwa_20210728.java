
public class nineteen_one_HanSeongHwa_20210728{
	public static void main(String [] args) {
		int[] nums = {1,3};
		int result = subsetXORSum(nums);
		
		System.out.println(result);
	}
	public static int subsetXORSum(int[] nums) {
		return SUM(nums,0,0);
	}
	private static int SUM(int[] nums, int i, int target) {
		if(i == nums.length) {
			return target;
		}
		return SUM(nums,i+1,target^nums[i]) + SUM(nums,i+1,target);
	}
}