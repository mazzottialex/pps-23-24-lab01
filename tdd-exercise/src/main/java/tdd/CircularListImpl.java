package tdd;

import java.util.Optional;

public class CircularListImpl implements CircularList {

    public void add(final int element){

    }

    /**
     * Provides the current size of the list
     * @return the size of the list
     */
    public int size(){
        return 0;
        
    }

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty(){
        return true;
        
    }

    /**
     * Provides the next element of the list, as given by the built-in iterator.
     * @return the next element of the list, or an empty optional if the list is empty
     */
    public Optional<Integer> next(){
        return null;
        
    }

    /**
     * Provides the previous element of the list. Its behaviour is dual of the next() method.
     * @return the previous element into the list
     */
    public Optional<Integer> previous(){
        return null;

    }

    /**
     * Reset the position of current element back to the first one of the list.
     * Note the first one is the first added to the list.
     */
    public void reset(){
        
    }

}
