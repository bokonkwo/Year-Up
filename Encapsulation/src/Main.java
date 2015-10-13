
public class Main {

	public static void main(String[] args)
	{
		Security head = new Security("Brian Okonkwo", 23, "9191234567", "730 Peachtree St");
		System.out.println("head's name is " + head.GetName());
		System.out.println("head's age is " + head.GetAge());
		System.out.println("head's phone number is " + head.GetPhoneNumber());
		System.out.println("head's address is " + head.GetAddress());
		System.out.println("It is September 4, 2016");
		head.GrowsOlder();
		System.out.println("head's age is " + head.GetAge());

	}

}
