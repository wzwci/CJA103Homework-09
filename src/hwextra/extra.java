package hwextra;

	abstract class Pen{
		private String brand;
		private double price;
		
		public Pen() {
			brand="";
			price=0.0;
		}
		public Pen(String brand,double price) {
			this.brand=brand;
			this.price=price;
		}
		public String getBrand() {
			return brand;
		}
		public void setBrand(String brand) {
			this.brand=brand;
		}
		public double getPrice() {
			return price;
		}
		public void setPrice(double price) {
			this.price=price;
		}
		public abstract void write();
	}
	class Pencil extends Pen{
		public Pencil(String brand,double price) {
			super(brand,price);
		}
		@Override
		public void write() {
			System.out.println("削鉛筆再寫");
		}
		@Override
		public double getPrice() {
			return super.getPrice()*0.8;
		}
	}
	class InkBrush extends Pen{
		public InkBrush(String brand,double price) {
			super(brand,price);
		}
		@Override
		public void write() {
			System.out.println("沾墨汁再寫");
		}
		@Override
		public double getPrice() {
			return super.getPrice()*0.9;
		}
	}
	public class extra{
		public static void main(String[]args) {
			Pen p1=new Pencil("阿巴",10);
			Pen p2= new InkBrush("批批",150);
			
			Pen[]pens= new Pen[2];
			pens[0]=p1;
			pens[1]=p2;	
			
			for (int i = 0; i < pens.length; i++) {
	            System.out.println("品牌: " + pens[i].getBrand());
	            pens[i].write();      
	            System.out.println("售價: " + pens[i].getPrice()); 
			}
		}
	}

