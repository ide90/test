package p08;

public class ExecLotto {
	public static void main(String[] args){
		Lotto lt = new Lotto(3,10);
		//로또추첨
		lt.makeLottoNums();
		
		//추첨된 로또가 출력
		lt.printLottoNums();
		
		int[] nums = {2,4,5};
	
		//내가 입력한 로또번호를 Lotto 변수의 checkLottoNums에 대입
		lt.setCheckLottoNums(nums);
		
				
		
	}
}
