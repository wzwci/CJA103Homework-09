package hw7;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Random;

public class hw7 {
	public static void main(String[]args) {

		
			File file = new File("C:\\Users\\TMP-214\\Desktop\\JAVA\\Sample.txt");

			int lineCount=0;
			int charCount=0;
			

	        BufferedReader br = null;
//	        BufferedReader 讀取文字
	        try {
	            br = new BufferedReader(new FileReader(file));
	            String line;
//	            存文字
	            while ((line = br.readLine()) != null) {
//	            從檔案中讀一行文字，直到沒有行為止	
	      
	                lineCount++;
	                charCount += line.length();
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally { 
	            try {
	                if ( br != null) br.close();
	            } catch (IOException e) {
	                e.printStackTrace();
	              }
	          }

	        long fileSize = file.length();
	        System.out.println("Sample.txt檔案共有" + fileSize + "個位元組，" + charCount + "個字元，" + lineCount + "列資料");
	    

		System.out.println("=1==");
//		 請寫一隻程式，能夠亂數產生10個1～1000的整數，並寫入一個名為Data.txt的檔案裡 (請使用
//				 append功能讓每次執行結果都能被保存起來)
//		
		Random random = new Random();
		BufferedWriter bw = null;

        try {
            bw = new BufferedWriter(new FileWriter("Data.txt", true));
            System.out.print("本次產生的隨機數：");
            for (int i = 0; i < 10; i++) {
                int num = random.nextInt(1000) + 1;
                System.out.print(num + " ");
                bw.write(num + "\n");
            }
            System.out.println();
            System.out.println("寫入完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null) bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
		}
        System.out.println("=2==");
//        • 請從無到有試著完成一個方法名為copyFile，這個方法有兩個參數。呼叫此方法時，第一個參數所
//        代表的檔案會複製到第二個參數代表的檔案
        
        copyFile("C:\\Users\\TMP-214\\Desktop\\JAVA\\Sample.txt", 
                "C:\\Users\\TMP-214\\Desktop\\JAVA\\CopySample.txt");
        
        System.out.println("=3==");
         
		    System.out.println("=4==");
//		    請寫一支程式，利用老師提供的Dog與Cat類別分別產生兩個物件，寫到C:\data\Object.ser裡。注
//		    意物件寫入需注意的事項，若C:\內沒有data資料夾，請用程式新增這個資料夾
		    
		    File Folder = new File("C:\\data");
			String filePath = Folder + "\\Object.ser";
	        
	        if (!Folder.exists()) {
	            System.out.println("資料夾不存在");
	            Folder.mkdirs();
	            System.out.println("已建立");
	        } else {
	            System.out.println("資料夾已存在");
	        }
	        
	        
	        dog dog1 = new dog("大白");
	        dog dog2 = new dog("小黑");
	        Cat cat1 = new Cat("逼啾");
	        Cat cat2 = new Cat("嘎嘎");
	        
	        System.out.println("寫入完成");
	        
	        
	        try {
	            FileOutputStream fos = new FileOutputStream("C:\\data\\Object.ser");
	            ObjectOutputStream oos = new ObjectOutputStream(fos);
	            
	           
	            oos.writeObject(dog1);
	            oos.writeObject(dog2);
	            oos.writeObject(cat1);
	            oos.writeObject(cat2);
	            
	            oos.close();
	            fos.close();
	            
	            System.out.println("物件寫入 C:\\data\\Object.ser");
	            
	        } catch (IOException e) {
	           e.printStackTrace();
	        }
	        
	        System.out.println("=5==");
//	        承上題，請寫一個程式，能讀取Object.ser這四個物件，並執行speak()方法觀察結果如何 (請利用多
//	        		型簡化本題的程式設計)
	        
	        try {
	            FileInputStream fis = new FileInputStream("C:\\data\\Object.ser");
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            
	            
	            dog readDog1 = (dog) ois.readObject();
	            dog readDog2 = (dog) ois.readObject();
	            Cat readCat1 = (Cat) ois.readObject();
	            Cat readCat2 = (Cat) ois.readObject();
	            
	            System.out.println("已讀取物件");
	            
	            
	            readDog1.speak();
	            readDog2.speak();
	            readCat1.speak();
	            readCat2.speak();
	            
	            
	            ois.close();
	            fis.close();
	            
	        } catch (FileNotFoundException e) {
	            System.out.println("請先執行第四題");
	        } catch (IOException e) {
	            System.out.println("讀取失敗：" + e.getMessage());
	            e.printStackTrace();
	        } catch (ClassNotFoundException e) {
	            System.out.println("找不到類別：" + e.getMessage());
	        }
	}
	

         
	public static void copyFile(String source, String dest) {
	    try {
	    	
	        BufferedReader br = new BufferedReader(new FileReader(source));
	        BufferedWriter bw = new BufferedWriter(new FileWriter(dest));
	
	        String line;
	        
	        while ((line = br.readLine()) != null) {
	            bw.write(line);   
	            bw.newLine();     
	        }
	        
	        
	        br.close();
	        bw.close();
	        
	     System.out.println("檔案複製完成");
	        
	    } catch (IOException e) {
	        e.printStackTrace();
	    	}
	}
}



