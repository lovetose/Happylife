import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MainMenu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{
    
    GreenfootSound backgroundMusic = new GreenfootSound("Animal Crossing Title Screen.mp3");
    /**
     * Constructor for objects of class MainMenu.
     * 
     */
    public MainMenu()
    {    
        super(900, 650, 1); 
        addObject(new StartButton(), getWidth()/2, getHeight()/2);
        addObject(new Instruction(), 443, 499);
    }
   
    public void haha(){
        
    }
    }

