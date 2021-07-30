import java.util.*;

public class seventeen_five_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		int[] nums1 = {1,2,2,1};
		int[] nums2 = {2,2};
		
		int[] result = intersection(nums1, nums2);
		
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> a = new HashSet<Integer>();
		Set<Integer> b = new HashSet<Integer>();
		
		List<Integer> c = new ArrayList<Integer>();
		
		for(int i = 0;i<nums1.length;i++) {
			a.add(nums1[i]);
		}
		for(int i = 0;i<nums2.length;i++) {
			b.add(nums2[i]);
		}
		
		if(nums1.length <= nums2.length) {
			for(int i = 0;i<nums1.length;i++) {
				if(b.contains(nums1[i]) && !c.contains(nums1[i])) {
					c.add(nums1[i]);
				}
			}
		}
		else {
			for(int i = 0;i<nums2.length;i++) {
				if(a.contains(nums2[i]) && !c.contains(nums2[i])) {
					c.add(nums2[i]);
				}
			}
		}
		
		int[] result = new int[c.size()];
		
		for(int i =0;i<result.length;i++) {
			result[i] = c.get(i);
		}
		
		return result;
	}
}
