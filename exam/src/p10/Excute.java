package p10;

//public class Excute extends Father {
//	// int a = 4;
//
//	Excute(int num1, int num2) {
//		super(num1, num2);
//
//	}
//
//	public void print() {
//		System.out.println("내꺼 프린트 ");
//
//	}
//
//	public void print(int a) {
//		if (a == 0) {
//			this.print();
//		} else {
//			super.print();
//
//		}
//	}
//
//	//
//	// public void print() {
//	// System.out.println("아들 프린트"); // overloading
//	// }
//	//
//	// public void print(int a) {
//	// System.out.println("아들 프린트:" + a); // overriding
//	// }
//
//	public static void main(String[] args) {
//		// Excute e = new Excute(1,999);
//		// e.print();
//		// Father e = new Excute(1,40);
//		// Excute e2 = (Excute)e;
//		// e2.print(1);
//
//		Father f = new Father(1, 2);
//		Father f1 = new Son();
//		Father f2 = new Excute(1, 2);
////		System.out.println(f2 instanceof Excute); // 대신불러두되니
////		System.out.println(f2 instanceof Father);
////		System.out.println(f instanceof Excute);
//		Father[] fs = new Father[3];
//		fs[0] = new Father(1, 2);
//		fs[1] = new Son(); 
//		fs[2] = new Excute(1, 2);
//	}
//
//}
public class Excute{
	public void print(Father f){
		System.out.println(f.toString());
	}
	public static void main(String[] args){
		Father f = new Father(1,2);
		Excute e = new Excute();
		e.print(f);
		System.out.println(f);
		
	}

}