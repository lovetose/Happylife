import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bullet extends Actor
{
   public void act()  
   {  
       move(15);
       checkBoundaries();
    }
    
   public void checkBoundaries() {
       if(getX() > getWorld().getWidth() - 3)
            getWorld().removeObject(this);
            else if(getX() < 3)
            getWorld().removeObject(this);
            else if(getY() > getWorld().getHeight() - 3)
            getWorld().removeObject(this);
            else if(getY() < 3)
            getWorld().removeObject(this);     
   }
}
