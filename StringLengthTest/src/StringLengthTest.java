import static org.junit.Assert.*;

import org.junit.Test;

public class StringLengthTest {

	@Test
	public void test() {
		StringLength Z = new StringLength();
		int X = Z.LengthOfString(null);
		assertEquals (X,0);
	}

}
