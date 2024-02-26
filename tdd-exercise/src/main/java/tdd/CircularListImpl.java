package tdd;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CircularListImpl implements CircularList {

    private List<Integer> liElements = new ArrayList<>();
    private int index = -1;

    public void add(final int element){
        liElements.add(element);
    }

    /**
     * Provides the current size of the list
     * @return the size of the list
     */
    public int size(){
        return liElements.size();
        
    }

    /**
     * Checks if the list is empty
     * @return true if the list is empty, false otherwise
     */
    public boolean isEmpty(){
        return liElements.isEmpty();
        
    }

    /**
     * Provides the next element of the list, as given by the built-in iterator.
     * @return the next element of the list, or an empty optional if the list is empty
     */
    public Optional<Integer> next(){
        if(isEmpty())
            return Optional.empty();
        index++;
        index = (index + size()) % size();
        return Optional.of(liElements.get(index));
    }

    /**
     * Provides the previous element of the list. Its behaviour is dual of the next() method.
     * @return the previous element into the list
     */
    public Optional<Integer> previous(){
        if(isEmpty())
            return Optional.empty();
        if(index != -1)
            index--;
        index = (index + size()) % size();
        return Optional.of(liElements.get(index));
    }

    /**
     * Reset the position of current element back to the first one of the list.
     * Note the first one is the first added to the list.
     */
    public void reset(){
        index=-1;
    }

}
