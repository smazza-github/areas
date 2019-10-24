import java.util.Scanner;

public class areas {
    public static void main(String[] args) {
     Scanner in = new Scanner(System.in);

     String rectangle = "rectangle";
     String circle = "circle";
     String square = "square";
     String triangle = "triangle";

     System.out.print("\nEnter a shape: ");
     String shape = in.nextLine();

     if (shape.equals(rectangle)){
       System.out.print("Enter length: ");
       double rectlength = in.nextDouble();
       System.out.print("Enter width: ");
       double rectwidth = in.nextDouble();

       double rectarea = rectlength * rectwidth;
       System.out.print("\nArea: "+ rectarea);

     } else if (shape.equals(circle)) {
       System.out.print("Enter radius: ");
       double radius = in.nextDouble();

       double circarea = ((radius * radius) * 3.14);
       System.out.print("\nArea: "+ circarea);

     } else if (shape.equals(square)) {
       System.out.print("Enter length: ");
       double squalength = in.nextDouble();
       System.out.print("Enter width: ");
       double squawidth = in.nextDouble();

       double squaarea = squawidth * squalength;
       System.out.print("\nArea: "+ squaarea);
  }
 }
}
