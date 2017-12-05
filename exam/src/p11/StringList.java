package p11;

import java.util.ArrayList;

public class StringList extends ArrayList{

//	ArrayList<String> alStr;
//	StringList(){
//		alStr = new ArrayList<String>();
//	}
	public String toString(){
		return "난 내가 뭘 찍어야할지 모르겠다.";
				
	}
	public static void main(String[] args){
//	
//		StringList sl = new StringList();
//		int len = sl.alStr.size();
//	    System.out.println(len);
//	    
		ArrayList sl = new StringList();
		sl.add("fd");
		sl.add("fd");
		System.out.println(sl);
		
	}

}
