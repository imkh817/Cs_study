package home.cs.디자인패턴.반복자패턴;

public class ConcreteCollection implements Collection{

    private Car[] cars;

    public ConcreteCollection(Car[] cars) {
        this.cars = cars;
    }

    @Override
    public Iterator createIterator() {
        return new ConcreteIterator(cars);
    }
}
