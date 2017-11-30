package p08;

import java.util.Random;

public class Lotto {
	int[] lottoNums;
    int lottoMaxNum;
	int checkRandomNum;

	
	
	public Lotto(){
		this.lottoNums = new int[6];
		this.lottoMaxNum = 45;
		
		
	}
	public Lotto(int lottoNumsLength,int lottoMaxNum) {
		this.lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum =  lottoMaxNum;
		}
	
	
	void makeLottoNums(){
		Random r = new Random();
		for (int i = 0; i < lottoNums.length; i++) {
			checkRandomNum = r.nextInt(lottoMaxNum) + 1;
			if (isDupl()) {
				i--;
			} else {
				lottoNums[i] = checkRandomNum;
			}
		}
    }
	boolean isDupl() {
		for (int i = 0; i < lottoNums.length; i++) {
			if (lottoNums[i] == checkRandomNum) {
				return true;
			}
		}
		return false;
	}
	void printLottoNums(){
		for(int i=0;i<lottoNums.length;i++){
			System.out.print(lottoNums[i]+",");
		}
		
		
		
	}

	// public static void main(String[] args) {
	// Random r = new Random();
	// System.out.println("test 시작");
	//
	// for (int i = 0; i < 10000; i++) {
	// int rNum = r.nextInt(3);
	// if (rNum < 0 || rNum > 2) {
	// System.out.print(rNum);
	//
	// }
	//
	// }
	// System.out.println("test 종료");
	// }

	public static void main(String[] args) {
		int[] lottoNums= new int[6];
		Lotto lt = new Lotto();
		lt.makeLottoNums();
		lt.printLottoNums();
		
		}
	}

