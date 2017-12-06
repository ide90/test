package p12;

import java.util.HashMap;

public class MapExam {
	HashMap<Integer, String> hm = new HashMap<Integer, String>();

	void add(String str) {
		hm.put(hm.size(), str);

	}

	public static void main(String[] args) {
		MapExam me = new MapExam();
		for(int i=0;i<10;i++){
			me.add((i+1)+"번째값");
		}
//		me.add("asdf");
//		me.add("asdf");
//		me.add("asdf");
//		me.add("asdf");
		System.out.println(me.hm);
	}

}
