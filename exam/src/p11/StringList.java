package p11;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class StringList {

	int minSize = 0;
	int maxSize = 0;

	StringList() {
		sl = new ArrayList<Integer>();
		Scanner s = new Scanner(System.in);
		System.out.println("초기값을 입력해주세요=>");
		minSize = s.nextInt();
		System.out.println("최대값을 입력해주세요=>");
		maxSize = s.nextInt();
	}

	void initSl() {
		Random r = new Random();
		for (int i = minSize; i <= maxSize; i++) {
			int n = (r.nextInt(maxSize - minSize) + 1);
			if (sl.size() == (maxSize - minSize) / 2) {
				i = maxSize;
			}
			if (n % 2 == 0) {
				sl.add(n);
			} else {
				i--;
			}
		}
	}

	void printsl() {

	}

	public static void main(String[] args) {
		StringList sl = new StringList();
		sl.sl = new ArrayList<Integer>();
		sl.initSl();
		sl.printsl();
		System.out.println(sl.sl.size());

	}

}
