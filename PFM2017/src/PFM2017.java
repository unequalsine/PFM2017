
public class PFM2017 {

	public static void main(String[] args) {
		
		double orderAmount = 30;
		double shippingCosts = 0;
		double totalAmount = 0;

		if (orderAmount <= 50.00 ) {
			shippingCosts = 8;
			totalAmount = shippingCosts + orderAmount;
		} else if (orderAmount > 50.00 && orderAmount <= 100.00) {
			shippingCosts = 4;
			totalAmount = shippingCosts + orderAmount;
		} else {
			totalAmount = orderAmount;
		}
		
		String outputText = "The total payable amount is €" + totalAmount + ".";
		System.out.print(outputText);
	}
}
