public class Cart {
	public String Name = null;
	public double Price;
	public double WithTax;

	public Cart(String name, double price, double withTax) {
		String Name = name;
		double Price = price;
		double tax = .075;
		tax = withTax;
		

	}

	Cart(String name) {
		Name = name;
	}

	Cart(double price) {
		Price = price;
	}

	Cart(String name, double price) {
		Name = name;
		Price = price;
	}

	
	public double getWithTax() {
		WithTax = Price * WithTax;
		return WithTax;
	}

	public void setWithTax(double withTax) {
		WithTax = withTax;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}



}