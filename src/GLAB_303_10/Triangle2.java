package GLAB_303_10;

public class Triangle2 extends FinalShape implements Movable {
        protected float base, height;

        /** Constructs a MovablePoint instance at the given x and y */
    public Triangle2(float base, float height) {
            this.base = base;
            this.height = height;

        }

        @Override
        public double getArea() {
            //double area = 1/2 * (b*h)
            double area = (base * height)/2; // initializing value in parent class variable
            return area; //reference to  parent class variable
        }
        @Override
        public void displayshapName() {
            System.out.println("Drawing a Triangle of base " + this.base + " and height " + this.height);
        }
        /** Returns a self-descriptive string */
        @Override
        public String toString() {
            return "Triangle[ base = " + base + super.toString() +  "] " + "Triangle[ height = " + height + super.toString() + "]";
        }

        public String getCoordinate()
        {
            return  "(" + base + "," + height + ")";
        }

        // Need to implement all the abstract methods defined in the interface Movable
        @Override
        public void moveUp() {
            base--;
        }
        @Override
        public void moveDown() {
            base++;
        }
        @Override
        public void moveLeft() {
            height--;
        }
        @Override
        public void moveRight() {
            height++;
        }
    }
