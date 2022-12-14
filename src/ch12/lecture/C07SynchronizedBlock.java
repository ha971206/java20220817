package ch12.lecture;

public class C07SynchronizedBlock {
	public static void main(String[] args) {
		int[] arr = {0};
		
		Object lock = new Object();
		
		Thread t1 = new Thread(() -> {
			for(int i=0;i<1000000;i++) {
				// 동기화 블럭 (객체)
				// 객체 획득해야 블럭 실행가능
				// 블럭 실행 후 객체 반납
				synchronized (lock) {
					
					arr[0]++;
				}
				
			}
		});
		
		Thread t2 = new Thread(() -> {
			for(int i=0;i<1000000;i++) {
				synchronized (lock) {
					arr[0]++;					
				}
			}
		});
	}
}