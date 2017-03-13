import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


import java.awt.Color;
import java.awt.Graphics;

/**
 * Write a description of class Score here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Counter extends Actor
{
    /**
     * Act - do whatever the Score wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private static final Color textColor = new Color(29, 234, 59);
    
    public static int value;
    private static int target = 0;
    private String text;
    private int stringLength;
    
    public static int levelDelay;
    
    public Counter()
    {
        this("");
    }
    
    public Counter(String prefix)
    {
        text = prefix;
        stringLength = (text.length() + 2) * 10;
        
        setImage(new GreenfootImage(stringLength, 16));
        GreenfootImage image = getImage();
        image.setColor(textColor);
        
        value = 0;
        target = 0;
        levelDelay = 0;
        updateImage();
    }
    
    public void act() {
        updateImage();
        levelDelay++;
    }
         
     public static void add(int score)
    {
        value += score;
    }
    
     public int getValue()
    {
        return target;
    }

        private void updateImage()
    {
        GreenfootImage image = getImage();
        image.clear();
        image.drawString(text + value, 1, 12);
    }
    
       public void setValue(int newValue)  
    {  
        target = newValue;  
        value = newValue;  
        updateImage();  
    }  
}
    
