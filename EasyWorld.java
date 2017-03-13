import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EasyWorld extends World
{

    
    Frog frog = new Frog();
    private Counter scoreCounter;
    private killCounter killsCounter;
    public static int aNumber;
    public static int sNumber;
    public static int bNumber;
    public int time;
    GreenfootSound backgroundMusic = new GreenfootSound("1PM - Animal Crossing- New Leaf Music.mp3");
    int n;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    public EasyWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1);
         time = 0;
         addObject(new BackGATE(), 777, 583);
         
         addObject(new Bug(), getWidth()/2, getHeight()/2);
          
         scoreCounter = new Counter("Score: ");
         killsCounter = new killCounter("Kills: ");
         addObject(scoreCounter, 786, 577);
         addObject(killsCounter, 786, 592);
         backgroundMusic.playLoop();
        
    }
    
    public void act(){
        spawn();
        gameover();
        timer();
    }
    
    public void timer(){
        showText("Time : " + time/60, 770, 550);
        if(getObjects(ScoreBoard.class).isEmpty()){
        time++;
    }
}

    public void spawn()  
    {  
        if (getObjects(Bug.class).isEmpty()) {
        
        }else{
        if (Greenfoot.getRandomNumber(40)<1){
           addObject(new Frog(), Greenfoot.getRandomNumber(900), 0);
           addObject(new Frog(), 0, Greenfoot.getRandomNumber(650));
           addObject(new Frog(), Greenfoot.getRandomNumber(900), 0);
        }
              
        if (Greenfoot.getRandomNumber(40)<1){
           addObject(new Frog(), Greenfoot.getRandomNumber(900), 0);
           addObject(new Frog(), 0, Greenfoot.getRandomNumber(650));
           addObject(new Frog(), Greenfoot.getRandomNumber(900), 0);
        }
        
        if(killCounter.value >= 100){
             if (Greenfoot.getRandomNumber(40)<1){
             addObject(new Frog(), Greenfoot.getRandomNumber(900), 0);     
            }
        }  
       
        if(killCounter.value >= 500){
             if (Greenfoot.getRandomNumber(40)<1){
             addObject(new Frog(), 900,  Greenfoot.getRandomNumber(650));     
            }
        }  
   }
}
 
   
 public void gameover() {
    if (getObjects(Bug.class).isEmpty())  {
        if(getObjects(ScoreBoard.class).isEmpty()){
            addObject(new ScoreBoard(), getWidth()/2, getHeight()/2);    
            backgroundMusic.stop();
            removeObjects(getObjects(Frog.class));
            addObject(new Restart(), 350, 523);
            addObject(new returnToMainMenu(), 550, 523);
      }
    }
    }
}

