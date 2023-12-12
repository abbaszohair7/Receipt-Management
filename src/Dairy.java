
public class Dairy extends GrocItem{

	private String expirationdate;
	public Dairy(String name, double price, int qty, boolean perishable, String expirationdate) {
		super(name, price, qty, perishable);
		this.expirationdate=expirationdate;
	}
	
	public String getexpirationdate() {
		return expirationdate;
	}
	
	public void setexpirationdate(String expirationdate) {
		this.expirationdate=expirationdate;
	}
	
	public String toString() {
	    return super.toString() + String.format("\t%-5b", expirationdate);
	}

}
