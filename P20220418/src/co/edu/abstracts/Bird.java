package co.edu.abstracts;

public class Bird extends Animal {

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("새가 먹이를 먹습니다.");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("새가 날아갑니다.");
	}

	@Override
	public void sleep() {
		System.out.println("새가 잠을 잡니다.");
	}
	
}
