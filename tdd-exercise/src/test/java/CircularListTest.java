import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import tdd.CircularList;
import tdd.CircularListImpl;

/**
 * The test suite for testing the CircularList implementation
 */
public class CircularListTest {

    private CircularList circularList;

    @BeforeEach
    void InitializeCircularList(){
        circularList = new CircularListImpl();
    }

    @Test
    void CreateEmptyList(){
        assertTrue(circularList.isEmpty());
    }

    @Test 
    void AddAnElement(){
        circularList.add(0);
        assertTrue(!circularList.isEmpty());
        assertEquals(circularList.size(), 1);
        assertEquals(circularList.next(), Optional.of(0));
    }

    

}
