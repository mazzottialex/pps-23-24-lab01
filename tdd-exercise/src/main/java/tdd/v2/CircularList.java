package tdd.v2;

import java.util.Iterator;
import java.util.Optional;



public interface CircularList {
    /**
     * Adds an element to the list, namely, after the last inserted one.
     * @param element the element to be added to the list
     */
    void add(final int element);

    /**
     * Provides the current size of the list
     * @return the size of the list
     */
    int size();

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    boolean isEmpty();

    /**
     * returns a new java.util.Iterator, which yields next elements, circularly
     * @return iterator of next the list
     */
    Iterator<Integer> forwardIterator();

    /**
     * returns a new java.util.Iterator, which yields previous elements, circularly
     * @return iterator backward of the list
     */
    Iterator<Integer> backwardIterator();

    /**
     * Reset the position of current element back to the first one of the list.
     * Note the first one is the first added to the list.
     */
    void reset();
}
