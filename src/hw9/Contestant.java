package hw9;
//• 開啓2個執行緒模擬饅頭人與詹姆士參加快胃王比賽所做的
//競賽過程。
//• 每個動作都以 Thread.sleep()暫停一下,以達到顯示效果。
//Sleep時間由亂數產生500～3000之間的毫秒數，如圖所示


public class Contestant implements Runnable {
	private String name;
//	寫參選人|屬性
	public Contestant(String name) {
		this.name = name;
	}
//	建立物件給參賽者名字|方法

	@Override
	public void run() {
		try {
			for (int i = 1; i <= 10; i++) {
				// 每人吃10碗
				System.out.println(name + "吃了第" + i + "碗飯");
				int sleepTime = (int) (Math.random() * 2501) + 500;
				// 隨機暫停 500 ~ 3000 毫秒
				Thread.sleep(sleepTime);
			}
			System.out.println(name + " 吃完全部饅頭！");
		} catch (Exception e) {
		}
	}

	public static void main(String[] args) {
		System.out.println("----快胃王快食比賽開始！-----");

		Contestant r1 = new Contestant("饅頭人");
		Thread t1 = new Thread(r1);
		Contestant r2 = new Contestant("詹姆士");
		Thread t2 = new Thread(r2);

		t1.start();
		t2.start();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			
		}
	}	
}
