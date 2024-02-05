package home.cs.디자인패턴.팩토리패턴.간단한팩토리메소드패턴;

// 간단한 팩토리 클래스
public class SimpleShapeFactory {
    public static Shape createShape(String type){
        if("Circle".equalsIgnoreCase(type)){
            return new Circle();
        } else if ("Star".equalsIgnoreCase(type)) {
            return new Star();
        }

        return null;
    }
}
