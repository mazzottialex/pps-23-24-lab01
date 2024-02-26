package v2;

import org.junit.jupiter.api.BeforeEach;

import tdd.v1.CircularListImpl;
import tdd.v2.CircularList;

public class CircularListTest{
    
    private CircularList circularList;

    @BeforeEach
    void InitializeCircularList(){
        circularList = new CircularListImpl();
    }

    
}