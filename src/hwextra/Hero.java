package hwextra;

public abstract class Hero {
	public String name;
	public int level;
	public double exp;
	
	
	public Hero(String name, int level, double exp) {
		this.name=name;
		this.level=level;
		this.exp=exp;

	}
	public void move() {
		System.out.println(name+" 跑步");
	}
	public abstract void attack();
	public void defend() {
		System.out.println(name+" 做防禦動作");
	}

}
