package home.cs.디자인패턴.반복자패턴;

import java.util.Arrays;
import java.util.Comparator;

public class ConcreteReverseIterator implements Iterator{
    private Car[] collection;
    private int index = 0;

    public ConcreteReverseIterator(Car[] collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length;
    }

    @Override
    public Object next() {
        if(hasNext()){
            Arrays.sort(collection,Comparator.comparing(Car::getName).reversed());
            return collection[index++];
        }else{
            return null;
        }
    }
}
