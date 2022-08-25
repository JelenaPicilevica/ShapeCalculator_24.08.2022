package OOP;

public class Square extends Shape{

    double squareSide;

    public Square (String shapeName){
        super(shapeName);
    }

    public Square(){
        super();
    }

    public void setSquareSide(double squareSide) {
        this.squareSide = squareSide;
    }

    @Override
    public void shapeArea() {
        double result = squareSide * squareSide;
        System.out.println("Square area with sides equal to " + squareSide + " is " + result);
    }

    @Override
    public void shapePerimeter() {
        double result = squareSide*4;
        System.out.println("Square perimeter with sides equal to " + squareSide + " is " + result);
    }
}
