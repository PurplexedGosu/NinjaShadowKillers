import greenfoot.*;
import java.lang.Math;


/**
 * Write a description of class Shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuriken extends Projectiles
{
    double horizontalWorldMultiplier = 0.75;
    double verticalWorldMultiplier = 0.75;
    int horizontal;
    int vertical;
    int godModes = 200;
    int x = 0;
    /**
     * Act - do whatever the Shuriken wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void act() 
    {
      // if (Greenfoot.mouseClicked(true))
            x++;
            MouseInfo mouse = Greenfoot.getMouseInfo();
            
            if (mouse != null && godModes >=1)
            {
                //turnTowards(mouse.getX(), mouse.getY());
                /*
                if(mouse.getX() < getX())
                {
                    horizontal = -5;
                    vertical = 0;
                    setLocation((int)(getX() + horizontal*horizontalWorldMultiplier) , (int)(getY() + vertical*verticalWorldMultiplier));
                    turn(3);
                    godModes--;
                }
                else if (mouse.getX() > getX())
                {
                    horizontal = 5;
                    vertical = 0;
                    setLocation((int)(getX() + horizontal*horizontalWorldMultiplier) , (int)(getY() + vertical*verticalWorldMultiplier));
                    turn(3);
                    godModes--;
                }
                else if (mouse.getY() > getY())
                {
                    vertical = 5;
                    horizontal = 0;
                    setLocation((int)(getX() + horizontal*horizontalWorldMultiplier) , (int)(getY() + vertical*verticalWorldMultiplier));
                    turn(3);
                    godModes--;
                }
                else if (mouse.getY() < getY())
                {
                    vertical = 5;
                    horizontal = 0;
                    setLocation((int)(getX() + horizontal*horizontalWorldMultiplier) , (int)(getY() + vertical*verticalWorldMultiplier));
                    turn(3);
                    godModes--;
                }
                */
            }
            
           //move();

        
         move(3);
         //setRotation(x);
        
       //turn(5);
    }    
    
}
