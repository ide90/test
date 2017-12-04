package p07;

public class CallBy {

//	void doFunc(int[] a, int[] b){
//		a = new int[4];
//		a[0]=3;
//		
//	}
//	public static void main(String[] args){
//    	int[] a = new int[1];
//    	int[] b = new int[2];
//    	
//    	CallBy cb = new CallBy();
//    	cb.doFunc(a,b);
//    	System.out.println(a[0]);
//    	System.out.println(a.length);
    int c;
	
	int[] doFunc(int[] a ) {
		System.out.println("파라메터로 받은 a 주소 : " + a);
		a = new int[a.length];
		System.out.println("새로 받은 a 주소 : " + a);
		return a;
	}
	
	public static void main(String[] args) {
		int[] a = new int[1];
		System.out.println("원래 a 주소 : " + a);
		CallBy cb = new CallBy();
		a = cb.doFunc(a);	
		System.out.println("함수 호출 후 a 주소 : " + a);
    	}
}
