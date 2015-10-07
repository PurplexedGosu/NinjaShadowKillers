import greenfoot.*;

/**
 * Write a description of class Ninja here.
 * @author (your name) 
 * @version (a version number or a date)
 */

public class Ninja extends Heroes
{
    static int speedMultiplier = 2;
    private GreenfootImage up1 = new GreenfootImage("Ninja/Ninja Up/ninja_sprites_up_stance_left_step2.png");
    private GreenfootImage up2 = new GreenfootImage("Ninja/Ninja Up/ninja_sprites_up_stance_right_step2.png");
    
    private GreenfootImage down1 = new GreenfootImage("Ninja/Ninja Down/ninja_sprites_down_stance_left_step2.png");
    private GreenfootImage down2 = new GreenfootImage("Ninja/Ninja Down/ninja_sprites_down_stance_right_step2.png");
    
    private GreenfootImage left1 = new GreenfootImage("Ninja/Ninja Left/ninja_sprites_left_stance_left_step2.png");
    private GreenfootImage left2 = new GreenfootImage("Ninja/Ninja Left/ninja_sprites_left_stance2.png");
    
    private GreenfootImage right1 = new GreenfootImage("Ninja/Ninja Right/ninja_sprites_right_stance_left_step2.png");
    private GreenfootImage right2 = new GreenfootImage("Ninja/Ninja Right/ninja_sprites_right_stance2.png");
    public Ninja()
    {
        
    }
    public void act() 
    {
        moveUp(speedMultiplier, up1, up2);
        moveDown(speedMultiplier, down1, down2);
        moveLeft(speedMultiplier, left1, left2);
        moveRight(speedMultiplier, right1, right2);
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
