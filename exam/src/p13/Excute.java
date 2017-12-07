package p13;

import java.util.ArrayList;

public class Excute {
	public static void main(String[] args) {
		Person p = new Person();
		// System.out.println(p.name);
		// System.out.println(p.age);
		// p.name=("asdf");
		// p.age =11;
		p.setName("asdf");
		p.setAge(20);
		ArrayList<Person> alPerson = new ArrayList<Person>();
		alPerson.add(p);
		// p = new Person();//안의값이..
		// System.out.println(alPerson.get(0).getName());
		// System.out.println(alPerson.get(0).getAge());

		p = new Person();
		p.setName("asdf");
		p.setAge(30);
		alPerson.add(p);
		for (int i = 0; i < alPerson.size(); i++) {
			Person pr = alPerson.get(i);
			for (int j = i + 1; j < alPerson.size(); j++) {
				Person pr2 = alPerson.get(j);
				if (pr.getAge() < pr2.getAge()) {
					Person tmpP = pr;
					pr = pr2;
					pr2 = tmpP;
					alPerson.set(i, pr); // i자리에 pr
					alPerson.set(j, pr2);// j자리에 pr2
				}
			}
		}
		for (Person pr : alPerson) {
			System.out.println(pr); // pr.toString()을 부르는거
		}
	}
}
