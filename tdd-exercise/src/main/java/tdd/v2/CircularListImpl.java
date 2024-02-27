package tdd.v2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


public class CircularListImpl implements CircularList {
    
    private final List<Integer> li = new ArrayList<>();

    public void add(final int element){
        li.add(element);
    }

    public int size(){
        return 0;
    }

    public boolean isEmpty(){
        return true;
    }

    public Iterator<Integer> forwardIterator(){
        return li.iterator();
    }

    public Iterator<Integer> backwardIterator(){
        return null;
    }

    public void reset(){

    }
}
