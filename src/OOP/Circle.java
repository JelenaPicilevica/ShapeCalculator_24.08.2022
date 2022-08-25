package OOP;

public class Circle extends Shape {

    double radius;

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public Circle(String shapeName) {
        super(shapeName);
    }

    public Circle() {
        super();
    }

    @Override
    public void shapeArea() {
        double result = Math.PI * radius * radius;
        Math.round(result);
        System.out.println("Circle area with radius " + radius + " is " + result);
    }

    @Override
    public void shapePerimeter() {
        double result = 2 * Math.PI * radius;
        System.out.println("Perimeter of circle with radius " + radius + " is " + result);
    }


}
