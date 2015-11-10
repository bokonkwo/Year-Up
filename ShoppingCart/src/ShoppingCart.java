import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {

	static Scanner scan = new Scanner(System.in);
	static ArrayList<Merchandise> Cart = new ArrayList<Merchandise>();
	static double Taxed = 0;

	public static <Merchandise> void main(String[] args) {

		Intro();
		Cart();

	}

	public static void Intro() {
		System.out.println("Welcome to the Shopping Cart!!\n" + "\n"
				+ "*********************************\n"
				+ "*                               *\n"
				+ "*         Shopping Cart         *\n"
				+ "*                               *\n"
				+ "*********************************");

	}

	public static void Cart() {

		System.out.println("Do you want to input items? Type y/n");
		String reply = scan.nextLine();
		if (reply.equalsIgnoreCase("y")) {
			Read();
			Clean();
			Total();
			Taxed(Taxed);

		} else {

			System.out.println("GoodBye!");
		}

	}

	public static void Read() {
		System.out.println("Enter item Name: ");
		String Name = scan.next();
		while (!Name.equalsIgnoreCase("q")) {
			System.out.println("Enter a price: ");
			double Price = scan.nextDouble();
			scan.nextLine();
			Merchandise newItem = new Merchandise(Name, Price);
			Cart.add(newItem);
			System.out.println("Enter next item Name or Q to quit: ");
			Name = scan.next();
			scan.nextLine();
		}
	}

	private static void listProducts() {
		for (int i = 0; i < Cart.size(); i++) {
			Merchandise current = Cart.get(i);
			System.out.println(
					"item number " + (i + 1) + " is " + current.getName()
							+ " at the price of $" + current.getPrice());
		}
		System.out.println("\n");
	}

	public static void Clean() {
		listProducts();
		System.out.println(
				"Would you like to remove something from the cart y/n:\n");
		String in = scan.nextLine();
		if (in.equalsIgnoreCase("y")) {
			System.out.println(
					"Enter the number of the item you want to remove, -1 to quit: ");
			int indexRead = scan.nextInt();

			int indexOfItem = indexRead - 1;
			while (indexRead != -1) {
				Merchandise Remove = Cart.get(indexOfItem);
				if (Remove != null) {
					Cart.remove(indexOfItem);
					System.out.println("You have removed " + Remove.getName());
					listProducts();
				}
				System.out.println("Enter another item number or -1 to quit:");
				indexRead = scan.nextInt();
			}
		}
	}

	private static void Total() {
		double price = 0;

		int i = 0;
		while (i < Cart.size()) {

			for (i = 0; i < Cart.size(); i++) {
				Merchandise CP = Cart.get(i);
				price = price + CP.getPrice();
			}
			System.out.println("The total Price is $" + price);

		}
		Taxed = price;
	}

	public static double Taxed(double total) {

		double Tax = total + (total * .075);
		if (Tax >= 100) {
			System.out.println(
					"Your total is above $100. You have to pay with card.");
		} else if (Tax < 100) {
			System.out.println(
					"You purchase is below $100 would you like to continue to shop. y or n and press enter twice:");
			String re = scan.nextLine();
			scan.nextLine();
			if (!re.equalsIgnoreCase("n")) {
				Cart();
			}
		}
		System.out.println("Thank you for shopping your price is $" + Tax);
		return Tax;
	}
}

