interface Shape {
    void draw();
}
class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle.");
    }
}
class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle.");
    }
}

public class test12 {
    public static void main(String[] args) {
                Shape shapeRef;

        shapeRef = new Circle();
        shapeRef.draw();

        shapeRef = new Rectangle();
        shapeRef.draw();
    }
}