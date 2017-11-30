package p08;

import java.util.Random;

public class Lotto {
	private int[] lottoNums;
    private int lottoMaxNum;
	private int checkRandomNum;
    private int[] checkLottoNums;
	
	
	public Lotto(){
		this(6,45);
		
	}
	public Lotto(int lottoNumsLength){
		this(lottoNumsLength,45);
	}
	
	public Lotto(int lottoNumsLength,int lottoMaxNum) {
		this.lottoNums = new int[lottoNumsLength];
		this.lottoMaxNum =  lottoMaxNum;
		}
	
	void setCheckLottoNums(int[] checkLottoNums){
		this.checkLottoNums = checkLottoNums;
	}
	
	void printMachLottoNums(){
		
		
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
	private boolean isDupl() {
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
		//int[] lottoNums= new int[6];
		Lotto lt = new Lotto();
		lt.makeLottoNums();
		lt.printLottoNums();
		
		}
	}

