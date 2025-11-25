package hw8;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class hw8 {
	public static void main(String[] args) {
//		• 請建立一個Collection物件並將以下資料加入：
//		Integer(100)、Double(3.14)、Long(21L)、Short(“100”)、Double(5.1)、“Kitty”、Integer(100)、
//		Object物件、“Snoopy”、BigInteger(“1000”)
//		• 印出這個物件裡的所有元素(使用Iterator, 傳統for與foreach)
//		• 移除不是java.lang.Number相關的物件
//		• 再次印出這個集合物件的所有元素，觀察是否已將非Number相關的物件移除成功
		
        Collection<Object> element = new ArrayList<>();
		//建立collection|object=父類別|arraylist<>=集合|()=建立空內容
        
        element.add(Integer.valueOf(100));
//        Integer.valueOf()=建立新的Integer|valueOf()=自動封箱
        element.add(Double.valueOf(3.14));
        element.add(Long.valueOf(21L));
        element.add(Short.valueOf((short)100)); // 注意 Short 要轉型
        element.add(Double.valueOf(5.1));
        element.add("Kitty");
        element.add(Integer.valueOf(100));
        element.add(new Object());
        element.add("Snoopy");
        element.add(new BigInteger("1000"));
        
        // 使用 Iterator 印出所有元素
        System.out.println("使用 Iterator 列印:");
        Iterator<Object> iterator = element.iterator();
//      Iterator<TYPE>|變數名稱              |創建迭代器物件 
        while (iterator.hasNext()) {
//        	    變數名稱
            System.out.println(iterator.next());
        }

        // 使用傳統 for 迴圈列印
        System.out.println();
        System.out.println("使用傳統 for 迴圈列印:");
        Object[]array=element.toArray();
//        創建element.toArray()變成陣列=Object[]array
        for (int i = 0; i < array.length; i++) {
//        	                字段(固定值)
            System.out.println(array[i]);
        }

        // 使用 foreach 迴圈列印
        System.out.println();
        System.out.println("使用 foreach 迴圈列印:");
        for (Object obj : element) {
//      for(資料型態 變數名稱 : listname) 	
            System.out.println(obj);
        }

        // 移除不是 java.lang.Number 的物件
        for (int i = 0; i < array.length; i++) {
//            字段(固定值)
        	if(!(array[i] instanceof Number)) {
        	}
        	System.out.println(array[i]);
        }
        // 再次印出集合物件所有元素
        System.out.println();
        System.out.println("移除非 Number 物件後:");
        for (Object obj : element) {
            System.out.println(obj);
        }
        System.out.println("====");
 
            Train t1 = new Train(202, "普悠瑪", "樹林", "花蓮", 400);
            Train t2 = new Train(1254, "區間", "屏東", "基隆", 700);
            Train t3 = new Train(118, "自強", "高雄", "台北", 500);
            Train t4 = new Train(1288, "區間", "新竹", "基隆", 400);
            Train t5 = new Train(122, "自強", "台中", "花蓮", 600);
            Train t6 = new Train(1222, "區間", "樹林", "七堵", 300);
            Train t7 = new Train(1254, "區間", "屏東", "基隆", 700);

            
            List<Train> list = new ArrayList<>();
            list.add(t1);
            list.add(t2);
            list.add(t3);
            list.add(t4);
            list.add(t5);
            list.add(t6);
            list.add(t7);

            for (Train t : list) {
                System.out.println(t);
        }
           
            Set<Train> set = new HashSet<>(list); 
            System.out.println("\n=== 不重複 ===");
            for (Train t : set) {
                System.out.println(t);
            }
            
            List<Train> listCopy = new ArrayList<>(list);
//            在做一份新的
            for (int i = 0; i < listCopy.size() - 1; i++) {
            	//現在輪到第幾個去跟別人去比
                for (int j = i + 1; j < listCopy.size(); j++) {
                	//讓後面的每一個都拿來跟他比較
                    if (listCopy.get(i).getNumber() < listCopy.get(j).getNumber()) {
                        // 交換
                        Train temp = listCopy.get(i);
                        listCopy.set(i, listCopy.get(j));
                        listCopy.set(j, temp);
                    }
                }
            }
            
            System.out.println("\n=== 班次由大到小 ===");
            for (Train t : listCopy) {
                System.out.println(t);
            }

            Set<Train> set2 = new HashSet<>(list); 
            List<Train> list3 = new ArrayList<>(set2);
//          在做一份新的
          for (int i = 0; i < list3.size() - 1; i++) {
          	//現在輪到第幾個去跟別人去比
              for (int j = i + 1; j < list3.size(); j++) {
              	//讓後面的每一個都拿來跟他比較
                  if (list3.get(i).getNumber() < list3.get(j).getNumber()) {
                      // 交換
                      Train temp = list3.get(i);
                      list3.set(i, list3.get(j));
                      list3.set(j, temp);
                  }
              }
          }
          
          System.out.println("\n=== 不重複+大小 ===");
          for (Train t : list3) {
              System.out.println(t);
          }
	}



}

