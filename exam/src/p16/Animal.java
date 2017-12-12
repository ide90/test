package p16;

public class Animal implements Action {
	public String name;
	public int age;
	public int height;
	
	@Override
	public void eat() {
		System.out.println("먹는다");

		
	}
	@Override
	public void sleep() {
		System.out.println("잔다");
		
	}
	@Override
	public void walk() {
		System.out.println("걷는다");
		
	}
	

} 
