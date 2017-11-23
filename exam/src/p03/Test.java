package p03;

public class Test {
//같은폴더안 import x
	 String str;
	 
	 Test(String str){
		 this.str = str;   //this. 또는 명변경
		 
	 }

	
	
	void print(){
		System.out.println(str);
	}
	
	static void printInt(int a){
		System.out.println(a);
	}
	public static void main(String[] args){
		Test t = new Test("가나다ABC123");
		String str = ("나 여깄어요~~나");
		t.print();
		//t.print(str.replace("나", "박경훈"));
		
		//str = str.replace("나","박경훈"); //순서바뀜
		//t.print(str);
	
		System.out.println(str.indexOf("나")); //lastIndexOf :마지막부터
	     System.out.println(str.substring(1));
	  
	
	}
	
	
	
}
