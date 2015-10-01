import greenfoot.*;

/**
 * Write a description of class Heroes here.
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heroes extends Actor
{
    public int health = 100;
    public int ammo = 25;
    public int energy = 100;
    private Counter counter1;
    
    private GreenfootImage up1 = new GreenfootImage("Ninja/Ninja Up/ninja_sprites_up_stance_left_step2.png");
    private GreenfootImage up2 = new GreenfootImage("Ninja/Ninja Up/ninja_sprites_up_stance_right_step2.png");
    
    private GreenfootImage down1 = new GreenfootImage("Ninja/Ninja Down/ninja_sprites_down_stance_left_step2.png");
    private GreenfootImage down2 = new GreenfootImage("Ninja/Ninja Down/ninja_sprites_down_stance_right_step2.png");
    
    private GreenfootImage left1 = new GreenfootImage("Ninja/Ninja Left/ninja_sprites_left_stance_left_step2.png");
    private GreenfootImage left2 = new GreenfootImage("Ninja/Ninja Left/ninja_sprites_left_stance2.png");
    //private GreenfootImage left2 = new GreenfootImage("Ninja/Ninja Left/ninja_sprites_left_stance_right_step2.png");
    
    private GreenfootImage right1 = new GreenfootImage("Ninja/Ninja Right/ninja_sprites_right_stance_left_step2.png");
    private GreenfootImage right2 = new GreenfootImage("Ninja/Ninja Right/ninja_sprites_right_stance2.png");
    //private GreenfootImage right2 = new GreenfootImage("Ninja/Ninja Right/ninja_sprites_right_stance_right_step2.png");
    
    private double frame = 1;
    public Heroes(/*Counter healthCounter*/)
    {
         //counter1 = healthCounter;
    }
    
    // Heroes Move
    public void move(int speedMultiplier)
    {
        if (Greenfoot.isKeyDown("a"))
        {
            setLocation(getX() - 1*speedMultiplier, getY());
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
            else if (frame ==5)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
        if (Greenfoot.isKeyDown("d"))
        {
            setLocation(getX() + 1*speedMultiplier, getY());
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
            else if (frame ==5)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }

        if (Greenfoot.isKeyDown("w"))
        {
            setLocation(getX(), getY() - 1*speedMultiplier);
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
            else if (frame ==5)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
        if (Greenfoot.isKeyDown("s"))
        {
            setLocation(getX(), getY() + 1*speedMultiplier);
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
            else if (frame ==5)
             {
                frame = 1;
                return;
            }
            frame+=0.25;
        }
  }
  /*
    public boolean minionCollision()
    {
        Actor minion;
        minion = getOneObjectAtOffset(0,0,Minion.class);
        if (minion != 
    }
    */
  
  
    //Melee Attack
    public boolean useF()
    {
        return (Greenfoot.isKeyDown("f"));
    }
    
    //Ranged Attack
    public boolean useSpacebar()
    {
        return ("space".equals(Greenfoot.getKey()));
    }
    
    public void act()
    {
        
    }    
}
