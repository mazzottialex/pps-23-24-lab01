package v2;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.v1.CircularListImpl;
import tdd.v2.CircularList;

public class CircularListTest{
    
    private CircularList circularList;

    @BeforeEach
    void InitializeCircularList(){
        circularList = new CircularListImpl();
    }

    @Test
    void CreateCircularListEmpty(){
        assertTrue(circularList.isEmpty());
    }
}