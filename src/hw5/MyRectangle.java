package hw5;

public class MyRectangle {
	private double width;
	private double depth;
	
	public MyRectangle() {
//		無參數建構子+system.out
		
	}
	public MyRectangle(double width,double depth) {
		this.width=width;
		this.depth=depth;
//		有參數建構子
	}
	public void setWidth(double width) {
		this.width=width;
	}
	public void setDepth(double depth) {
		this.depth=depth;
	}
	public double getArea() {
		return width*depth;
	}
}
