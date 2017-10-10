package unit13;

import java.util.Formatter;

public class Receipt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Receipt receipt = new Receipt();
		receipt.printTitle();
		receipt.print("Jack's Magic Beans", 4, 4.25);
		receipt.print("Princess Peas", 3, 5.1);
		receipt.print("Three Bears Porridge", 1, 14.29);
		receipt.printTotal();
	}
	
	private double total = 0;
	private int[] widths = {20, 5, 10};
	private Formatter f = new Formatter(System.out);
	public void printTitle(){
		f.format("%-" + widths[0] + "s %" + widths[1] + "s %" + widths[2] + "s\n", "Item", "Qty", "Price");
		f.format("%-" + widths[0] + "s %" + widths[1] + "s %" + widths[2] + "s\n", "----", "---", "----");
	}
	public void print(String name, int qty, double price){
		f.format("%-" + widths[0] + "s %" + widths[1] + "d %" + widths[2] + "f\n", name, qty, price);
		total += price;
	}
	public void printTotal(){
		f.format("%-" + widths[0] + "s %" + widths[1] + "s %" + widths[2] + "f\n", "Tax", "", total * 0.06);
		f.format("%-" + widths[0] + "s %" + widths[1] + "s %" + widths[2] + "s\n", "", "", "-----");
		f.format("%-" + widths[0] + "s %" + widths[1] + "s %" + widths[2] + "f\n", "Total", "", total * 1.06);
	}
}
