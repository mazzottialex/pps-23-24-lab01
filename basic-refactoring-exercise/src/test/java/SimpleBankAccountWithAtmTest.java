import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import example.model.BankAccount;
import example.model.SimpleBankAccountWithAtm;

class SimpleBankAccountWithAtmTest {
    
    private BankAccount simpleBankAccountWithAtm;

    @BeforeEach
    void InitializeSimpleBankAccountWithAtm(){
        simpleBankAccountWithAtm = new SimpleBankAccountWithAtm();
    }

}
