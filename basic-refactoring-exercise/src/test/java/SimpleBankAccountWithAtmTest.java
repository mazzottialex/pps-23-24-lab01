import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccountWithAtm;

class SimpleBankAccountWithAtmTest {
    
    private BankAccount simpleBankAccountWithAtm;

    @BeforeEach
    void InitializeSimpleBankAccountWithAtm(){
        simpleBankAccountWithAtm = new SimpleBankAccountWithAtm(new AccountHolder("Pino", "lino", 0), 1000);
    }

    @Test
    void getBalance(){
        assertEquals(simpleBankAccountWithAtm.getBalance(), 1000);
    }

    @Test 
    void depositWithFee(){
        simpleBankAccountWithAtm.deposit(0, 100);
        assertEquals(simpleBankAccountWithAtm.getBalance(), 1099);
    }

    @Test 
    void withdrawWithFee(){
        simpleBankAccountWithAtm.withdraw(0, 100);
        assertEquals(simpleBankAccountWithAtm.getBalance(), 899);
    }
}
