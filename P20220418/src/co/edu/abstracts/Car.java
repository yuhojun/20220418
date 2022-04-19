package co.edu.abstracts;

public abstract class Car {
	
	private String model;
	
	public abstract void turnOn(); // 차 시동켜는 기능.
	public abstract void start(); // 출발기능.
	public abstract void run(); //운전기능.
	public abstract void stop();; //멈춤기능.
	public abstract void turnOff(); //시동끄는 기능.
}
