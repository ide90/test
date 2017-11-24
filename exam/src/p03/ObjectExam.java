package p03;

import java.util.Scanner;

public class ObjectExam {
	int num1;
	int num2;
	
	public ObjectExam(){
		System.out.println("기본 생성자를 호출하셨군요!");
		
	}
	void add(){
		 num1 = 3;  //같은 num int선언x
	     System.out.println("ObjectExam의 num1 = " + num1);	
	     System.out.println("add()함수 호출했구나");
	
	}
	
	
	int getNum2(int num2){
		return num2;
		
	}
	public void inputNums(){
		Scanner s = new Scanner(System.in);
		System.out.println("첫번째 숫자를 입력해주세요:");
		num1 = s.nextInt();
		System.out.println("두번째 숫자를 입력해주세요:");
		num2 = s.nextInt();
	}
	
	public void printLoop(){
		for(int i=num1;i<num2;i++){
			System.out.print(i);
			if(i!=(num2-1)){
			System.out.print(",");
			if(i%10==0){
				System.out.println("");
			}
			
			
		/*for(int i=0;i<10;i++){
			System.out.print(i);
			if(i!=9){
			System.out.print(",");*/
		}
			
	 }
	}
	public static void main(String[] args){
		ObjectExam o;
		o = new ObjectExam();
		o.inputNums();
		o.printLoop();
		
		
		
		
		
		
		
		
		
		
		
		/*o.num1 = 1;
		o.num2 = 10;
		o.printLoop();
		
		ObjectExam o2;
		o2 = new ObjectExam();
		o2.num1 = 2;
		o2.num2 = 20;
		o2.printLoop(); */
		
		
		
		/*o.add();
		o.num1 = 4;
		System.out.println(o.num1);
		System.out.println(o.getNum2(3));
		System.out.println(o.num2);*/
	}
}
