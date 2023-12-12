
public class Housewares extends Item {
	private String material;
	public Housewares(String name, double price, int qty, String material) {
		super(name, price, qty);
		this.material=material;
	}
	public String getmaterial() {
		return material;
	}
	public void setmaterial(String material) {
		this.material=material;
	}
	public double calTax() {
		return super.getprice()*super.getqty()*Taxrate;
	}
	public String toString() {
	    return super.toString() + String.format("\t%-10s", material);
	}

}
