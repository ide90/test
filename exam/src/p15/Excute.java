package p15;

import java.util.ArrayList;

public class Excute {
	// public static void print(Server s1) {
	// s1.print();
	// if(s1 instanceof Controllar) {
	// Controllar c = (Controllar)s1;
	// c.print(1);
	// }else {
	// s1.print();
	// }
	// }

	public static void main(String[] args) {
		// Server s1= new Controllar();
		// Server s2= new Service();
		// print(s1);
		// print(s2);

		Controllar e = new Controllar();
		ArrayList<User> userList = e.get("list", null);
		for (int i = 1; i <= 5; i++) {
			User user = new User("이름" + i, i, i);
			e.get("add", user);
		}
//		for (User user : userList) {
//			System.out.println(user);
//		}
//		User ru = new User(3);
//		e.get("remove", ru);
//		for (User user : userList) {
//			System.out.println(user);
//
//		}
//		ru.setName("이름1");
//	    userList=e.get("search", ru);
//	    System.out.println("검색결과");
//	    for (User user : userList) {
//			System.out.println(user);
//
//	 }
		User user = new User("모모",20,2);
		e.get("update", user);
		System.out.println("수정결과:");
		for(User u : userList) {
			System.out.println(u);
		}
					
		
		
		userList = e.get("search", user);
		e.get("add", user);
		System.out.println("검색결과 : " );
		for(User u : userList) {
			System.out.println(u);
											
		}
	}
}
