package hw4;

import java.util.Scanner;

public class hw4 {
	public static void main(String[]args) {
//		• 有個一維陣列如下：
//		{29, 100, 39, 41, 50, 8, 66, 77, 95, 15}
//		請寫出一隻程式能輸出此陣列所有元素的平均值與大於平均值的元素
//		(提示：陣列，length屬性)
		int[]a= {29, 100, 39, 41, 50, 8, 66, 77, 95, 15};
		int sum1=0;
		for(int b=0;b<a.length;b++){
//			b=指a裡面的索引
			sum1+=a[b];
//			sum1=sum1+a[b]
//			a[b]=陣列10個數字全部加起來
		}
		
		double average=(double)sum1/a.length;
//		平均值
		System.out.println("平均數"+average);
		
		System.out.println("大於平均數有哪些");
		for(int b=0;b<a.length;b++) {
			if(a[b]>average) {
				System.out.print(a[b]+" ");
			}
		}
		System.out.println();
		System.out.println("======");
//		• 請建立一個字串，經過程式執行後，輸入結果是反過來的
//		例如String s = “Hello World”，執行結果即為dlroW olleH
//		(提示：String方法，陣列)
		String w[]={"Hello World"};

		String v=w[0];
		
		for(int c=v.length()-1;c>=0;c--) {
			System.out.print(v.charAt(c));

		}
		System.out.println();		
		System.out.println("=====");
//		有個字串陣列如下 (八大行星)：
//		{“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)
//		(提示：字元比對，String方法)
		String o[]={"mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune"};
		int sum2=0;
		
		for(int d=0;d<o.length;d++) {
			String r=o[d];
//			r=拿到這裏面的字
			for(int e =0;e<r.length();e++) {
//				e=r裡面的字的位置
				char f=r.charAt(e);
//				f是r的第e個字
				if(f=='a'||f=='e'||f=='i'||f=='o'||f=='u') {
					sum2++;
				}
			}
		}
		System.out.println("母音總數:"+sum2);
			
		System.out.println("=====");
//		• 阿文上班時忘了帶錢包,想要向同事借錢,和他交情比較好的同事共有 5 個,其員工編號與身上現金列
//		表如下：
//		請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//		有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//		員工編號: 25 19 27 共 3 人!」
//		(提示：Scanner，二維陣列)
		System.out.println("請輸入借多少");
		
		Scanner sc =new Scanner(System.in);
		
		int[][]g= {
					{25, 32, 8, 19, 47},
					{2500,800,500,1000,1200}
											};
		int i=sc.nextInt();
//		阿文想借多少
		int j=0;
//		多少人能借
		System.out.print("有錢可借員工編號:");
		
		for(int h=0;h<g[0].length;h++){
//			g[0].length=第一行員工編號,h=計時器
			if(g[1][h]>=i) {
//				反而言之，第一行為摳摳,i=金額,就是借我錢的>=我想借多少錢
				j++;
//				可借的人+1
				System.out.print(g[0][h]+" ");
//				g[0][h]=h計時器告訴你誰借你摳摳
			}
		}
		System.out.println("共 "+j+" 人!");
		System.out.println("=====");
//		• 請設計由鍵盤輸入三個整數，分別代表西元yyyy年，mm月，dd日，執行後會顯示是該年的第幾天
//		例：輸入 1984 9 8 三個號碼後，程式會顯示「輸入的日期為該年第252天」
//		(提示1：Scanner，陣列)
//		(提示2：需將閏年條件加入)
//		(提示3：擋下錯誤輸入：例如月份輸入為2，則日期不該超過29)

		System.out.print("yyyy");
		int year =sc.nextInt();
		
		int[]k= {31,28,31,30,31,30,31,31,30,31,30,31};
//		個月最後一天		
		boolean l =false;
//		l=閏年
		if((year%400==0)||(year%4==0&&year%100!=0)){
			l=true;
		}
		if (l==true){
			k[1]=29;
//			k[1]=2月|對的話就29天
		}
		
		int month;
		while(true) {
//			無限迴圈
			System.out.print("mm");
			month=sc.nextInt();
		if (month>=1&&month<=12) {
			break;
			}else {
				System.out.println("重新輸入");
			}
		}
		
		int day;
		while(true) {
			System.out.print("dd");
			day=sc.nextInt();
			if(day>=1&&day<=k[month-1]) {
//				k[month-1]=9-1=k[8]
				break;
			}else {
				System.out.println("重新輸入");
			}
		}
		
		int total=0;
		
		for(int p=0; p<month-1;p++) {
//			p=計時器|從1月到前一個月
			total=total+k[p];
		}
		total=total+day;

		System.out.println("輸入的日期為該年第"+total+"天");
		System.out.println("=====");
//		班上有8位同學，他們進行了6次考試結果如下：
//		請算出每位同學考最高分的次數
//		(提示：二維陣列)
		int[][]test= {
				{10,35,40,100,90,85,75,70},
	            {37,75,77,89,64,75,70,95},
	            {100,70,79,90,75,70,79,90},
	            {77,95,70,89,60,75,85,89},
	            {98,70,89,90,75,90,89,90},
	            {90,80,100,75,50,20,99,75}
										};
		int[]q=new int[8];
//		紀錄最高分
		for(int r=0;r<6;r++) {
//			1~6次考試
			int max=test[r][0];
//			第r次考試第一位同學的分數|初始最大值
			for(int s=0;s<8;s++) {
//				幾位同學
				if(test[r][s]>max) {
					max=test[r][s];
//					第r次第s位學生的分數
				}
			}
//			統計那些同學等於最高分
			for(int s=0;s<8;s++) {
				if(test[r][s]==max) {
					q[s]++;
//					累積考高分的次數
				}
			}
		}
//		印出結果
		for(int s =0;s<8;s++) {
			System.out.println("同學" + (s+1) + "考最高分的次數:" + q[s]);
		}

	}
}
