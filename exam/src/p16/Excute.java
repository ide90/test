package p16;

public class Excute {
	
	 
	public void prinAction(Action act) {
		act.eat();
		//eat호출시 누가 먹는다
		act.sleep();
		//sleep 호출시 누가잔다
		act.walk();
		//walk 호출시 누가 걷는다
		
	}
	public static void main(String[] args) {
		
//		Action p = new Hong("Hong",20,173,"hong@gmail.com");
//		System.out.println(p);
//		((Hong)p).eat("ㅇㅇ");
//		p.eat();
//		p.sleep();
//		p.walk();
//	
		Hong hong = new Hong("Hong",20,173,"hong@gmail.com");
		Excute e = new Excute();
		e.prinAction(hong);
		//동물도 이름,나이,몸길이를 가지게 만들고 cat생성자 호출시 이름 나이 몸길이 저장하게 만들기
		Cat c = new Cat("먼지",3,13);
		e.prinAction(c);
	
	}

}
