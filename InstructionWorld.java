import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class InstructionWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InstructionWorld extends World
{

    /**
     * Constructor for objects of class InstructionWorld.
     * 
     */
    public InstructionWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1);
        showText("Survive as long as you can by Pressing W and S to move", getWidth()/2, getHeight()/2);
        showText("foward and backward respectively and shoot by pressing left click", getWidth()/2, 400);
        
        addObject(new returnToMainMenu(), getWidth()/2, 450);
    }
}
