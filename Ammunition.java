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
        super();
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/5);
        setImage(image);
        turn(-90);
    }

    public void  act()
    {
        if(getY() <= 0){
            getWorld().removeObject(this);
        }
        
        if(isTouching(Enemy.class)){
            Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
            Points.getInstance().adicionarPontos(10);
            
        }
        
        move(3);
    }
}
