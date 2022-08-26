package ch06.book.s060802;

public class CarExample {
	public static void main(String[] args) {
		Car o1 = new Car();
		
		o1.setGas(5);
		
		boolean gasState = o1.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			o1.run();
		}
		
		if(o1.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입하세요.");
		}
	}
}
