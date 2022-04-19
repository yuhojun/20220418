package co.edu.abstracts;

public abstract class Animal {
// abstract(추상)를 쓰면 Animal() 생성자로 인스턴스 생성X
	
	public Animal()	{
		
	}
	
	public abstract void eat(); //강제로 eat() 하위클래스에서 구현하도록 하겠습니다.
	
	public abstract void run();
	
	public void sleep() {
		System.out.println("동물이 잠을 잡니다.");
	}
}
