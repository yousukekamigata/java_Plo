package java入門実践編3C14;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void instantiate() {
		Account a = new Account("ミナト", 30000);
		assertEquals("ミナト", a.owner);
		assertEquals(30000, a.balance);
	}

	@Test
	public void transfer() {
	}
}