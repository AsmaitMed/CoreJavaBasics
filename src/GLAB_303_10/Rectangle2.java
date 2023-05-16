package GLAB_303_10;

public class Rectangle2 extends FinalShape implements Movable {

        private double length, width;   // x and y coordinates of the point


        /** Constructs a MovablePoint instance at the given x and y */
    public Rectangle2(double length, double width) {
            this.length = length;
            this.width = width;

        }

        @Override
        public double getArea() {
            //double area = l*w;
            double area = length * width; // initializing value in parent class variable
            return area; //reference to  parent class variable
        }
        @Override
        public void displayshapName() {
            System.out.println("Drawing a Rectangle of length " + this.length + " and width " + this.width);
        }
        /** Returns a self-descriptive string */
        @Override
        public String toString() {
            return "Rectangle[ length = " + length + super.toString() +  "] " + " Rectangle [ width = " + width + super.toString() + "]";
        }

        public String getCoordinate()
        {
            return  "(" + length + "," + width + ")";
        }

        // Need to implement all the abstract methods defined in the interface Movable
        @Override
        public void moveUp() {
            length--;
        }
        @Override
        public void moveDown() {
            length++;
        }
        @Override
        public void moveLeft() {
            width--;
        }
        @Override
        public void moveRight() {
            width++;
        }
    }
