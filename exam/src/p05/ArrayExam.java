package p05;

import java.util.Scanner;

public class ArrayExam {
	int num1,num2;
	//int=num1
	 // int=num2
	int[][] numArr;
	
	void inputNums(){
		Scanner scanner;
		
		scanner = new Scanner(System.in);
		System.out.println("1차원 배열변수의 갯수를 입력해주세요");
		num1 = scanner.nextInt();
		System.out.println("2차원 배열변수의 갯수를 입력해주세요");
		num2 = scanner.nextInt();
	}
	
	void initNumArr(){
		numArr = new int[num1][num2];
	
		for(int i=0;i<numArr.length;i++){
        	for(int j=0;j<numArr.length;j++){
		     numArr[i][j] = j+1; // =num++; 더하기전
        	}
		}
		
		for(int i=0;i<numArr.length;i++){
        	for(int j=0;j<numArr.length;j++){
		     numArr[i][j] = j+1+(i*numArr[i].length);
        	}
		}
	}
	void printNumArr(){
		for(int i=0;i<numArr.length;i++){
	  	for(int j=0;j<numArr.length;j++){
        	System.out.print(numArr[i][j]);
        if(j!=numArr[i].length-1){
        	System.out.print(",");
        }else{
        	System.out.println();
             }
	    	}
	  	}
	}
	
	public static void main(String[] args){
		ArrayExam ae = new ArrayExam();
		ae.inputNums();
		System.out.println(ae.num1);
		System.out.println(ae.num2);
		ae.initNumArr();
		ae.printNumArr();
		
		
//		Scanner scanner;
//		ArrayExam ae = new ArrayExam();
//		ae.scanner = new Scanner(System.in);
//		System.out.println("1차원 배열변수의 갯수를 입력해주세요");
//		ae.num1 = scanner.nextInt();
//		System.out.println("2차원 배열변수의 갯수를 입력해주세요");
//		ae.num2 = scanner.nextInt();
        
		int[][] numArr = new int[ae.num1][ae.num2];
		//int[][] numArr = new int[4][4];
//		for(int i=0;i<3;i++){
//        	for(int j=0;j<3;j++){
//		     numArr[i][j] = j+1;
//        	}
//		}
//		for(int i=0;i<3;i++){
//        	for(int j=0;j<3;j++){
//            	System.out.print(numArr[i][j]);
//            if(j!=2){
//            	System.out.print(",");
//            }else{
//            	System.out.println();
//            }
//		     numArr[i][j] = j+1;
//        	}
//		}
//		
		for(int i=0;i<numArr.length;i++){
        	for(int j=0;j<numArr.length;j++){
		     numArr[i][j] = j+1;
        	}
		}
		
		for(int i=0;i<numArr.length;i++){
        	for(int j=0;j<numArr.length;j++){
		     numArr[i][j] = j+1+(i*numArr[i].length);
        	}
		} //1,2,3,4,5,6
		
		for(int i=0;i<numArr.length;i++){
        	for(int j=0;j<numArr.length;j++){
            	System.out.print(numArr[i][j]);
            if(j!=numArr[i].length-1){
            	System.out.print(",");
            }else{
            	System.out.println();
            }//1,2,3
		 
            
            
            
       	}
	}
		
		
		
		
//		numArr[0][0] = 1;
//		numArr[0][1] = 2;
//		numArr[0][2] = 3;
//		
//		numArr[1][0] = 1;
//		numArr[1][1] = 2;
//		numArr[1][2] = 3;
//		
//		numArr[2][0] = 1;
//		numArr[2][1] = 2;
//		numArr[2][2] = 3;
//        for(int i=0;i<3;i++){
//        	System.out.print(numArr[i][0] + ",");
//        	System.out.print(numArr[i][1] + ",");
//        	System.out.println(numArr[i][2]);
//        }
//        for(int i=0;i<3;i++){
//        	for(int j=0;j<3;j++){
//            	System.out.println(numArr[i][j]);
//        }
        
        	
        }
        	
      }
	
	
	
