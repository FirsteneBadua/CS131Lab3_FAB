package arraylist;

public class ListApp {
   public static void main(String[] args) {
      // ArrayList of Strings
      ArrayList<String> stringList = new ArrayList<String>();
      stringList.addItem("Hello");
      stringList.addItem("World");
      System.out.println(stringList.toString());

      // ArrayList of Squares
      ArrayList<Square> squareList = new ArrayList<Square>();
      squareList.addItem(new Square(5.0));
      squareList.addItem(new Square(3.0));
      System.out.println(squareList.toString());

      // ArrayList of PointThreeDs
      ArrayList<PointThreeD> pointList = new ArrayList<PointThreeD>();
      pointList.addItem(new PointThreeD(1.0, 2.0, 3.0));
      pointList.addItem(new PointThreeD(4.0, 5.0, 6.0));
      System.out.println(pointList.toString());
   }
}