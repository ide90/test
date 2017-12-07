package p13;

import java.util.ArrayList;

public class Exam {

	static void tt(ArrayList<Person> al) {
		al = new ArrayList<Person>();
		al.add(new Person());
	}

	public static void main(String[] args) {
		// ArrayList<Person>al = new ArrayList<Person>();
		//
		// Person p = new Person();
		// al.add(p);
		// p.setAge(3);
		// System.out.println(al.get(0).getAge());
		// p = new Person();
		// p.setAge(4);
		// al.add(p);
		// System.out.println(al.get(0).getAge());
		//
		// }
		//
		// }
		ArrayList<Person> nums = new ArrayList<Person>();

		Person p = new Person();
		nums.add(p);
		p = new Person();
		nums.add(p);
		p.setAge(3);
		System.out.println(nums.get(0));
		System.out.println(nums.get(1));
		System.out.println(p);
		nums = new ArrayList<Person>();
		System.out.println(p.getAge());
	}
}
