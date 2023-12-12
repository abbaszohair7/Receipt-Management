
public class GrocItem extends Item{
	
	private boolean perishable;
	
	public GrocItem(String name, double price, int qty, boolean perishable) {
		super(name, price, qty);
		this.perishable=perishable;
	}
	public boolean getperishable() {
		return perishable;	
	}
	public void setperishable(boolean perishable) {
		this.perishable=perishable;
	}
	public String toString() {
	    return super.toString() + String.format("\t%-5b", perishable);
	}
}
