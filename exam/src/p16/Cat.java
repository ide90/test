package p16;

public class Cat extends Animal {
	public Cat(String name, int age, int height) {
	 this.name=name;
	 this.age=age;
	 this.height=height;
	 
	 
	}
	@Override
	public void eat() {
		System.out.println(name+"먹는다");

		
	}
	@Override
	public void sleep() {
		System.out.println(name+"잔다");
		
	}
	@Override
	public void walk() {
		System.out.println(name+"걷는다");
		
		
	}

}
