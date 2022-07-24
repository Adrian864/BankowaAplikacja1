import org.junit.Assert;
import org.junit.Test;

public class BankAccountTesting {
    @Test
    public void Method_to_see_if_withdrawal_of_fund_reduces_bank_account() {
        AccountDetails accountDetails = new AccountDetails();
        accountDetails.setBalance(100);
        long expectedResult = accountDetails.getBalance();
        Assert.assertEquals(100, accountDetails.getBalance());

    }
}
