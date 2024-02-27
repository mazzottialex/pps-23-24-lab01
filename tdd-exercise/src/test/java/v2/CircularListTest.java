package v2;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Iterator;
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
        List<Integer> li = List.of(0);
        circularList.add(0);
        assertEquals(li.iterator().next(), circularList.forwardIterator().next());
    }

    @Test
    void CheckBackwardWithOneElement(){
        List<Integer> li = List.of(0);
        circularList.add(0);
        assertEquals(li.iterator().next(), circularList.backwardIterator().next());
    }

    @Test
    void CheckForwardWithElements(){
        List<Integer> li = List.of(0,1,2,3,4);
        circularList.add(0);
        circularList.add(1);
        circularList.add(2);
        circularList.add(3);
        circularList.add(4);
        Iterator<Integer> it = circularList.forwardIterator();
        Iterator<Integer> it2 = li.iterator();
        assertAll(
            ()-> assertEquals(it2.next(), it.next()),
            ()-> assertEquals(it2.next(), it.next()),
            ()-> assertEquals(it2.next(), it.next()),
            ()-> assertEquals(it2.next(), it.next()),
            ()-> assertEquals(it2.next(), it.next())
        );
        Iterator<Integer> it3 = li.iterator();
        assertAll(
            ()-> assertEquals(it3.next(), it.next()),
            ()-> assertEquals(it3.next(), it.next()),
            ()-> assertEquals(it3.next(), it.next()),
            ()-> assertEquals(it3.next(), it.next()),
            ()-> assertEquals(it3.next(), it.next())
        );

    }
}