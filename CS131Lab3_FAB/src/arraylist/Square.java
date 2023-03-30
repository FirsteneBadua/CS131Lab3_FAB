package arraylist;
public class Square {
   private double side;

   public Square() {
      side = 0;
   }

   public Square(double s) {
      side = s;
   }

   public double getArea() {
      return side * side;
   }

   public String toString() {
      return "Square with side " + side;
   }
}