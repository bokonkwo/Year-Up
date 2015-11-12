
public class Main {

	public static void main(String[] args) {
		
		System.out.println("Welcome to the Tax payer program!");
		System.out.println("Welcome to the Tax payer program!");
		
		
		
		
		
		Jane jane = new Jane(100);
		jane.payTaxes(.1);
		
		John john = new John(100);
		john.payTaxes(.1);
		
		Lawyer A = new Lawyer(100);
		A.payTaxes(.1);
		
		Banker B = new Banker(100);
		B.payTaxes(.1);
		
		Teacher c = new Teacher(100);
		c.payTaxes(.1);

		TaxAuditor C = new TaxAuditor();
		C.Audit(Jane);
		C.Audit(John);
		C.Audit(A);
		C.Audit(B);
		C.Audit(c);
	}
	

}
