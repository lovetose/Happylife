import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Spider here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Spider wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        followHuman();
        kill();
        die();
        move(3);
    }
    
        public void followHuman()
    
{
    int dist = 1000;
    Actor closest = null;
    if(!getObjectsInRange(dist, ButterFly.class).isEmpty())
    {
        for (Object obj: getObjectsInRange(dist, ButterFly.class))
        {
            Actor guy = (Actor) obj;
            int guyDist = (int) Math.hypot(guy.getX() - getX(), guy.getY() - getY());
            if (closest == null || guyDist< dist)
            {
                closest = guy;
                dist = guyDist;
            }
        }
        turnTowards(closest.getX(),closest.getY());
        
        
        
       
       
    }
    
}

public void kill()
    {
        Actor Butterfly;
       Butterfly = getOneObjectAtOffset(0,0, ButterFly.class);
        
        if (Butterfly != null)
        {
            World world;
            world = getWorld();
            world.removeObject(Butterfly);
        }
        
        
    }
    
    public void die()
    {
       Actor bullet = getOneIntersectingObject(Bullet.class);      
       if(bullet != null) {  
            getWorld().removeObject(this);
            Counter.add(10);
            killCounter.add(1);
       }  
    }
}
