import greenfoot.*;

/**
 * Write a description of class TemporarySoundClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TemporarySoundClass extends Actor
{
    private Counter counter;
    private double virtualTime = 0;
    private boolean isThemeSong = false;
    private boolean isThemeSong2 = false;
    /**
     * Act - do whatever the TemporarySoundClass wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        virtualTime+= 0.01602;
        if (isThemeSong == false && virtualTime >= 25)
        {
            isThemeSong = true;
            Greenfoot.playSound("Fable Theme.mp3");
        }
        /*
        if (isThemeSong2 == false && virtualTime >= 10)
        {
            isThemeSong = true;
            Greenfoot.playSound("Prelude To War.mp3");
        }
        */
    }    
}