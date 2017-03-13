import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;
/**
 * Write a description of class killCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class killBoard extends Actor
{
    /**
     * Act - do whatever the killCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    public static int kills;
    public String saying;
    
    private int rgb[] = {Greenfoot.getRandomNumber(255), Greenfoot.getRandomNumber(255), Greenfoot.getRandomNumber(255)};
    
    
       public killBoard()
    {
        this(100, "Game Over");
    }
    
    public void act() 
    {
        if(kills != killCounter.value)
        {
            kills = killCounter.value;
            makeImage(saying, "Kills: ", kills);
        }
        
        for(int i = 0; i < 3; i++)
        {
            if(rgb[i] <= 80)
            {
                rgb[i] = 0 - rgb[i];
            }
        }
    }    
    
     public killBoard(int kills, String saying)
    {
        kills = this.kills;
        this.saying = saying;
        makeImage(saying, "Kills: ", kills);
    }
    
     private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(0, 0, 0, 0));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(new Color(rgb[2], rgb[0], rgb[0]));
        image.drawString(title, 30, image.getHeight()/3);
        image.drawString(prefix + score, 30, image.getHeight()/3 * 2);
        setImage(image);
    }
        
    public void gameover(){
        
    }
}
