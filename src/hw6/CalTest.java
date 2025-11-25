package hw6;

import java.util.Scanner;

public class CalTest {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		Calculator cal = new Calculator();
//		呼叫powerXY，所以要叫出cal
		
		while(true) {
//			無窮迴圈
		try {
			System.out.print("請輸入x的值:");
			int x = sc.nextInt();
			
			System.out.print("請輸入y的值:");
			int y = sc.nextInt();
			
			int a =cal.powerXY(x, y);
//			從cal裡面算出a
			System.out.println(x+"的"+y+"次方等於"+a);
		}catch(CalException e) {
//			會捕捉calexception的程式
			System.out.println(e.getMessage());
		}catch(Exception e) {
//			exception=父類別
			System.out.println("輸入格式不正確");
			sc.nextLine();
		}
		System.out.println();
		}
	}
}

