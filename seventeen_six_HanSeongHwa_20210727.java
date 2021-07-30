import java.util.*;

public class seventeen_six_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		int[] arr1 = {2,3,1,3,2,4,6,7,9,2,19};
		int[] arr2 = {2,1,4,3,9,6};
		
		int[] result = relativeSortArray(arr1,arr2);
		
		for(int i = 0;i<result.length;i++) {
			System.out.println(result[i]);
		}
	}
	public static int[] relativeSortArray(int[] arr1, int[] arr2) {
		HashMap<Integer,Integer> array = new HashMap<Integer,Integer>();
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		
		for(int i =0;i<arr1.length;i++) {
			a.add(arr1[i]);
		}
		for(int i =0;i<arr2.length;i++) {
			b.add(arr2[i]);
		}
		int count = arr1.length;
		int index = 0;
		for(int i = 0;i<count;i++) {
			if(b.contains(a.get(index))) {
				a.remove(index);
			}
			else {
				index++;
			}
		}
		a.sort(null);;
		
		for(int i = 0;i<arr1.length;i++) {
			if(b.contains(arr1[i])) {
				if(array.containsKey(arr1[i])) {
					array.replace(arr1[i], array.get(arr1[i]) + 1);
				}
				else {
					array.put(arr1[i], 1);
				}
			}
		}
		
		int[] result = new int[arr1.length];
		count = 0;
		
		for(int i = 0;i<arr2.length;i++) {
			for(int j = 0;j<array.get(arr2[i]);j++) {
				result[count] = arr2[i];
				count++;
			}
		}
		
		for(int i = 0;i<a.size();i++) {
			result[count] = a.get(i);
			count++;
		}
		return result;
	}
}
