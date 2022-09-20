package Memo;

public class Changjae {
	public static void main(String[] args) {
		
		Sta sta1 = new Sta();
		Sta sta2 = new Sta();
		sta1.name = "창재";
		sta2.name = "현종";
		
		sta1.nu(300);
		sta2.nu(100);
		
		sta1.getInfo();
		sta2.getInfo();
	}
}


class Sta {
	String name;
	static int num;
	
	public void na(String name){
		this.name = name;
	}
	
	public void nu(int num) {
		this.num += num;
	}
	
	public void getInfo() {
		System.out.println("----getInfo-----");
		System.out.println(name);
		System.out.println(num);
	}
}