package GLAB_303_10;



public abstract class FinalShape {
    protected String color;
    protected float height;  // To hold height.
    protected double width;  //To hold width
    protected float base;  //To  hold base

    public void setColor(String color) {
        this.color = color;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public void setBase(float base) {
        this.base = base;
    }

// The getArea method is abstract.
    // It must be overridden in a subclass.
    /** All shapes must provide a method called getArea() */
    public abstract double getArea();
    /** Returns a self-descriptive string */

    public String toString() {
        return "Shape[color=" + color + "]";
    }

    public void displayshapName()
    {
        System.out.println("I am a Shape.");
    }
}
 class Circle2 extends FinalShape implements Movable {
    protected double radius;
    private int x, y;   // x and y coordinates of the point
    private final double PI = Math.PI;

    /** Constructs a MovablePoint instance at the given x and y */
    public Circle2(int x, int y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public Circle2(double radius) {
        this.radius = radius;
    }

    public Circle2(double radius, float height) {
        this.radius = radius;
        super.height = height;
    }
    @Override
    public double getArea() {
        //double area = PI * this.radius * this.radius;
        double area = PI * Math.pow(this.radius, 2); // initializing value in parent class variable
        return area; //reference to  parent class variable
    }
    @Override
    public void displayshapName() {
        System.out.println("Drawing a Circle of radius " + this.radius);
    }
    /** Returns a self-descriptive string */
    @Override
    public String toString() {
        return "Circle[ radius = " + radius + super.toString() +  "] ";
    }

    public String getCoordinate()
    {
        return  "(" + x + "," + y + ")";
    }

    // Need to implement all the abstract methods defined in the interface Movable
    @Override
    public void moveUp() {
        y--;
    }
    @Override
    public void moveDown() {
        y++;
    }
    @Override
    public void moveLeft() {
        x--;
    }
    @Override
    public void moveRight() {
        x++;
    }
}
 class myRunner2 {
    public static void main(String[] args) {

        Circle2 c1 = new Circle2(1, 2, 2);
        System.out.println("Area of Circle " + c1.getArea());
        System.out.println("Coordinates are " + c1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + c1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + c1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + c1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + c1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable c2 = new Circle2(5, 10, 200);  // upcast
        c2.moveUp();
        System.out.println("After move up , Coordinates are " + c2.getCoordinate());

        c2.moveLeft();
        System.out.println("After move Left , Coordinates are " + c2.getCoordinate());

        Rectangle2 r1 = new Rectangle2(15, 10);
        System.out.println("Area of Rectangle " + r1.getArea());
        System.out.println("Coordinates are " + r1.getCoordinate());

        r1.moveDown();
        System.out.println("After move Down, Coordinates are " + r1.getCoordinate());

        r1.moveRight();
        System.out.println("After move right, Coordinates are " + r1.getCoordinate());

        r1.moveUp();
        System.out.println("After move Up, Coordinates are " + r1.getCoordinate());

        r1.moveLeft();
        System.out.println("After move left, Coordinates are " + r1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable r2 = new Rectangle2(15, 10);  // upcast
        r2.moveUp();
        System.out.println("After move up , Coordinates are " + r2.getCoordinate());

        r2.moveLeft();
        System.out.println("After move Left , Coordinates are " + r2.getCoordinate());


        Triangle2 t1 = new Triangle2(5, 12);
        System.out.println("Area of Triangle " + t1.getArea());
        System.out.println("Coordinates are " + t1.getCoordinate());

        c1.moveDown();
        System.out.println("After move Down, Coordinates are " + t1.getCoordinate());

        c1.moveRight();
        System.out.println("After move right, Coordinates are " + t1.getCoordinate());

        c1.moveUp();
        System.out.println("After move Up, Coordinates are " + t1.getCoordinate());

        c1.moveLeft();
        System.out.println("After move left, Coordinates are " + t1.getCoordinate());


        System.out.println("--------Test Polymorphism-------");
        Movable t2 = new Triangle2(5, 12);  // upcast
        t2.moveUp();
        System.out.println("After move up , Coordinates are " + t2.getCoordinate());

        t2.moveLeft();
        System.out.println("After move Left , Coordinates are " + t2.getCoordinate());
    }
}




