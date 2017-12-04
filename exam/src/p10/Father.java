package p10;

public class Father {

	// public int a = 3;

	public int minNum;
	public int maxNum;

	public Father(int minNum, int maxNum) {
		this.minNum = minNum;		
		this.maxNum = maxNum;
	}
	
	public String toString(){
		return "너냐 날부른게?";
	}
	public void print() {
		
	}
//		for (int i = minNum; i < maxNum; i++) {
//			String num = i + "";
//
//			if (num.indexOf("3") != -1 || num.indexOf("6") != -1 || num.indexOf("9") != -1) {
//				System.out.println("짝");
//			} else {
//
//				System.out.println(i + ",");
//			}
//
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//		}
//		System.out.println(100);
//	}

	public static void main(String[] args) {
		System.out.println("아빠 프린트");
		

	}
}
