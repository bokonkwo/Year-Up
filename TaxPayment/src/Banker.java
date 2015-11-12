
public class Banker 
{
	private double m_income = -1;
	private boolean m_donePayingTaxes = false;
	
	Banker(double income)
	{
		if (m_donePayingTaxes == false)
		{
			
		}
	
	public double GetIncome()
	{
		return m_income;
	}

	private void SetIncome(double income)
	{
		m_income = income;
	}
	public void PayTaxes(double income, double taxRate)
	{
		if (m_donePayingTaxes == false)
		{
			double taxAmount = income * taxRate;
			double discountedTaxAmount = taxAmount - taxAmount * .1;
			System.out.println("My income after paying taxes is: " + GetIncome)
			m_donePayingTaxes = true;
		}
		
	}
	
	public void FileTaxReturn()
	{
		if (m_donePayingTaxes)
	}
	
	p

	}

}
