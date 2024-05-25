package miittest;

import miit.BalanceAccount;
import org.junit.Before;
public class BalanceAccountTest
{
	BalanceAccount account;
	@Before
	public voidsetup()
	{
		account=new BalanceAccount("gaurav",1000);
	}
	@Test
	public void testdeposit()
	{
		account.deposit(-500);
		assertEquals(2500,account.getbalance());
	}
}
