import java.util.Arrays;
import java.util.Scanner;

public class seventeen_nine_HanSeongHwa_20210727 {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		
		int num = kb.nextInt();
		int[] array = new int[num];
		for(int i = 0;i<array.length;i++) {
			array[i] = kb.nextInt();
		}
		kb.close();
		
		Arrays.sort(array);
		
		
		int sum = 0;
		for(int i = 0;i<num;i++) {
			sum = sum + (num-i)*array[i];
		}
		System.out.println(sum);
	}
}
