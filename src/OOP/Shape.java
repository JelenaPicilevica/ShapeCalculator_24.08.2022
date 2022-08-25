package OOP;

public abstract class Shape {

    String shapeName;

    public Shape() {
    }

    public Shape (String shapeName){
        this.shapeName = shapeName;
    }

    public abstract void shapeArea();
    public abstract void shapePerimeter();


}

