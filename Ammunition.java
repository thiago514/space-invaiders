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
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight()/5);
        setImage(image);
        turn(-90);
    }

    public void act()
    {
        if(getY() <= 0){
            getWorld().removeObject(this);
        }
        
        move(3);
    }
}
