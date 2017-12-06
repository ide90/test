package p12;

import java.util.ArrayList;
import java.util.Scanner;

public class ListExam {
	private ArrayList<String> alStr = new ArrayList<String>();

	void inputAlStr() {
		Scanner s = new Scanner(System.in);
		System.out.println("숫자스트링을 넣어주세요. 구분자는 , 입니다.");
		String str = s.nextLine();
		String strs[] = str.split(",");
		for(int i=0;i<strs.length;i++){
			alStr.add(strs[i]);
		
		}
	}

	void add(String str) {
		// ListExam(){
		// alStr = new ArrayList<String>();
		// }

		// 처음 alStr변수에 값을 add했을때는 "처음값을추가하셨군요"라는 메세지 처음아니라면 바로전입력한값출력
		// if(alStr.isEmpty()){
		//           //size()==0
		// System.out.println("처음추가했네?");
		// }else{
		// System.out.println(alStr.get(alStr.size()-1));
		// }
		alStr.add(str);
	}

	String get(int idx) {
		return alStr.get(idx);
	}

	void remove(int idx) {
		alStr.remove(idx);
	}

	void printAlStr() {
		// for(String s : alStr){
		// System.out.println(s);

		// for(int i=0;i<alStr.size();i++){
		// System.out.println(i+"번쨰값 : "+ alStr.get(i));
		// for (int i = 0; i < alStr.size(); i++) {
		// if (Integer.parseInt(alStr.get(i)) % 2 == 0) {
		// remove(i);
		// i--;
		// } else {
		// System.out.println(i + "번째 값: " + alStr.get(i));
		// }
		for (int i = 0; i < alStr.size(); i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			if (num%2 == 0) {
				remove(i);
				i--;
			} else {
				System.out.println(i + "번째 값: " + alStr.get(i));
			}

		}

	}

	void printAlStr2() {
		int sum =0;
		for (int i = 0; i < alStr.size(); i++) {
			String numStr = alStr.get(i);
			int num = Integer.parseInt(numStr);
			sum+= num;
			System.out.println(i + "번째 값: " + numStr);
		}
			System.out.println("입력하신 총 숫자의 합은" + sum);
		}
	
}
