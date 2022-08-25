package OOP;

public class Rectangle extends Shape {

    double sideA;
    double sideB;

    public Rectangle(String shapeName) {
        super(shapeName);
    }

    public Rectangle(){}


    public void setSideA(double sideA) {
        this.sideA = sideA;
    }

    public void setSideB(double sideB) {
        this.sideB = sideB;
    }

    @Override
    public void shapeArea() {
        double result = sideA * sideB;
        System.out.println("Rectangle area with sides " + sideA + " and " + sideB + " is " + result);
    }

    @Override
    public void shapePerimeter() {
        double result = 2 * (sideA + sideB);
        System.out.println("Rectangle perimeter with sides " + sideA + " and " + sideB + " is " + result);
    }




//        @Override
//        public void shapeArea () {
//            double result = sideA * sideB;
//            System.out.println("Rectangle area with sides " + sideA + " and " + sideB + " is" + result);
//        }
//
//        @Override
//        public void shapePerimeter () {
//            double result = 2 * (sideA + sideB);
//            System.out.println("Rectangle area with sides " + sideA + " and " + sideB + " is" + result);
//
//        }

    }


