package home.cs.디자인패턴.반복자패턴;

public class ConcreteIterator implements Iterator{

    private Car[] collection;
    private int index = 0;

    public ConcreteIterator(Car[] collection) {
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return index < collection.length;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return collection[index++];
        }else{
            return null;
        }
    }
}
