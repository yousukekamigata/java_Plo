package java������H��3C14;

import static org.junit.Assert.*;

import org.junit.Test;

public class AccountTest {

	@Test
	public void instantiate() {
		Account a = new Account("�~�i�g", 30000);
		assertEquals("�~�i�g", a.owner);
		assertEquals(30000, a.balance);
	}

	@Test
	public void transfer() {
	}
}