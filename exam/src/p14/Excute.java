package p14;

import java.util.ArrayList;
import java.util.Random;

public class Excute {

	public static void main(String[] args) {
		ArrayList<MapExam> al = new ArrayList<MapExam>();
		MapExam me = new MapExam();

		// me.put("name","ppp");
		// me.put("name","ppp1");
		// me.put("name","ppp2");
		// me.put("name","ppp3");
		// me.put("name","ppp4");
		// me.put("name","ppp5");
		// me.remove("name");
		// System.out.println(me.get("name"));
		// System.out.println(me.size());
		//

		Random r = new Random();
		for (int i = 0; i < 10; i++) {
			me = new MapExam();
			me.put("name", "r" + i);
			int age = r.nextInt(100) + 1;
			me.put("age", age + "");
			me.put("address","서울");
			al.add(me);
			// me.put("age",);
			// 랜덤값 최소값 = 1, max = 100;
			// ArrayList<MapExam> 하나씩 추가

		}
		for (MapExam m : al) {
//			System.out.println("name : " + m.get("name"));
//			System.out.println(",age : " + m.get("age"));
            System.out.println(m);
			
		}
	}

}
