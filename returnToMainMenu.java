import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class returnToMainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class returnToMainMenu extends Actor
{
    /**
     * Act - do whatever the returnToMainMenu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public returnToMainMenu(){
        setImage(new GreenfootImage(" MAIN MENU ", 30, Color.BLACK, Color.RED));
    }
    public void act() 
    {
        menu();
    }    
    
    public void menu(){
        if(Greenfoot.mouseClicked(this)){ 
               Greenfoot.setWorld(new MainMenu());         
          }
    }
}
