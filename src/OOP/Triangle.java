package OOP;

public class Triangle extends Shape {

    double height;
    double side1Base;
    double side2;
    double side3;

    public Triangle(){
        super();
    }

    public Triangle(String shapeName){
        super(shapeName);
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setSide1Base(double side1Base) {
        this.side1Base = side1Base;
    }

    public void setSide2(double side2){
        this.side2 = side2;
    }

    public void setSide3(double side3){
        this.side3 = side3;
    }

    @Override
    public void shapeArea() {
        double result = 0.5*height*side1Base;
        System.out.println("Triangle area with height " + height + " and base " + side1Base + " is " + result);
    }

    @Override
    public void shapePerimeter(){
        double result = side1Base + side2 + side3;
        System.out.println("Triangle perimeter with sides " + side1Base + ", " + side2 + " and " + side3 + " is " + result);
    }
}
