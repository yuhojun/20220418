package co.edu.interfaces;

public interface RemoteControl {
	//상수(값을 바꿀수 없음)만 선언
	public static final int MAX_VOLUME = 10;
	
	public void turnOn(); //구현부분이 없는메소드 (추상메소드)
	public void turnOff(); 
	public void volumeUp(); 
	public void volumeDown();
	public default void adjustScreen();
	system.out.println("화면을 조정합니다.");
	
	public static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
		
	}
}
