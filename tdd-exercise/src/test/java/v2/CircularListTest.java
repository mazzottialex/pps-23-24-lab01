package v2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.v2.CircularListImpl;
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

    @Test
    void CheckForwardWithOneElement(){
        List li = List.of(0);
        circularList.add(0);
        assertEquals(li.iterator().next(), circularList.forwardIterator().next());
    }
}