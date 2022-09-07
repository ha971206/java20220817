package ch11.lecture.p01object;

public class C07ToString {
	public static void main(String[] args) {
		Computer a = new Computer("la",32,4,300);
		Computer b = new Computer("samsung",64,8,500);
		
		System.out.println(a.toString());
		System.out.println(b.toString());
	}
}

class Computer {
	private String model;
	private int ssd;
	private int ram;
	private int power;
	public Computer(String model, int ssd, int ram, int power) {
		super();
		this.model = model;
		this.ssd = ssd;
		this.ram = ram;
		this.power = power;
	}
	// toString : 객체를 문자열(text)로 표현하기 위한 메소드
	@Override
	public String toString() {
		return "Computer [model=" + model + ", ssd=" + ssd + "GB, ram=" + ram + "GB, power=" + power + "W]";
	}
	
	
	
	
}