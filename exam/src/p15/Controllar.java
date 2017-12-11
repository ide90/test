package p15;

import java.util.ArrayList;

public class Controllar {

	private Service service;

	// public void print() {
	// super.print();
	// System.out.println("서버를 담당하는 클래스입니다.");
	// }
	// public void print(int a) {
	// super.print();
	// System.out.println("그리고 숫자도 출력해요 : " + a);

	public Controllar() {
		service = new Service();

	}

	public ArrayList<User> get(String command, User user) {
		if (command.equals("list")) {
			return getUserList(null);
		} else if (command.equals("add")) {
			boolean isOk = insertUser(user);
			if (isOk) {
				System.out.println(user.getName() + "입력완료!");

			} else {
				System.out.println("입력중에 알 수 없는 에러가 발생했습니다.");
			}
		} else if (command.equals("remove")) {
			boolean isOk = removeUser(user);
			if (isOk) {
				System.out.println(user.getName() + "삭제 완료!");

			} else {
				System.out.println("삭제중 알수없는 에러가 발생했습니다.");
			}
		} else if (command.equals("update")) {
			boolean isOk = updateUser(user);
			if (isOk) {
				System.out.println(user.getName() + "수정 완료!");

			} else {
				System.out.println("수정중 알수없는 에러가 발생했습니다.");
			}
		} else if (command.equals("search")) {
			return getUserList(user.getName());
		}
		return null;
	}

	public boolean insertUser(User user) {
		return service.insertUser(user);
	}

	public boolean removeUser(User user) {
		return service.removeUser(user);
	}

	public ArrayList<User> getUserList(String str) {
		return service.getUserList(str);
	}

	public boolean updateUser(User user) {
		return service.updateUser(user);
	}
}
