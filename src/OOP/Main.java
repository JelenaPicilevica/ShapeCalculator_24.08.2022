package OOP;

/*
        Create a shapes calculator with different entities/classes such as
        Shape, Circle, Rectangle, square, triangle

        Abstract class Shape with abstract method => to correct in each class
        To calculate area and perimetr of each shape

     */

public class Main {

    public static void main(String[] args) {

        Circle circle = new Circle();

        System.out.println();                //Empty row for easier reading

        circle.setRadius(4);
        circle.shapeArea();
        circle.shapePerimeter();

        System.out.println();                 //Empty row for easier reading


        Rectangle rectangle = new Rectangle();

        rectangle.setSideA(15);
        rectangle.setSideB(10);
        rectangle.shapeArea();
        rectangle.shapePerimeter();

        System.out.println();                 //Empty row for easier reading

        Square square = new Square();

        square.setSquareSide(5);
        square.shapeArea();
        square.shapePerimeter();

        System.out.println();                 //Empty row for easier reading

        Triangle triangle = new Triangle();
        triangle.setHeight(7);
        triangle.setSide1Base(4);
        triangle.setSide2(5);
        triangle.setSide3(6);
        triangle.shapeArea();
        triangle.shapePerimeter();


    }
}
