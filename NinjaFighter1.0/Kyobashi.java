import greenfoot.*;

/**
 * The world of Tristam
 * @author Sean Wallace
 * @version (a version number or a date)
 */
public class Kyobashi extends World
{
    //Constructor for objects of class Kyobashi
    public Kyobashi()
    {    
        super(750, 750, 1); 
        createWorld();

        prepare();
    }

    public void createWorld()
    {
        //Creates the Ninja Hero
        Ninja n1;
        n1 = new Ninja();
        addObject(n1, 100,400);
        
        
    }

    /**
     * Prepare the world for the start of the program. That is: create the initial
     * objects and add them to the world.
     */
    private void prepare()
    {
        BlueRM blueRM = new BlueRM();
        addObject(blueRM, 623, 99);
        RedRM redRM = new RedRM();
        addObject(redRM, 619, 347);
        BlackRM blackRM = new BlackRM();
        addObject(blackRM, 614, 611);
    }
}
