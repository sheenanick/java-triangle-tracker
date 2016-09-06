import java.io.Console;

public class TriangleTracker {
  public static void main(String[] args) {
    Console console = System.console();
    System.out.println("Enter a number");
    Integer sideA = Integer.parseInt(console.readLine());
    System.out.println("Enter another number");
    Integer sideB = Integer.parseInt(console.readLine());
    System.out.println("Enter a third number");
    Integer sideC = Integer.parseInt(console.readLine());
    Triangle firstTriangle = new Triangle(sideA, sideB, sideC);

    Integer triangleType = firstTriangle.triangleTypeChecker();
    if( triangleType == 1){
      System.out.println("This is not a triangle");
    } else if ( triangleType == 2){
      System.out.println("This is an equilateral triangle");
    } else if ( triangleType == 3){
      System.out.println("This is an isosceles triangle");
    } else if ( triangleType == 4){
      System.out.println("This is a scalene triangle");
    }
  }
}
