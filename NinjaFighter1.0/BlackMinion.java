import greenfoot.*;

/**
 * Write a description of class Minion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BlackMinion extends NPCS
{
    // Sprites taken from http://www.rpgmakervxace.net/topic/2399-grannys-lists-animal-sprites/
    private GreenfootImage up1 = new GreenfootImage("BlackDragon/BlackDragon Up/BlackDragon_Up_Left.png");
    private GreenfootImage up2 = new GreenfootImage("BlackDragon/BlackDragon Up/BlackDragon_Up_Right.png");
    private GreenfootImage up3 = new GreenfootImage("BlackDragon/BlackDragon Up/BlackDragon_Up_Center.png");
    
    private GreenfootImage down1 = new GreenfootImage("BlackDragon/BlackDragon Down/BlackDragon_Down_Left.png");
    private GreenfootImage down2 = new GreenfootImage("BlackDragon/BlackDragon Down/BlackDragon_Down_Center.png");
    private GreenfootImage down3 = new GreenfootImage("BlackDragon/BlackDragon Down/BlackDragon_Down_Right.png");
    
    private GreenfootImage left1 = new GreenfootImage("BlackDragon/BlackDragon Left/BlackDragon_Left_Left.png");
    private GreenfootImage left2 = new GreenfootImage("BlackDragon/BlackDragon Left/BlackDragon_Left_Center.png");
    private GreenfootImage left3 = new GreenfootImage("BlackDragon/BlackDragon Left/BlackDragon_Left_Right.png");
    
    private GreenfootImage right1 = new GreenfootImage("BlackDragon/BlackDragon Right/BlackDragon_Right_Left.png");
    private GreenfootImage right2 = new GreenfootImage("BlackDragon/BlackDragon Right/BlackDragon_Right_Center.png");
    private GreenfootImage right3 = new GreenfootImage("BlackDragon/BlackDragon Right/BlackDragon_Right_Right.png");
    
    private double frame = 1;
    public void act() 
    {
        move();
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
