package home.cs.디자인패턴.팩토리패턴.팩토리메소드패턴;

public class FactoryMethodExample {
    public static void main(String[] args) {
        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory starFactory = new StarFactory();

        Shape circle = circleFactory.createShape();
        Shape star = starFactory.createShape();

        circle.draw();
        star.draw();
    }
}
// 팩토리 메소드를 가지는 인터페이스
interface ShapeFactory {
    Shape createShape();
}

// 원을 생성하는 팩토리 클래스
class CircleFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Circle();
    }
}

// 별을 생성하는 팩토리 클래스
class StarFactory implements ShapeFactory {
    @Override
    public Shape createShape() {
        return new Star();
    }
}
