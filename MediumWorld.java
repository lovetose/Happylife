import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MediumWorld extends World
{

   int n = 0;
    private Counter scoreCounter;
    private killCounter killsCounter;
    public static int aNumber;
    public static int sNumber;
    public static int bNumber;
    public int time;
    GreenfootSound backgroundMusic = new GreenfootSound("Animal Crossing City Folk Music 9am.mp3");
   
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    
    
    public MediumWorld()
    {    
        
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 650, 1);
         addObject(new BackGATE(), 777, 583);
         
         addObject(new Bug2(), getWidth()/2, getHeight()/2);
          
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
        if (getObjects(Bug2.class).isEmpty()) {
        
        }else{
        if (Greenfoot.getRandomNumber(37)<1){
           addObject(new Bird(), Greenfoot.getRandomNumber(900), 0);
           addObject(new Bird(), 0, Greenfoot.getRandomNumber(650));
           addObject(new Bird(), Greenfoot.getRandomNumber(900), 0);
        }

         if (Greenfoot.getRandomNumber(37)<1){
           addObject(new Bird(), Greenfoot.getRandomNumber(900), 0);
           addObject(new Bird(), 0, Greenfoot.getRandomNumber(650));
           addObject(new Bird(), Greenfoot.getRandomNumber(900), 0);
        }
        
        if(killCounter.value >= 100){
             if (Greenfoot.getRandomNumber(40)<1){
             addObject(new Bird(), Greenfoot.getRandomNumber(900), 0);     
            }
        }  
       
        if(killCounter.value >= 300){
             if (Greenfoot.getRandomNumber(40)<1){
             addObject(new Bird(), 900,  Greenfoot.getRandomNumber(650));     
            }
        }  
   }
}
       
   public void gameover() {
    if (getObjects(Bug2.class).isEmpty())  {
        if(getObjects(ScoreBoard.class).isEmpty()){
            addObject(new ScoreBoard(), getWidth()/2, getHeight()/2);    
            backgroundMusic.stop();
            removeObjects(getObjects(Bird.class));
            addObject(new Restart(), 350, 523);
            addObject(new returnToMainMenu(), 550, 523);
      }
    }
    }
}

