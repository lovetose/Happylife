import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ButterFly extends Actor
{
    /**
     * Act - do whatever the Ant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int shotDelay = 0; 
    
       
    
    
    public void act() 
    {
       
        {  
            MouseInfo m = Greenfoot.getMouseInfo();  
            if(m != null)
            turnTowards(m);  
            if (Greenfoot.isKeyDown("w"))  
            move(-5);  
            if (Greenfoot.isKeyDown("s"))  
            move(4);
           
            
        } 
        checkShoot();
        
        turn(180);
    }    
    
    public void checkShoot()
    {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null)  
        if (shotDelay > 0)
            {
                shotDelay = shotDelay - 1;
            }
            else if(m.getButton() == 1)
            {
                shoot();
                shotDelay = 20;
            }
            
    } 
 
    
      public void shoot(){
        Bullet Bullet = new Bullet();
        getWorld().addObject(Bullet, getX(), getY());
        Bullet.setRotation(getRotation()-180);
    }

    public void turnTowards (int x, int y)  
    {  
       double dx = x - getX();  
       double dy = y - getY();  
       double angle = Math.atan2(dy,dx)*180.0/Math.PI;  
       setRotation( (int)angle-180 );  
    }  
  
    public void turnTowards (MouseInfo mi)  
    {  
        turnTowards(mi.getX(), mi.getY());  
    } 
    
}
