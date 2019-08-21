// Student No: 26122197
package patternprinter;
public class CirclePattern {
    
    private int circleRadius;
    
    public CirclePattern()
    {
        circleRadius = 0;
        
    }
    public int getCircleRadius() {
        return circleRadius;
    }

    public void setCircleRadius(int circleRadius) {
        this.circleRadius = circleRadius;
    }
    
    public void drawCircle(){
        
        int circleDiameter = 2 * circleRadius + 1;
        int x,y;            //coordinates
        
      int  i = 0;
      
      do{
          int j = 0;
          {
          do{
              x = i-circleRadius;
              y = j-circleRadius;
              
              if(x*x+y*y <= circleRadius*circleRadius+1)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print(" ");
                    System.out.print(" ");
                }
                j++;
          }while(j<circleDiameter);
        }
      System.out.println(" "); 
             i++;      
      }while(i <circleDiameter); 
    }
}
