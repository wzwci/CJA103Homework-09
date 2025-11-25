package hw5;

import java.util.Scanner;

public class hw5 {
//	• 請設計一個方法為starSquare(int width, int height)，當使用者鍵盤輸入寬與高時，即會印出對應的*長方形，如
//	圖：
	public static void starSquare(int width,int height) {
//		套入void=你不需要額外使用return|void只是印出而已

		for(int i=0;i<height;i++) {
			for(int j=0;j<width;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	• 請設計一個方法為randAvg()，從10個 0～100(含100)的整數亂數中取平均值並印出這10個亂數與平均值，如圖：
	public static void randAvg() {
        int sum=0;
        int[]a=new int[10];//陣列
        System.out.print("本次亂數結果:");
        
        for(int i=0;i<10;i++) {
//        	for指的是陣列的東西
        	int r = (int)(Math.random()*101);
        	a[i]=r;//亂數塞入進去
        	System.out.print(a[i]+" ");
        	sum=sum+a[i];
        }
        int avg=sum/10;
        System.out.println();
        System.out.print("平均:");
        System.out.println(avg);
	}
//	• 利用Overloading，設計兩個方法int maxElement(int x[][])與double maxElement(double x[][])，
//	可以找出二維陣列的最大值並回傳，如圖：
	public static int maxElement(int x[][]) {
		int max = x[0][0];
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>max) {
					max=x[i][j];
				}
			}
		}
		return max;
	}
	
	
	public static double maxElement(double x[][]) {
		double max = x[0][0];//先設第一個為最大值
		
		for(int i=0;i<x.length;i++) {
			for(int j=0;j<x[i].length;j++) {
				if(x[i][j]>max) {
					max=x[i][j];
				}
			}
		}
		return max;
	}
//	• 身為程式設計師的你，收到一個任務，要幫系統的註冊新增驗證碼的功能，請設計一個方法
//	genAuthCode()，當呼叫此方法時，會回傳一個8位數的驗證碼，此驗證碼內容包含了英文大小寫
//	與數字的亂數組合
	public static String genAuthCode(){

        String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        String code ="";
//        先建立一個空字串，一個一個加入

        for (int s = 0; s < 8; s++) {
            int r = (int)(Math.random()*chars.length());
//            chars.length()=char的長度,length用陣列length()用在字串
            code=code+chars.charAt(r);
        }
        return code;
    }
        
	public static void main(String[]args) {
		Scanner scanner=new Scanner(System.in);
//		使用者輸入資料
		System.out.print("請輸入寬度:");
		int width=scanner.nextInt();
		System.out.print("請輸入高度:");
		int height=scanner.nextInt();
		
		starSquare(width,height);
		
		scanner.close();
		System.out.println("===");
		
		randAvg();
		
		System.out.println("===");
		
		int[][] intArray = {
	            {1, 6, 3},
	            {9, 5, 2}
	        };

	        double[][] doubleArray = {
	            {1.2, 3.5, 2.2},
	            {7.4, 2.1, 8.2}
	        };
	        hw5 w= new hw5();
	        System.out.println(w.maxElement(intArray));
	        System.out.println(w.maxElement(doubleArray));
		
	        System.out.println("===");
		
		String code = genAuthCode();
//      把code存在這裡
      System.out.println("產生的驗證碼: " + code);
	}
}

