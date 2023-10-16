import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammunition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammunition extends Actor
{
    public Ammunition(){
        turn(-90);
    }

    public void act()
    {
        if(getX() >= 600 || getY() >= 400 || getX() <= 0 || getY() <= 0){
            getWorld().removeObject(this);
        }
        
        move(3);
    }
}
