import greenfoot.*;

/**
 * Write a description of class TemporarySoundClass here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

// This class was made to experiment with time
public class TemporarySoundClass extends Actor
{
    private Counter counter;
    private double virtualTime = 0;
    private boolean isThemeSong = false;
    private boolean isThemeSong2 = false;
    
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