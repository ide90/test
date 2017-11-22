package p02;

public class Operator {

	public static void main(String[] args) {
/*		int a = 4;
		a = a+1;
		a ++;
		++a;
		a+=1;
		
		a = a+2;
		a+=2;
		
		int b = 2;
		b = b-1;
		b--;
		--b;
		b-=2; */
		int a = 3;
		int b = a;
		int c = b;
		boolean b1 = a==b;
		System.out.println(b1);
		System.out.println(a==b);


		if(a==b){
			System.out.println("a와 b는 같습니다.");
		}
		
       /* for(int i=0;i<10;i++) {
        	if(a==b) {
        		System.out.println((i+1)+".a와 b는 같습니다.");
        		
        	}
        }
        for(int i=10;i>0;i--) {
        	if(a==b) {
        		System.out.println((i)+".a와 b는 같습니다.");
        	}
        }
*/
        for(int i=1; i<10; i++) {
        	if(i%2==0) {//짝수일때
        		System.out.println((i)+".a와 b는 같습니다.");
         }
        }
        for(int i=10; i>0; i--) {
            if(i%2==1) {//홀수일때
               System.out.println((i)+".a와 b는 같습니다.");	
            }
        }
       
        int len = 7;
        String[] strArr = new String[len];
       //strArr는 7개의 방을 가지고 있음
       //strArr[0]="10"부터 strArr[6]="70"까지 들어갈 수 있는 for문 
        for(int i=0; i<strArr.length; i++){
            strArr[i] = (i+1)+"0";
            System.out.println("strArr[" + i +"]=" + strArr[i]);
        }
	    for(int i=strArr.length-1;i>=0;i--){
	      	System.out.println("strArr[" + i +"]=" + strArr[i]);
	    }
        
	    for(int i=5;i<100;i+=5){
	    	System.out.println(i);
	    }
        for(int i=10;i<101;i+=10){
        	System.out.println(i);
        }
	    for(int i=5;i<101;i+=10){
	    	System.out.println(i);	
	    }
	   
	    for(int i=95;i>4;i-=10){
	    	System.out.println(i);
	    }
	    
	    
	  }
}   
 
    




    /*  System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	*/
	