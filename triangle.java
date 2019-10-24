import java.util.Scanner;

public class triangle {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     System.out.print("\nEnter base: ");
     double base = in.nextDouble();
     System.out.print("Enter height: ");
     double height = in.nextDouble();
     System.out.print("Enter hypotenuse: ");
     double hypotenuse = in.nextDouble();

     if (base < hypotenuse && height < hypotenuse) {
       System.out.println("\nYes, that's a right triangle!");

     } else {
       System.out.println("\nNope...not a right triangle.");
     }
 }
}
