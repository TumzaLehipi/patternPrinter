// Student No: 26122197
package patternprinter;
public class RectanglePattern {
    
    private int rectangleSize;

    public RectanglePattern() {       
        rectangleSize = 0;
    }
    public int getRectangleSize() {
        return rectangleSize;
    }
    public void setRectangleSize(int rectangleSize) {
        this.rectangleSize = rectangleSize;
    }
    public void drawRectangle()
    {
        for(int i = 0; i < rectangleSize; i++)
        {
            for(int j = 0; j<=rectangleSize/2; j++)
            {
                System.out.print("* ");
            }
        
         System.out.println();
        }
    }
    
}
