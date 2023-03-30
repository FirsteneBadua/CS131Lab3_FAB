package arraylist;
public class PointThreeD {
   private double xPoint;
   private double yPoint;
   private double zPoint;

   public PointThreeD() {
      xPoint = 0;
      yPoint = 0;
      zPoint = 0;
   }

   public PointThreeD(double x, double y, double z) {
      xPoint = x;
      yPoint = y;
      zPoint = z;
   }

   public String toString() {
      return "PointThreeD with coordinates (" + xPoint + ", " + yPoint + ", " + zPoint + ")";
   }
}