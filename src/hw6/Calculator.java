package hw6;
//• 請設計三個類別Calculator.java，CalException.java與CalTest.java，在Calculator.java裡有個自訂
//方法為powerXY(int x, int y)，功能是會計算x的y次方並回傳結果。 CalTest.java執行後，使用者可
//以輸入x與y的值，請加入例外處理機制，讓程式能解決以下狀況：
//1. x與y同時為0，(產生自訂的CalException例外物件)
//2. y為負值，而導致x的y次方結果不為整數
//3. x與y皆正確情況下，會顯示運算後結果
public class Calculator {
	public Calculator() {
	}
	public int powerXY(int x,int y)throws CalException{
		if(x==0&&y==0) {
			throw new CalException("0的0次方沒有意義!");
		}
		if(y<0) {
			throw new CalException("次方為負值，結果回傳不為整數!");
		}
		int a =1;
//		初始化為1|a=結果
		for(int i =0;i<y;i++) {
//			i=控制「現在是第幾次」
//			假設x=2,y=8=>i=7 
			a*=x;
//			a=a*x
		}
		return a;
	}

}
