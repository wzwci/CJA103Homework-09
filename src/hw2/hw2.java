package hw2;

public class hw2 {
	public static void main(String[]args) {
//• 請設計一隻Java程式，計算1～1000的偶數和 (2+4+6+8+…+1000)
		int sum=0;
		for(int i=1;i<=1000;i++) {
//			或是可以寫for(int i=2;i<=1000;i+2)就可以不用if;|
			if(i%2==0) {
//				記得+if
				sum+= i;
			}
		}
		System.out.println(sum);
		
		System.out.println("===");
//• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用for迴圈)        
		int sum2=1;
		for(int j=1;j<=10;j++) {
			sum2*= j;
//			sum2 = sum2*j
		}
		System.out.println(sum2);
		
		System.out.println("===");
//• 請設計一隻Java程式，計算1～10的連乘積 (1*2*3*…*10) (用while迴圈)
		int sum3=1;
		int q=1;
		while(q<=10) {
			sum3*= q;
//			sum3 = sum3*q
			q++;
		}
		System.out.println(sum3);
		
		System.out.println("===");
//• 請設計一隻Java程式，輸出結果為以下：
//1 4 9 16 25 36 49 64 81 100
		for(int a=1;a<=10;a++) {
			System.out.print(a*a);
			System.out.print(" ");
//			System.out.println(a*a+" ");
		}
		System.out.println();
		System.out.println("===");
//• 阿文很熱衷大樂透 (1 ～ 49)，但他不喜歡有4的數字，不論是個位數或是十位數。請設計一隻程式，
//輸出結果為阿文可以選擇的數字有哪些？總共有幾個？		
		int sum4=0;
//		sum4是計時器
		for(int z=1;z<=49;z++) {
//			int z 是題目給你的條件
			int b=z/10;
			int f=z%10;
			if(b==4||f==4) {
				continue;
			}
			System.out.print(z+" ");
			sum4++;
		}
		System.out.println();
		System.out.println("總共有"+sum4+"個");
		System.out.println("===");
//請設計一隻Java程式，輸出結果為以下：
//1 2 3 4 5 6 7 8 9 10
//1 2 3 4 5 6 7 8 9
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7
//1 2 3 4 5 6
//1 2 3 4 5
//1 2 3 4
//1 2 3
//1 2
//1
		for(int w=10;w>=1;w--) {
			for(int s=1;s<=w;s++) {
				System.out.print(s+" ");
			}
			System.out.println();
		}
			System.out.println("===");
//• 請設計一隻Java程式，輸出結果為以下：
//A
//BB
//CCC
//DDDD
//EEEEE
//FFFFFF
	
			for(int e=1;e<=6;e++) {
//				縱向加1|e也代表取第幾個字母
				char ch=(char)('A'+e-1);
					for(int d=1;d<=e;d++) {
//						橫向印幾次
						System.out.print(ch);
					}
				System.out.println();
			}
	}

}
