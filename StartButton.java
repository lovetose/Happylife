import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class StartButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class StartButton extends Actor
{
    /**
     * Act - do whatever the StartButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private String image1 = "diffdiag.jpg";
    
    public void act() 
    {
        addDifficulty();
    }    
    
    public void addDifficulty(){
        if(Greenfoot.mouseClicked(this)){         
            Difficulty AD = new Difficulty();          
            getWorld().addObject(AD, getX(), getY());
            Easy easy = new Easy();
            Medium medium = new Medium();
            Hard hard = new Hard();
            getWorld().addObject(easy, 450, 300);
            getWorld().addObject(medium, 450, 337);
            getWorld().addObject(hard, 450, 374);
            
            getWorld().removeObject(this); 
        }
    }
}
