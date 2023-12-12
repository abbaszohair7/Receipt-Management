
public class Clothing extends Item {
	private char size;
	private String color;

	public Clothing(String name, double price, int qty, char size, String color) {
		super(name, price, qty);
		this.size=size;
		this.color=color;		
	}
	public String getcolor() {
		return color;
	}
	public char getsize() {
		return size;
	}
	public void setsize(char size) {
		this.size=size;
	}
	public void setcolor(String color) {
		this.color=color;
	}
	@Override
	public double calTax() {
		return 0;
	}
	
	public String toString() {
	    return super.toString() + String.format("\t%-10s %-5c", color, size);
	}
}
