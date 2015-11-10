public class Merchandise {
	public String Item = null;
	public double Price;
	public int Q;

	public Merchandise(String name, double price, int quantity) {
		String Name = name;
		double Price = price;
		int Quantity = 0;

	}

	Merchandise(String name) {
		Item = name;
	}

	Merchandise(double price) {
		Price = price;
	}

	Merchandise(String name, double price) {
		Item = name;
		Price = price;
	}
	Merchandise(String name, int quantity, double price) {
		Item = name;
		Q = quantity;
		Price = price;
	}

	public int getQuantity() {
		return Q;
	}

	public void setQuantity(int quantity) {
		Q = quantity;
	}

	public String getName() {
		return Item;
	}

	public void setName(String name) {
		Item = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

}
