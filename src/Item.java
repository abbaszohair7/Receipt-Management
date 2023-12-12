
public abstract class Item {
	public double Taxrate = 0.07525;
	private String name;
	private double price;
	private int qty;
	
	public Item(String name, double price, int qty) {
		this.name=name;
		this.price=price;
		this.qty=qty;
	}
	
	public String getname() {
		return name;
	}
	public double getprice() {
		return price;
	}
	public int getqty() {
		return qty;
	}
	public void setname(String name) {
		this.name=name;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public void setqty(int qty) {
		this.qty=qty;
	}
	public double calTax() {
		return 0;
	}
	@Override
	public String toString() {
	    return String.format("%-20s $%-10.2f %-5d $%-10.2f", name, price, qty, qty * price);
	}
	@Override
    public boolean equals(Object obj) {
        if (obj instanceof Item) {
            Item other = (Item) obj;
            return this.name.equalsIgnoreCase(other.name);
        }
        return false;
    }
	
}
	
	

