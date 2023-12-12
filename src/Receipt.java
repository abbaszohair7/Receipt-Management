import java.util.ArrayList;

public class Receipt {

	private ArrayList<Item> purchases;
	private int numpurchases;
	
	public Receipt(int capacity) {
		this.purchases= new ArrayList<>(capacity);
		this.numpurchases=0;
	}
	
	//adding items in the purchases
	public void add(Item item) {
		purchases.add(item);
		numpurchases+=item.getqty();
	}
	
	//Cacluating total amount of the cart before tax
	public double totalbeforetax() {
		double total=0;
		for(Item item: purchases) {
			total += item.getprice()*item.getqty();
		}
		return total;
	}
	
	//Calculating the totaltax of the cart
	public double totaltax() {
		double tax=0;
		for(Item item: purchases) {
			tax+=item.calTax();
		} 
		return tax;
	}
	
	public String toString() {
		StringBuilder result = new StringBuilder();
		
		result.append("Clothing:\n");
        for (Item item : purchases) {
            if (item instanceof Clothing) {
                result.append(result.append(item.toString()).append("\n"));
            }
        }

        result.append("\nHousewares:\n");
        for (Item item : purchases) {
            if (item instanceof Housewares) {
                result.append(item.toString()).append("\n");
            }
        }

        result.append("\nGrocery Items:\n");
        for (Item item : purchases) {
            if (item instanceof GrocItem && !(item instanceof Dairy) && !(item instanceof Cannedfood)) {
                result.append(item.toString()).append("\n");
            }
        }

        result.append("\nDairy:\n");
        for (Item item : purchases) {
            if (item instanceof Dairy) {
                result.append(item.toString()).append("\n");
            }
        }

        result.append("\nCanned Food:\n");
        for (Item item : purchases) {
            if (item instanceof Cannedfood) {
                result.append(item.toString()).append("\n");
            }
        }
        result.append("\n----------------------------------------------------------\n\n");
        result.append(String.format("Before Tax Amount: $%-10.2f\n", totalbeforetax()));
        result.append(String.format("Tax Amount: $%-10.7f\n", totaltax()));
        result.append(String.format("Total Cost: $%-10.7f\n", totaltax() + totalbeforetax()));
        result.append(String.format("Number of Items: %-5d", numpurchases));

	        return result.toString();
	
	}
}
