package p20;

import java.util.LinkedHashMap;

public class Excute {
	public static void main(String[] args) {
		Service s = new Service();
		LinkedHashMap<String, Object> hm = new LinkedHashMap<String, Object>();
		hm.put("cidesc","네트워크보안반");
		hm.put("cino",3);
		int result = s.updateClassInfo(hm);
		if(result==1) {
			System.out.println("업데이트 잘됬음!");
		}
		
		hm=new LinkedHashMap<String,Object>();
		hm.put("cino",11);
		int  result1 =s.deleteClassInfo(hm);
		if(result1==1) {
			System.out.println("삭제 잘됬음!");
		}
	
 
	
	
	}

}
