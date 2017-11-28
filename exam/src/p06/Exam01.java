package p06;

public class Exam01 {
	public static void main(String[] args) {
		
		for (int i = 9; i > 0; i--) {
			for(int j = 9; j> 0; j--) {
         //구구단을 역순으로
		 //가로로 구구단이 진행될때마다 , 출력
		 //가로가 끝났을때는 ,가 없이 엔터값이 출력
		//i와 j가 곱한값이 3의 배수일때는 '3의 배수' 문자열 출력
				
				String str = i+"x"+j+"="+(i*j);
				if(i*j %3 == 0){
					str = "3의배수";
				}
				System.out.print(str);

				if(j!=1){
					System.out.print(",");
				}
				
				
			}
			System.out.println();

		}
	}
}
