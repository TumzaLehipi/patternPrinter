// Student No: 26122197
package patternprinter;

import java.util.Scanner;
public class PatternPrinter{

    public PatternPrinter() {
        
       
    }
    public void choices()
    {
        
        System.out.println("This program output you desired shape depending"
                + "\non the choice you make."
                + "\n_________________________________________"
                + "\ntype the number (0-5) if you want to print that shape."
                + "\n1. Circle."
                + "\n2. Square." 
                + "\n3. Triangle."
                + "\n4. Rectangle."
                + "\n5. Print all shapes at once."
                + "\n_________________________________________"
                + "\nType a number.");
  
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
       
       PatternPrinter patterns = new PatternPrinter();
       CirclePattern circle = new CirclePattern();
       RectanglePattern rectangle = new RectanglePattern();
       SquarePattern square = new SquarePattern();
       TrianglePattern triangle = new TrianglePattern();
       patterns.choices();
       int optionNumber;
       optionNumber = input.nextInt();
       
       switch(optionNumber)
       {
           case 1:
           {    
               int radius;
               System.out.println("Enter the radius of a circle:");
               radius = input.nextInt();
               circle.setCircleRadius(radius);
               circle.drawCircle();
               System.out.println();
               break;
           }
           case 2:
           {
               int squareSiz;
               System.out.println("Enter the size of a square:");
               squareSiz= input.nextInt();
               
               square.setSquareSize(squareSiz);
                square.drawSquare();
                break;
           }
           case 3:
           {
               int triangleSiz;
                  System.out.println("Enter the size of a triangle:");
               triangleSiz= input.nextInt();
               triangle.setTriangleSize(triangleSiz);
               triangle.drawTriangle();
               System.out.println();
               break;
           }
           case 4:
           {
               int rectangleSize;
               System.out.println("Enter the size of a rectangle:");
               rectangleSize= input.nextInt();
               rectangle.setRectangleSize(rectangleSize);
               rectangle.drawRectangle();
               System.out.println();
               break;
           }
           case 5:
           {
                System.out.println("Enter the radius of a circle:");
           int radius = input.nextInt();
               
               circle.setCircleRadius(radius);
               
               int squareSiz;
               System.out.println("Enter the size of a square:");
               squareSiz= input.nextInt();
               
               square.setSquareSize(squareSiz);
             
              int triangleSiz;
                  System.out.println("Enter the size of a triangle:");
               triangleSiz= input.nextInt();
            
               triangle.setTriangleSize(triangleSiz);
               
                int rectangleSize;
               System.out.println("Enter the size of a rectangle:");
               rectangleSize= input.nextInt();
               rectangle.setRectangleSize(rectangleSize);
              
               System.out.println("\nCircle\n");
               circle.drawCircle();
               System.out.print("\nSquare\n");
               square.drawSquare();
               System.out.println("\nTriangle\n");
               triangle.drawTriangle();
               System.out.println("\nRectangle\n");
               rectangle.drawRectangle();
           }     
       }
    }
}





