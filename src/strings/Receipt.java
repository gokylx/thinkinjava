package strings;

import java.util.Formatter;

public class Receipt {
	private double total = 0;
	private Formatter formatter = new Formatter(System.out);

	public void printTitle() {
		formatter.format("%-15s %5s %10s \n", "Title", "Qty", "Price");
		formatter.format("%-15s %5s %10s \n", "-----------", "-----", "------");

	}

	public void print(String name, int qty, double price) {
		formatter.format("%-15.15s %5d %10.2f \n", name, qty, price);
		total += price;
	}

	public void printTotal() {
		double tax = total * 0.2;
		formatter.format("%-15.15s %5s %10.2f \n", "Tax", "", tax);
		total += tax;
		formatter.format("%-15s %5s %10s \n", "", "", "------");
		formatter.format("%15s %5s %10.2f", "", "", total);
	}

	public static void main(String[] args) {
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("mb", 5, 10.2);
		receipt.print("nb", 2, 8.4);
		receipt.printTotal();

	}
}
