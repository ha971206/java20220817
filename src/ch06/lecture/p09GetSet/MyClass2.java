package ch06.lecture.p09GetSet;

public class MyClass2 {
	// field는 특별한 이유가 없다면 private로 둘것
	private String name;
	private int age;
	private boolean alive;
	
	// source 안에 generate getter setter를 사용하면 한번에 만들어짐
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public boolean isAlive() {
		return alive;
	}
	
	public void setAlive(boolean alive) {
		this.alive = alive;
	}
	
	
	
//	// 대신 getter, setter method 공개(public)
//	// 읽기전용이라면 set메소드 삭제
//	public String getName() {
//		return name;
//	}
//	
//	public int getAge() {
//		return age;
//	}
//	
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	public void setAge(int age) {
//		this.age = age;
//	}
//
//	// boolean 타입은 get 대신 is로 작성
//	public void setAlive(boolean alive) {
//		this.alive = alive;
//	}
//	
//	public boolean isAlive() {
//		return alive;
//	}
	
	
	
}
