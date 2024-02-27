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
        return new Iterator<Integer>() {
            private int index = -1;
            @Override
            public boolean hasNext() {
                return true;
            }
            
           @Override
           public Integer next() {
               index++;
               index = (index + li.size()) % li.size();
               return li.get(index);
           }          
        };
    }

    public Iterator<Integer> backwardIterator(){
        return li.reversed().iterator();
    }

    public void reset(){

    }
}
