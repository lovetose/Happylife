import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color; 
public class GameOver extends Actor  
{  
    String msgTxt = "GAME OVER"; 
  
    public GameOver()  
    {  
        updateImage();  
    }  
  
    public GameOver(String txt)  
    {  
        msgTxt = txt;  
        updateImage();  
    }  
  
    private void updateImage()  
   {  
       GreenfootImage back = new GreenfootImage(800, 800);   // or whatever size you want the object  
       GreenfootImage gameOver = new GreenfootImage(800, 800);// size of the object    
       back.setColor(Color.red);  
       back.fill();    
       back.setTransparency(90);   
       gameOver.drawImage(back, 0, 0);    
       GreenfootImage txtImg = new GreenfootImage(msgTxt, 60, Color.black, new Color(0, 0, 0, 0));   
       gameOver.drawImage(txtImg, (gameOver.getWidth() - txtImg.getWidth()) / 2, (gameOver.getHeight() - txtImg.getHeight()) / 2);  
       setImage(gameOver);  
   }  
}  
