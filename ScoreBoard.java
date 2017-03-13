import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

import java.awt.Color;
import java.awt.Font;
import java.util.Calendar;


/**
 * Write a description of class ScoreBoard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreBoard extends Actor
{
    /**
     * Act - do whatever the ScoreBoard wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;

    public static int score;
    public String saying;
    
    private int rgb[] = {153, 51, 255};
    
    public ScoreBoard()
    {
        this(0);
    }
    
       public ScoreBoard(int score)
    {
        makeImage("Game Over", "Score: ", score);
    }
    
    public void act() 
    {
        if(score != Counter.value)
        {
            score = Counter.value;
            makeImage("  Game Over", "Score: ", score);
        }
        
        for(int i = 0; i < 3; i++)
        {
            if(rgb[i] <= 80)
            {
                rgb[i] = 255 - rgb[i];
            }
        }
    }    
    
     public ScoreBoard(int score, String saying)
    {
        score = this.score;
        this.saying = saying;
        makeImage(saying, "Score: ", score);
    }
    
     private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(255, 255, 255, 128));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        Font font = image.getFont();
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(new Color(rgb[0], rgb[1], rgb[2]));
        image.drawString(title, 30, image.getHeight()/3);
        image.drawString(prefix + score, 30, image.getHeight()/3 * 2);
        setImage(image);
    }
    
    
    
}
