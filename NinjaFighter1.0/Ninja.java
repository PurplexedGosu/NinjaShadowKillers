import greenfoot.*;

/**
 * Write a description of class Ninja here.
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ninja extends Heroes
{
    public Ninja()
    {
        //super(new Counter counter1);
        
    }
    public void act() 
    {
        move(2);
        hitLightning();
        shootShuriken();
    }    
    // Melee Attack
    public void hitLightning()
    {
        if (useF() == true)
        {
            Lightning l1 = new Lightning();
            getWorld().addObject(l1, getX(), getY());
            l1.setRotation(getRotation() -90);
        }
    }
    // Ranged Attack
    public void shootShuriken()
    {
        if (useSpacebar() == true)
        {
            Shuriken s1 = new Shuriken();
            getWorld().addObject(s1, getX(), getY());
            s1.setRotation(getRotation() -90);
        }
    }
}
