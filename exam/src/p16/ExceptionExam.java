package p16;

import java.util.Scanner;

public class ExceptionExam {

	public void convertAndPrint(String numStr) throws Exception {
		// try {
		// System.out.println(Integer.parseInt(numStr) + 1);
		// } catch (Exception e) {
		// System.out.println("숫자를 적어야지");
		// }
		System.out.println(Integer.parseInt(numStr) + 1);

	}

	public static void main(String[] args) {
		ExceptionExam ee = new ExceptionExam();
		System.out.println("출력하실 숫자를 적어주세요");
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		try {
			ee.convertAndPrint(str);
		} catch (Exception e) {
			System.out.println("숫자를 적어달라고 했잖아요ㅜㅜ");
			System.out.println("출력하실 숫자를 적어주세요");
			str = s.nextLine();
			try {
				ee.convertAndPrint(str);
			} catch (Exception e1) {
				System.out.println("숫자를 적어달라고 했잖아요ㅜㅜ");

			}

		}

	}

}
