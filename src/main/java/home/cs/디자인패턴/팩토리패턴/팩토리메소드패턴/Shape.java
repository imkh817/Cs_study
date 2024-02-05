package home.cs.디자인패턴.팩토리패턴.팩토리메소드패턴;

public interface Shape {
    void draw();
}
class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("원을 그립니다.");
    }
}
// Star 객체
class Star implements Shape {

    @Override
    public void draw() {
        System.out.println("별을 그립니다.");
    }

}
