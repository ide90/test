package p02;

public class Exam {
	
	public static void main(String[] args) {
		// int i = 1;
		// int a = 3;
		// for(;i<10;i++) {
		// a = 6;
		// System.out.println(i);
		// }
		// System.out.println(a);
		// System.out.println(i);
		//
		// int a = 3;
		//
		//
		// for(a=i;a<100;a++) {
		// } else(i%3==0) {
		// System.out.print("짝");
		// }
		for (int i = 1; i <= 100; i++) {
			String str = i + "";
			// System.out.println(i + ",");
			// if(str.indexOf("3")!=-1) {
			// System.out.print("짝");
			// }else if(str.indexOf("6")!=-1) {
			// System.out.print("짝");
			// }else if(str.indexOf("9")!=-1) {
			// System.out.print("짝");
			// if (i%10==0) {
			// System.out.println();
			
			int a = 3;
					for(a=i;a<=100;a++) {
						int num=a%10;
						int num2=a/10;
						if((num!=0 && num%3==0)||(num2%3==0&&a>10)){
							System.out.print("[짝");
							if(num%3==0&&num2%3==0) {
								System.out.print("짝");
							}
					
						System.out.print("],");
					    }else {
						System.out.print(a+",");
					    }
					    if(num==0) {
						System.out.println();
			}
			
						
//			str = str.replace("3", "짝");
//			str = str.replace("6", "짝");
//			str = str.replace("9", "짝");
//			if (str.indexOf("짝") > -1) {
//				if (str.equals("짝짝")) {
//					System.out.print("짝");
//				}
//				System.out.print("짝");
//			} else {
//				System.out.print(str + ",");
//
//			}
//			if (i % 10 == 0) {
//				System.out.println();
//			}
//
//		}
//		for (int i = 0; i <= 10; i++) {
//			String str1 = i + "";
//			if (str1.indexOf("3") > -1 || str1.indexOf("6") > -1 || str1.indexOf("9") > -1) {
//				str1 = "짝";
//			}
//			for (int j = 1; j < 9; j++) {
//				String str2 = j + "";
//				if (str2.indexOf("3") > -1 || str2.indexOf("6") > -1 || str2.indexOf("9") > -1) {
//					str2 = "짝";
//				}
//			try {
//				System.out.print(Integer.parseInt(str1+str2));
//			}catch(Exception e) {
//				System.out.print("짝");
//			}	
//			System.out.print(",");
//				
//			}
//			System.out.println();
//		}
//
//	}
		}
	}
	}
}


