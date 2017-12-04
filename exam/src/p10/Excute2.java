package p10;

public class Excute2 {
	
	public static void main(String [] args){
		
		Object p1 = new Person();
		Object p2 = new P2();
		Object p3 = new P3();
		Object p4 = new P4();

		Object [] os = new Object[4];
        os[0] = p1;
        os[1] = p2;
        os[2] = p3;
        os[3] = p4;
		
//		System.out.println(p1.toString());
//		System.out.println(p2.toString());

        
	}

}
// 	P3 클래스 생성 p2 상속받아주기
// 	p4클래스 생성 p3 상속받아주기
// 	toString()함수를 모두다 선언
// 	각각의 클래스들을 모두다 Object 데이터 타입으로 변수 선언 및 생성자 호출하여 
// 	초기화한후 Object 배열에 넣어주기
// 	반복문을 사용하여 Object 배열에 있는 각각의 방에 있는 변수 
// 	System.out.println()으로 출력 