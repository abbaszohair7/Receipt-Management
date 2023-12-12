
public class Driver {
	
	public static void main(String[] arg) {
		
		Receipt r1 = new Receipt(10);
		Receipt r2 = new Receipt(10);
		
		//adding items to receipt.
		
		r1.add(new Clothing("shirt",25, 3, 'M', "Red"));
		r1.add(new Dairy("dairy milk", 2.65, 10, true, "25-jan-2023"));
		r1.add(new Dairy("Olper milk", 3.65, 1, true, "20-jan-2023"));
		r1.add(new GrocItem("slaw",3.73,4, true));
		r1.add(new GrocItem("Flour",1.89,2, false));
		r1.add(new Housewares("pan", 14.99, 1, "Non-stick"));
		
		System.out.println("Receipt1 \n"+r1);
	}
}
