 
public class Cannedfood extends GrocItem {

	private int size;
	public Cannedfood(String name, double price, int qty, boolean perishable, int size) {
		super(name, price, qty, perishable);
		this.size=size;
	}
	
	public int getsize() {
		return size;
	}
	
	public void setsize(int size) {
		this.size=size;
	}

	public String toString() {
	    return super.toString() + String.format("\t%d", size);
	}
}
