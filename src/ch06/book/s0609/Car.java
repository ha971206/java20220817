package ch06.book.s0609;

public class Car {
	// field
	String model;
	int speed;
	
	// 생성자
	Car(String model){
		this.model = model;
	}
	
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10;i<=50;i+=10) {
			this.setSpeed(i);
			System.out.println(this.model);
		}
	}
}
