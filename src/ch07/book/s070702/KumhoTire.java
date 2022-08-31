package ch07.book.s070702;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	// �޼ҵ�
	@Override
	public boolean roll() {
		++accumulatedRotation;  // ���� ȸ���� 1����
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " KoomhoTire ����: " + (maxRotation-accumulatedRotation) + "ȸ");
			return true;
		} else {
			System.out.println("**** " + location + " KoomhoTire ��ũ ****");
			return false;
		}
	}

}
