package p11;

import java.util.ArrayList;
import java.util.HashMap;

public class MapExam {

	public static void setHm(HashMap<String, String> hm) {
		hm.put("name", "박경훈");
		hm.put("name", "김경훈");
		hm.put("age", "33");
	}

	public static void main(String[] args) {
		HashMap<String, String> hm = new HashMap<String, String>();

		ArrayList<HashMap<String, String>> alMap = new ArrayList<HashMap<String, String>>();
		for(int i=0;i<4;i++){
			hm = new HashMap<String,String>();
			hm.put("age",i+"");
			
		
		alMap.add(hm);
		}
		for(HashMap<String,String> h : alMap){
			System.out.println(h.get("age"));
		}
		setHm(hm);
//		System.out.println(alMap.get(0).get("name"));
//		System.out.println(alMap.get(0).get("age"));
//		System.out.println(hm.get("name"));
//		System.out.println(hm.get("age"));

	}
	// key중복불가,value중복가능

}