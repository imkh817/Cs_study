package home.cs.디자인패턴.팩토리패턴.간단한팩토리메소드패턴;

public class SimpleFactoryExample {
    // 클라이언트 코드
    public static void main(String[] args) {
        Shape circle = SimpleShapeFactory.createShape("Circle");
        Shape star = SimpleShapeFactory.createShape("Star");

        if(circle != null) circle.draw();
        if(star != null) star.draw();
    }
}
// 도형 인터페이스
interface Shape{
    void draw();
}
// Circle 객체
class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}
// Star 객체
class Star implements Shape{

    @Override
    public void draw() {
        System.out.println("별을 그립니다.");
    }

}