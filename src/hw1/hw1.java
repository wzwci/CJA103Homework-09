package hw1;

public class hw1 {
	public static void main(String[]args) {
//		請設計一隻Java程式，計算12，6這兩個數值的和與積
	int num1 =12;int num2 =6;
		System.out.println(num1+num2);
		System.out.println(num1*num2);
//• 請設計一隻Java程式，計算200顆蛋共是幾打幾顆？ (一打為12顆)
	int num3=200;int num4=12;
		System.out.println("共"+(num3/num4)+"打"+(num3%num4)+"顆");
//• 請由程式算出256559秒為多少天、多少小時、多少分與多少秒	
	int num5=256559;int num6=86400;int num7=3600;
	int day=num5/num6;
	int hour=(num5%num6)/num7;
	int min=(num5%num6%num7)/60;
	int sec=(num5%num6%num7)%60;
		System.out.println(day+"天"+hour+"小時"+min+"分"+sec+"秒");
//• 請定義一個常數為3.1415(圓周率)，並計算半徑為5的圓面積與圓周長	
	final double pi=3.1415;double radius=5.0;
//	加上final讓他不可變更
		System.out.println("圓面積="+ (pi*radius*radius));
		System.out.println("圓周長="+(2*pi*radius));
//• 某人在銀行存入150萬，銀行利率為2%，如果每年利息都繼續存入銀行，請用程式計算10年後，本
//金加利息共有多少錢 (用複利計算，公式請自行google)
	double principal=1500000;double rate=0.02;int year=10;
		System.out.println("10年後，本金加利息共有="+ principal*Math.pow(1+rate,year));
//• 請寫一隻程式，利用System.out.println()印出以下三個運算式結果：
//5 + 5
//5 + ‘5’
//5 + “5”
//並請用註解各別說明答案的產生原因	
		System.out.println("5+5="+(5+5));
		System.out.println("5+'5'="+(5+'5'));
		System.out.println("5+\"5\"="+(5+"5"));
//		\跳脫文字\
	
	}

}
