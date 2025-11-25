package hw8;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//• 請設計一個Train類別，並包含以下屬性：
//- 班次 number，型別為int - 車種 type，型別為String - 出發地 start，型別為String
//- 目的地 dest，型別為String - 票價 price，型別為double
//• 設計對應的getter/setter方法，並在main方法裡透過建構子產生以下7個Train的物件，放到每小題
//需使用的集合裡
//- (202, “普悠瑪”, “樹林”, “花蓮”, 400)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//- (118, “自強”, “高雄”, “台北”, 500)
//- (1288, “區間”, “新竹”, “基隆”, 400)
//- (122, “自強”, “台中”, “花蓮”, 600)
//- (1222, “區間”, “樹林”, 七堵, 300)
//- (1254, “區間”, “屏東”, “基隆”, 700)
//• 請寫一隻程式，能印出不重複的Train物件
//• 請寫一隻程式，讓Train物件印出時，能以班次編號由大到小印出
//• 承上，不僅能讓班次編號由大排到小印出， 還可以不重複印出Train物件
//(以上三題請根據使用的集合，練習各種取值寫法，如迭代器、for迴圈或foreach等)

public class Train {
	private int number;
	private String type;
	private String start;
	private String dest;
	private double price;
	
	public Train(int number,String type, String start, String dest, double price) {
		this.number = number;
        this.type = type;
        this.start = start;
        this.dest = dest;
        this.price = price;
    }
	
	public int getNumber() { 
		return number; 
		}
    public void setNumber(int number) { 
    	this.number = number; 
    	}

    public String getType() {
    	return type; 
    	}
    public void setType(String type) {
    	this.type = type; 
    	}

    public String getStart() {
    	return start;
    	}
    public void setStart(String start) {
    	this.start = start; 
    	}

    public String getDest() {
    	return dest; 
    	}
    public void setDest(String dest) {
    	this.dest = dest; 
    	}

    public double getPrice() {
    	return price;
    	}
    public void setPrice(double price) { 
    	this.price = price; 
    	}
    
    @Override
    public String toString() {
//  public void|回傳  	n
        return "班次:"+number+"  車種:"+type + "  出發地："+start+"  目的地："+dest+"  票價："+price;
    }
//   hashset|保證沒有重複元素+hashcode 
//    equals + hashCode ⇒ 就是模板，改屬性名就好
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
//        this:當前物件，o是傳進來的物件|因為相同物件就不會看下去 
        if (!(o instanceof Train)) return false;
        Train train = (Train) o;
//        train的東西要跟o比較
        return number == train.number &&
               Double.compare(train.price, price) == 0 &&
               Objects.equals(type, train.type) &&
//               object.equals(a,b)比較兩個可能為null的物件是否相等
               Objects.equals(start, train.start) &&
               Objects.equals(dest, train.dest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, type, start, dest, price);
    }

}

    
    
	
	
	

