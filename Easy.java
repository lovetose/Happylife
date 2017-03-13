import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Easy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Easy extends Actor
{
    /**
     * Act - do whatever the Easy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        selectWorld();
    }    
    
    public void selectWorld(){
        if(Greenfoot.mouseClicked(this)){  
            Greenfoot.setWorld(new EasyWorld());
            
        }    
    }
}
