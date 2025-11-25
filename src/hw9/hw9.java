package hw9;

//• 熊大在念大學,生活費倚靠媽媽。媽媽怕熊大一天到晚領
//錢亂花,不好好唸書,所以只要看到熊大帳戶的餘額超過
//3000元,就會停止匯款給熊大;但要是帳戶餘額在2000元
//以下,熊大就會要求媽媽匯款給他。如果帳戶餘額低於熊
//大要提款的金額,熊大就會暫停提款,直到媽媽告知他錢
//已經入帳戶。假設媽媽一次匯款 2000 元,熊大一次提款
//1000元,寫一個Java程式模擬匯款10次與提款10次的情
//形。

	class Bank{

		private int balance = 0; // 初始餘額

		synchronized public void remit(int d) {
			while (balance > 3000) {
				System.out.println("餘額超過3000，媽媽暫停匯款");
				try {
					wait();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}

			balance += d;
			System.out.println("媽媽存了" + d + "；帳戶共有：" + balance);
			notify(); // 通知熊大可以提款
			System.out.println("熊大被老媽告知帳戶已經有錢");
		}

		synchronized public void take(int d) {
			while (balance < d) {
	                System.out.println("熊大看到帳戶沒錢，暫停匯款");
	            try {
	                wait();  // 等待媽媽匯款
	            } catch (InterruptedException e) {
	                e.printStackTrace();
	            }
	        }
			
			balance -= d;
			System.out.println("熊大領了" + d + "；帳戶共有：" + balance);

			if (balance <= 2000) {
				System.out.println("熊大看到餘額2000以下，要求媽媽匯款");
				notify();
			}
		}
	}

	class Mom extends Thread {
		Bank mom;
//媽媽要操作的銀行帳戶
		public Mom(Bank mom) {
			this.mom = mom;
//			通過對象，媽媽可以進行存款等操作|mom=一個銀行帳戶
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				mom.remit(2000); // 呼叫 mom()
		}
	}

	class Bear extends Thread {
		//熊大要操作的銀行帳戶
		Bank bear;
//		通過對象，媽媽可以進行存款等操作|mom=一個銀行帳戶
		public Bear(Bank bear) {
			this.bear = bear;
		}

		public void run() {
			for (int i = 1; i <= 10; i++)
				bear.take(1000); // 呼叫 bear()
		}
	}
	
	public class hw9 {
	    public static void main(String[] args) {
	        Bank bk = new Bank();
	        Mom remit = new Mom(bk);
	        Bear take = new Bear(bk);

	        remit.start();
	        take.start();
	    }
	}
