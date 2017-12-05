package p11;

import java.util.ArrayList;
import java.util.Random;

public class ListExam {
	// public static void main(String[] args) {
	// ArrayList<Integer> al = new ArrayList<Integer>();
	//
	// for (int i = 0; i < 10; i++) {
	// Random r = new Random();
	// int n = (r.nextInt(10) + 1);
	// if (al.indexOf(n) == -1) {
	// al.add(n);
	// } else {
	// i--;
	// }
	//
	// }
	// for (Integer i : al) {
	// System.out.println(i);
	// }
	// }
	//
	// }
	int nums[] = new int[0];

	public boolean add(int num) {
		int len = nums.length;
		int[] copy_num = new int[len + 1];
		for (int i = 0; i < nums.length; i++) {
			copy_num[i] = nums[i];

		}
		copy_num[len] = num;
		nums = copy_num;
		return true;
	}

	public int indexOf(int num) {
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == num) {
				return i;

			}
		}
		return -1;
	}

	public int size() {
		return nums.length;
	}

	public static void main(String[] args) {
		ListExam le = new ListExam();
		for (int i = 0; i < 10; i++) {
			le.add(i);

		}
		System.out.println(le.indexOf(3));
		System.out.println(le.indexOf(2));
		System.out.println(le.indexOf(11));

	}
}
