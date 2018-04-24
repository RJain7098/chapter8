import javax.swing.JApplet;
import java.awt.*;

public class recursiveTriangle18 extends JApplet
{
   private final int APPLET_WIDTH = 800;
   private final int APPLET_HEIGHT = 800;

/*
   //x is accross and y is down
   point 1 - Right  A x[0],y[0] (720,600)
   point 2 - Left   B x[1],y[1]
   point 3 - Top    C x[2],y[2]
   point 4 draws back to point 1 to complete triangle

*/  private int[] xPos = {720, 80, 400, 720};
    private int[] yPos = {600, 600, 40, 600};


   //-----------------------------------------------------------------
   //  Sets up the basic applet environment.
   //-----------------------------------------------------------------
   public void init()
   {
      setBackground (Color.white);
      setSize (APPLET_WIDTH, APPLET_HEIGHT);
   }

   //-----------------------------------------------------------------
   //  Draws a rocket using polygons and polylines.
   //-----------------------------------------------------------------
   public void paint (Graphics page)        
   {
        
        page.setColor (Color.red);
        page.drawPolyline (xPos, yPos, xPos.length);

        Triangle(xPos,yPos,page);

   }//end of paint

   public void Triangle(int[] xPos, int[] yPos, Graphics page)
   {
       int x1 = xPos[0];
       int y1 = yPos[0];
       int x2 = xPos[1];
       int y2 = yPos[1];
       int x3 = xPos[2];
       int y3 = yPos[2];
       
       double distance = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
       System.out.println(distance);
       
       if (distance > 10)
       {
           int midx1 = (x1+x2)/2;
           int midy1 = (y1+y2)/2;
           
           int midx2 = (x2+x3)/2;
           int midy2 = (y2+y3)/2;
           
           int midx3 = (x3+x1)/2;
           int midy3 = (y3+y1)/2;
           
           int[] xNew = {midx1, midx2, midx3, midx1};
           int[] yNew = {midy1, midy2, midy3, midy1};
           
           page.drawPolyline(xNew, yNew, xNew.length);
           
           int[] xNew1 = {x1, midx1, midx3, x1};
           int[] yNew1 = {y1, midy1, midy3, y1};
           
           Triangle(xNew1, yNew1, page);
           
           int[] xNew2 = {midx1, x2, midx2, midx1};
           int[] yNew2 = {midy1, y2, midy2, midy2};
           
           Triangle(xNew2, yNew2, page);
           
           int[] xNew3 = {midx3, midx2, x3, midx3};
           int[] yNew3 = {midy3, midy2, y3, midy3};
           
           Triangle(xNew3, yNew3, page);

       }
       
       
       
       
       
       //Find the distance between 2 points ex. - x,y & x1,y1


        //if the segment/distance is 30 or so, good length to stop, this is the BASE CASE.
        //distance between the two points is the base case 
        //{
            //find the mid points of each line segment


            //make the x and y array (3 points + first point to finish triangle)


            //draw the Triangle
            //page.drawPolyline (xNew, yNew, xNew.length);

            //create x,y Array using the midpoints you calculated
            //example




            // Recursive calls for EACH section of triangle



        //}



   }//end of Triangle
}
