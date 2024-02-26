package v1;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import tdd.v1.CircularList;
import tdd.v1.CircularListImpl;

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
    }

    @Test
    void NextIsCorrectWithOneElements(){
        AddAnElement();
        assertEquals(circularList.next(), Optional.of(0));
    }

    @Test
    void PreviousIsCorrectWithOneElements(){
        AddAnElement();
        assertEquals(circularList.previous(), Optional.of(0));
    }
    
    @Test
    void AddElements(){
        circularList.add(0);
        circularList.add(1);
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);
        assertEquals(circularList.size(), 5);


        assertTrue(!circularList.isEmpty());
    }

    @Test
    void NextIsCorrectWithMoreElements(){
        AddElements();
        assertEquals(circularList.next(), Optional.of(0));
        assertEquals(circularList.next(), Optional.of(1));
        assertEquals(circularList.next(), Optional.of(2));
        assertEquals(circularList.next(), Optional.of(3));
        assertEquals(circularList.next(), Optional.of(4));
        assertEquals(circularList.next(), Optional.of(0));
        assertEquals(circularList.next(), Optional.of(1));
    }

    @Test
    void PreviousIsCorrectWithMoreElements(){
        AddElements();
        assertEquals(circularList.previous(), Optional.of(4));
        assertEquals(circularList.previous(), Optional.of(3));
        assertEquals(circularList.previous(), Optional.of(2));
        assertEquals(circularList.previous(), Optional.of(1));
        assertEquals(circularList.previous(), Optional.of(0));
        assertEquals(circularList.previous(), Optional.of(4));
        assertEquals(circularList.previous(), Optional.of(3));
    }

    @Test
    void NextPreviousIsCorrectWithMoreElements(){
        AddElements();
        assertEquals(circularList.previous(), Optional.of(4));
        assertEquals(circularList.previous(), Optional.of(3));
        assertEquals(circularList.next(), Optional.of(4));
        assertEquals(circularList.previous(), Optional.of(3));
        assertEquals(circularList.next(), Optional.of(4));
        assertEquals(circularList.next(), Optional.of(0));
        assertEquals(circularList.previous(), Optional.of(4));
    }

    @Test
    void AddElementBetweenMove(){
        AddElements();
        assertEquals(circularList.previous(), Optional.of(4));
        assertEquals(circularList.previous(), Optional.of(3));
        assertEquals(circularList.next(), Optional.of(4));
        circularList.add(5);
        assertEquals(circularList.next(), Optional.of(5));
    }

    @Test
    void NextWithEmptyList(){
        assertEquals(circularList.next(), Optional.empty());
    }

    @Test 
    void ResetPosition(){
        AddElements();
        assertEquals(circularList.next(), Optional.of(0));
        assertEquals(circularList.next(), Optional.of(1));
        circularList.reset();
        assertEquals(circularList.next(), Optional.of(0));
    }
}
