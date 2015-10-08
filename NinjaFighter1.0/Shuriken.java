import greenfoot.*; 

/**
 * Write a description of class Shuriken here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Shuriken extends Projectiles
{
    public void act() 
    {
        Actor NPCS = getOneIntersectingObject(NPCS.class);
            if (NPCS!=null){
                getWorld().removeObject(NPCS);
                getWorld().removeObject(this);
            }
            else if (atWorldEdge())
            getWorld().removeObject(this);
         move(3);
    }    
}
