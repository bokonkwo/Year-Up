public class Lawyer implements ITaxPayer {

	private double income = -1;
	private boolean doneTax = false;

	Lawyer(double income) {
		setIncome(income);
	}

	public double getIncome() {
		return income;
	}

	private void setIncome(double Income) {
		income = Income;
	}

	public void payTaxes(double rate) {

		if (doneTax == false) {
			double taxAmount = getIncome() * rate;
			System.out.println(
					"Lawyer is paying the following tax: " + taxAmount);
			setIncome(getIncome() - taxAmount);
			System.out.println(
					"My income after paying taxes is: " + getIncome()+"\n");
			doneTax = true;
		}
	}
	public void fileTax() {
		if (doneTax) {
			System.out.println("I pitty the fool who doesn't get a discount!\n");
		}
	}

}