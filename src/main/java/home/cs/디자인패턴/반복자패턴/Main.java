package home.cs.디자인패턴.반복자패턴;

public class Main {
    public static void main(String[] args) {
        Car cars[] = {new Car("박스터 911"),new Car("투싼"),new Car("아우디 A6")};

        ConcreteCollection collection = new ConcreteCollection(cars);
        Iterator iterator = collection.createIterator();
        
        while(iterator.hasNext()){
            System.out.println("iterator.next() = " + iterator.next());
        }


    }
}
