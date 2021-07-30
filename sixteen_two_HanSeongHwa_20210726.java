import java.util.*;

public class sixteen_two_HanSeongHwa_20210726 {
	public static void main(String[] args) {
		int[] nums = {4,3,2,7,8,2,3,1};
		List<Integer> array = findDisappearedNumbers(nums);
		
		System.out.println(array);
	}
	public static List<Integer> findDisappearedNumbers(int[] nums){
		Set<Integer> array = new HashSet<Integer>();
		List<Integer> result = new ArrayList<Integer>();

		for(int i = 0 ; i<nums.length;i++) {
			array.add(nums[i]);
		}
		
		for(int i = 1;i<=nums.length;i++) {
			if(!array.contains(i)) {
				result.add(i);
			}
		}
		
		return result;
	}
}
