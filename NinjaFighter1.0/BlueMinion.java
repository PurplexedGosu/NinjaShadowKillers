import greenfoot.*;

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlueMinion extends NPCS
{
    // Sprites taken from http://www.rpgmakervxace.net/topic/2399-grannys-lists-animal-sprites/
    private GreenfootImage up1 = new GreenfootImage("BlueDragon/BlueDragon Up/Dragon_Up_Left2.png");
    private GreenfootImage up2 = new GreenfootImage("BlueDragon/BlueDragon Up/Dragon_Up_Center2.png");
    private GreenfootImage up3 = new GreenfootImage("BlueDragon/BlueDragon Up/Dragon_Up_Right2.png");
    
    private GreenfootImage down1 = new GreenfootImage("BlueDragon/BlueDragon Down/Dragon_Down_Left2.png");
    private GreenfootImage down2 = new GreenfootImage("BlueDragon/BlueDragon Down/Dragon_Down_Center2.png");
    private GreenfootImage down3 = new GreenfootImage("BlueDragon/BlueDragon Down/Dragon_Down_Right2.png");
    
    private GreenfootImage left1 = new GreenfootImage("BlueDragon/BlueDragon Left/Dragon_Left_Left2.png");
    private GreenfootImage left2 = new GreenfootImage("BlueDragon/BlueDragon Left/Dragon_Left_Center2.png");
    private GreenfootImage left3 = new GreenfootImage("BlueDragon/BlueDragon Left/Dragon_Left_Right2.png");
    
    private GreenfootImage right1 = new GreenfootImage("BlueDragon/BlueDragon Right/Dragon_Right_Left2.png");
    private GreenfootImage right2 = new GreenfootImage("BlueDragon/BlueDragon Right/Dragon_Right_Center2.png");
    private GreenfootImage right3 = new GreenfootImage("BlueDragon/BlueDragon Right/Dragon_Right_Right2.png");
    
    private double frame = 1;
    public void act() 
    {
        move();
    }    
    
    public void moveUp()
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
    public void moveDown()
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
    public void moveLeft()
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
    public void moveRight()
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
    public void move()
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
}
