package ch07.book.s070702;

public class CarExample {
	public static void main(String[] args) {
Car car = new Car();
		
		for(int i=1; i<=5; i++) {
			int problemLocation = car.run();
			
			switch (problemLocation) {
			case 1:
				System.out.println("�տ��� HonkookTire�� ��ü");
				car.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�տ��� KumhoTire�� ��ü");
				car.frontRightTire = new KumhoTire("�տ���", 13);
				break;
			case 3:
				System.out.println("�տ��� HonkookTire�� ��ü");
				car.backLeftTire = new HankookTire("�տ���", 14);
				break;
			case 4:
				System.out.println("�տ��� KumhoTire�� ��ü");
				car.backRightTire = new KumhoTire("�տ���", 17);
				break;
			default:
				break;
			}
			System.out.println("----------------------------------"); // 1ȸ�� �� ��µǴ� ���� ����
			
		}
	}
}
