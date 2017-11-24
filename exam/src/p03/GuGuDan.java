package p03;

public class GuGuDan {
	
	public GuGuDan(){
		
		System.out.println("GuGuDan 실행");
	}
	
   public void printLoop(ObjectExam oe){
	for(int i=1;i<oe.num1;i++){
		for(int j=1;j<oe.num2;j++){
			System.out.print("[" + i + "." + j + "]");
			
		}
		
	      System.out.println();
		}
  }
	public static void main(String[] args){
		
	   /* System.out.println();
		for(int i=1;i<10;i++){
		   System.out.print("1 x " + i + " = " + (1*i)+","); 
		}
		System.out.println();
        for(int i=1;i<10;i++){
		   System.out.print("2 x " + i + " = " + (2*i)+","); 
        }
		System.out.println();
      	for(int i=1;i<10;i++){
		   System.out.print("3 x " + i + " = " + (3*i)+","); 
		}
		*/
      	   
		    /*for(int i=1;i<10;i++){
			  for(int j=1;j<10;j++){
				System.out.print(j + " * " + i + " = ");
				System.out.print(j*i + ",");
			세로정렬*/
		
	}
  }
 

