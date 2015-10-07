import greenfoot.*;

/**
 * Write a description of class RangedMinion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class RangedMinion extends NPCS
{
    private double frame = 1;
    
    public void act() 
    {
    }
    public void moveUp(GreenfootImage up1, GreenfootImage up2, GreenfootImage up3)
    {
        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 2);
            //Put rotation within if statements instead of here for smoother animation
            if (frame == 1)
            {
                setImage(up1);
                setRotation(0);
            }
            else if (frame == 3)
            {
                setImage(up2);
                setRotation(0);
            }
            else if (frame == 5)
            {
                setRotation(0);
                setImage(up3);
            }
            else if (frame ==7)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
    }
    public void moveDown(GreenfootImage down1, GreenfootImage down2, GreenfootImage down3)
    {
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 2);
            //Put rotation within if statements instead of here for smoother animation
            if (frame == 1)
            {
                setRotation(180);
                setImage(down1);
            }
            else if (frame == 3)
            {
                setRotation(180);
                setImage(down2);
            }
            else if (frame == 5)
            {
                setRotation(180);
                setImage(down3);
            }
            else if (frame ==7)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
    }
    public void moveLeft(GreenfootImage left1, GreenfootImage left2, GreenfootImage left3)
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 2, getY());
            //Put rotation within if statements instead of here for smoother animation
            if (frame == 1)
            {
                setRotation(-90);
                setImage(left1);
            }
            else if (frame == 3)
            {
                setRotation(-90);
                setImage(left2);
            }
            else if (frame == 5)
            {
                setRotation(-90);
                setImage(left3);
            }
            else if (frame ==7)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
    }
    public void moveRight(GreenfootImage right1, GreenfootImage right2, GreenfootImage right3)
    {
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 2, getY());
            //Put rotation within if statements instead of here for smoother animation
            if (frame == 1)
            {
                setImage(right1);
                setRotation(90);
            }
            else if (frame == 3)
            {
                setImage(right2);
                setRotation(90);
            }
            else if (frame == 5)
            {
                setRotation(90);
                setImage(right3);
            }
            else if (frame ==7)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
    }
}
