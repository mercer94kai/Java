package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SubarrayOfzero {

	public static void main(String[] args) {

		int[] arr = {0,-2,1,3,2,-1};
		int flag=0;


		for (int i=0 ;i<arr.length;i++) {
			List<Integer> list = new ArrayList<>();
			for (int j =i; j<arr.length;j++) {
				Set<Integer> set = new HashSet<>();
				list.add(arr[i]);
				int x =-(arr[i]+arr[j]);

				if (list.contains(x)) {
					set.addAll(Arrays.asList(x, arr[i], arr[j]));
					if (set.size()==3) {
						flag=1;
						System.out.println(set);
					}
				}
				else {
					list.add(arr[j]);
				}
			}
		}
		if (flag==0) {
			System.out.println("No triplets present");
		}

	}

}
