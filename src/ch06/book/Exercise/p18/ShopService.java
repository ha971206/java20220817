package ch06.book.Exercise.p18;

public class ShopService {
	private static final ShopService shop = new ShopService();
	
	private void shop() {
		
	}
	
	public static ShopService getinstance() {
		return shop;
	}
}
