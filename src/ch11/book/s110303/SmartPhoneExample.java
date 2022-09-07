package ch11.book.s110303;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("구글" , "안드로이드");
		
		String strobj1 = myPhone.toString();
		System.out.println(strobj1);
		
		System.out.println(myPhone);
	}
}
