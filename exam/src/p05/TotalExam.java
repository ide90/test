package p05;

import java.util.Scanner;

public class TotalExam {
	
		int a;
		Integer ac;
		boolean b;
		Boolean bc;
					
	
	public static void main(String args[]){
        TotalExam te = new TotalExam();
        if(te.a==1 || te.a==2 || te.a==3){
        	System.out.println("a가 0이 아니네요");
        }else if(te.a==0){
        	System.out.println("a가0이 이네요");
        	//&& true true 
        }
		System.out.println(Integer.parseInt("167")==167);
		System.out.println("스트링배열변수의 방갯수를 입력해주세요");
		Scanner s = new Scanner(System.in);
		int length = s.nextInt();
		String[] strArr = new String[length];
		 
		for(int i=0;i<strArr.length;i++){
			 System.out.println((i+1)+ "번째 방의 값을 입력해주세요");
			strArr[i]= s.nextInt() + ""; 
		}
		int sum = 0;
		for(int i=0;i<strArr.length;i++){
			 sum+=Integer.parseInt(strArr[i]);
		}
		  System.out.println(sum);
		   
		 }
		
	
		
		
		
//		//System.out.println(Integer.parseInt("1a67"));//f
//		System.out.println(Double.parseDouble("1.67"));//t
//
//		int a=0;
//		double b = 0.0;
//		System.out.println(Double.parseDouble(Double.toString(a)));

//		String[] strArr = new String[3];
//		System.out.println(strArr.length);
//		System.out.println(strArr[0].length()); //같
//		strArr[0] = "123";
//		strArr[1] = "123";
//		strArr[2] = "123";
//		System.out.println(strArr[0].equals("123"));  //(strArr[0]=="123") => 값비교는 equal   	
//	}
//	
	
}
