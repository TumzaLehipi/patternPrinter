// Student No: 26122197
package patternprinter;
public class TrianglePattern {
    
     private int triangleSize;
    
    public TrianglePattern() {
        
        triangleSize = 0;
        
    }
    public int getTriangleSize() {
        return triangleSize;
    }
    public void setTriangleSize(int triangleSize) {
        this.triangleSize = triangleSize;
    }
   public void drawTriangle()
{
    int count, counter;
    int numberOfBlanks =triangleSize;
    for(counter = 1; counter<= triangleSize; counter++)
    {
       for(count = 1; count <= numberOfBlanks; count++)
        {
             System.out.print(" ");
        }
       for (count = 1; count <= counter; count++)
         {
             System.out.print(" *");    
         }
       System.out.println();
    numberOfBlanks--;
    } 
}
    
}
