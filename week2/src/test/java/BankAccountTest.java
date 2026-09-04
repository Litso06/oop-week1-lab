import org.junit.jupiter.api.Test;

import com.zut.BankAcount;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankAccountTest {
    @Test
    void testBankAccount() {
        // Arrange  - what do i need to test
        BankAcount account = new BankAcount();

        // Act - whats the one action i want ro check?
        account.deposit(100);

        // Assert - what must be true?
        assertEquals(100, account.balance);
    }
}