// Student No: 26122197
package patternprinter;
public class SquarePattern {
     private int squareSize;
    public SquarePattern() {
        
        squareSize = 0;
    }
    public int getSquareSize() {
        return squareSize;
    }
    public void setSquareSize(int squareSize) {
        this.squareSize = squareSize;
    }
    public void drawSquare()
    {
        for(int i = 0; i < squareSize; i++)
        {
            for(int j = 0; j<squareSize; j++)
            {
                System.out.print(" * ");
            }
         System.out.println();
        }
    }
}
