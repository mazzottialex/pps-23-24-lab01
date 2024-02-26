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
    void getHolderFromBankAccountWithAtm(){
        simpleBankAccountWithAtm.getHolder();
    }
}
