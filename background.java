import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    /**
     * Constructor for objects of class background.
     * 
     */
    public background()
    {    
        super(600, 400, 1);
        this.addObject(Nav.getInstance(), 300, 380);
        for(int i = 1; i <= 3; i++){
            for(int n = 1; n<=7; n++){
                this.addObject(new Enemy(), n*70, i*60);
            }
        
        }
        this.addObject(Points.getInstance(), 500, 20);
        //this.addObject(new Enemy(), 50, 50);
    }
}
