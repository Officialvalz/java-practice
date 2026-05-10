import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

class AccountTest {

    @Test
    @DisplayName("Deposit 500 into empty account → balance becomes 500")
    void testDepositIntoEmptyAccount() {
        Account account = new Account(0, "1234");
        account.deposit(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    @DisplayName("Deposit negative amount → balance unchanged")
    void testDepositNegativeAmount() {
        Account account = new Account(500, "1234");
        account.deposit(-200);
        assertEquals(500, account.getBalance());
    }

    @Test
    @DisplayName("Deposit zero → balance unchanged")
    void testDepositZero() {
        Account account = new Account(1000, "1234");
        account.deposit(0);
        assertEquals(1000, account.getBalance());
    }


    @Test
    @DisplayName("Withdraw 200 from account with 500 → balance becomes 300")
    void testWithdrawValidAmount() {
        Account account = new Account(500, "1234");
        account.withdraw(200);
        assertEquals(300, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw more than balance → balance unchanged")
    void testWithdrawMoreThanBalance() {
        Account account = new Account(500, "1234");
        account.withdraw(600);
        assertEquals(500, account.getBalance());
    }

    @Test
    @DisplayName("Withdraw zero → balance unchanged")
    void testWithdrawZero() {
        Account account = new Account(1000, "1234");
        account.withdraw(0);
        assertEquals(1000, account.getBalance());
    }

    @Test
    @DisplayName("Check balance → returns correct balance without changing it")
    void testCheckBalance() {
        Account account = new Account(1000, "1234");
        double currentBalance = account.getBalance();
        assertEquals(1000, currentBalance);
    }

    @Test
    @DisplayName("Update PIN with correct old PIN → PIN updated successfully")
    void testUpdatePinSuccess() {
        Account account = new Account(1000, "1234");
        String result = account.updatePin("1234", "5678");
        assertEquals("SUCCESS", result);
        assertEquals("5678", account.getPin());
    }

    @Test
    @DisplayName("Update PIN with wrong old PIN → transaction rejected, PIN unchanged")
    void testUpdatePinWrongOldPin() {
        Account account = new Account(1000, "5678");
        String result = account.updatePin("1111", "2468");
        assertEquals("WRONG_PIN", result);
        assertEquals("5678", account.getPin());   // PIN must remain unchanged
    }

    @Test
    @DisplayName("Update PIN with empty new PIN → transaction rejected")
    void testUpdatePinEmptyNewPin() {
        Account account = new Account(1000, "5678");
        String result = account.updatePin("1111", "");
        assertEquals("INVALID_PIN", result);
        assertEquals("5678", account.getPin());   // PIN must remain unchanged
    }

    @Test
    @DisplayName("Update PIN with new PIN too short (less than 4 digits) → transaction rejected")
    void testUpdatePinTooShort() {
        Account account = new Account(1000, "5678");
        String result = account.updatePin("1234", "12");
        assertEquals("PIN_TOO_SHORT", result);
        assertEquals("5678", account.getPin());   // PIN must remain unchanged
    }
}
