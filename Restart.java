import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Restart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restart extends Actor
{
    World world = getWorld();
    
    /**
     * Act - do whatever the Restart wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Restart(){
        setImage(new GreenfootImage(" RESTART ", 30, Color.BLACK, Color.RED));
    }
    public void act() 
    {
        restart();
    }    
    
    public void restart(){
        if(Greenfoot.mouseClicked(this)){ 
            if(this.getWorld().getClass() == EasyWorld.class){
                Greenfoot.setWorld(new EasyWorld());
            }
            else if(this.getWorld().getClass() == MediumWorld.class){
                Greenfoot.setWorld(new MediumWorld());
            }
            else if(this.getWorld().getClass() == HardWorld.class){
                Greenfoot.setWorld(new HardWorld());
            }
        }           
        }    
    }

