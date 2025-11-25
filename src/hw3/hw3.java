package hw3;

import java.util.Scanner;


public class hw3 {
	public static void main(String args[]) {
//	• 請設計一隻程式，使用者輸入三個數字後，輸出結果會為正三角形、等腰
//	三角形、其它三角形或不是三角形，如圖示結果：
//	(提示：Scanner，三角形成立條件，判斷式if else)
//	(進階功能：加入直角三角形的判斷) 
	Scanner sc = new Scanner(System.in);
//	使用者輸入時，需要打
		System.out.println("請輸入三個整數");
		int d = sc.nextInt();
//		輸入第一個數字
//		如果是用double|nextDouble
		int b = sc.nextInt();
//		輸入第2個數字
		int c = sc.nextInt();
//		輸入第3個數字
		System.out.println(d + b + c);
//		可打可不打
		
		if (d+b<=c||d+c<=b||c+b<=d) {
			System.out.println("不是三角形");
		}else if(d==b&&b==c) {
			System.out.println("正三角形");
		}else if(d==b||b==c||c==d) {
			System.out.println("等腰三角形");
		}else if(d*d+c*c==b*b||b*b+c*c==d*d||d*d+b*b==c*c) {   
			System.out.println("直角三角形");
		}else {
			System.out.println("其他三角形");
		}
		
		System.out.println("===");
//		• 請設計一隻程式，會亂數產生一個0～9的數字，然後可以玩猜數字遊戲，猜錯會顯示錯誤訊息，猜
//		對則顯示正確訊息，如圖示結果：
//		(提示：Scanner，亂數方法，無窮迴圈)
//		(進階功能：產生0～100亂數，每次猜就會提示你是大於還是小於正確答案) 
		int i = (int)(Math.random()*10);
//		i=答案
		System.out.println("開始猜數字吧!");

		while(true) {
//		while(true)=無窮迴圈		
			int ans = sc.nextInt();
//			ans=使用者輸入			
			if(i<ans) {
				System.out.println("猜錯囉");
			}else if(i>ans){
				System.out.println("猜錯囉");	
			}else {
				System.out.println("答對了!答案就是"+ans);
				break;
//				答對跳出迴圈
			}	
		}
		System.out.println("===");

		System.out.println("恭賀你，進入第二關");
		
		int o =(int)(Math.random()*101);
		System.out.println("開始猜數字吧!");

		
		while(true) {
			int ans = sc.nextInt();

			if(ans<o) {
				System.out.println("猜上面點");    
			}else if(ans>o){
				System.out.println("猜下面點");	
			}else {
				System.out.println("答對了!答案就是"+ans);
				break;
			}	
		}
		System.out.println("===");
//		 阿文很喜歡簽大樂透(1～49)，但他是個善變的人，上次討厭數字是4，但這次他想要依心情決定討
//		 厭哪個數字，請您設計一隻程式，讓阿文可以輸入他不想要的數字(1～9)，畫面會顯示他可以選擇
//		 的號碼與總數，如圖：
//		 (提示：Scanner)
//		 (進階挑戰：輸入不要的數字後，直接亂數印出6個號碼且不得重複)		
		
		System.out.println("阿文...請輸入你討厭哪個數字?");

		int amount= 0;
//		紀錄多少符合條件的數字
		int x = sc.nextInt();
//		使用者輸入

		for(int t=0;t<=4;t++) { 
//			t=十位數
			for(int f=0;f<=9;f++) {
//				f=個位數
				if(t==x||f==x) {
					continue;
				}
					if(t==0&&f==0) {
						continue;
					}
			System.out.print(t+""+f+" ");
			amount++;
//			amount = amount+1;
//			找到一個後 累加
			}
		}
		System.out.println("總共有"+amount);
		
		System.out.println("亂數印出6個且不得重覆號碼：");
		
		int[]random=new int[6];
//		建立一個整數陣列，大小是 6，用來存放我們生成的隨機數字。
		int n=0;
//		目前已經產生了幾個符合條件的隨機數字
		while(n<6) {
//			迴圈跑5次
		int r=(int)(Math.random()*49)+1;
//		r=都要先確認「以前有沒有抽過」
		int t=r/10;
		int f=r%10;
		if(t==x||f==x) {
			continue;
//			不要出現阿文討厭的數字
		}
		
		boolean y =false;
//		y=是否重複
		for(int u=0;u<n;u++) {
//			u=檢查存幾個數字
			if(random[u]==r) {
//				random[u]是否跟r一樣，如果一樣就代表重複
				y=true;
				break;
			}
		}
		
			if(!y) {
//				如果不重複
				random[n]=r;
//				用來存放新選的隨機數字
				System.out.print(r+" ");
				n++;
//				更新以存放數字的計數
			}
		}
	}
}