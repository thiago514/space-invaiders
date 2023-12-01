import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ammunition here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ammunition extends Actor
{
    public Actor act;
    public Ammunition(Actor act){
        super();
        this.act = act;
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/5);
        setImage(image);
        turn(-90);
    }

    public void  act()
    {
        if(act instanceof Nav){
            
        }
        
        if(isTouching(Enemy.class) && act instanceof Nav){
            Enemy enemy = (Enemy) getOneIntersectingObject(Enemy.class);
            getWorld().removeObject(enemy);
            getWorld().removeObject(this);
            Points.getInstance().adicionarPontos(10);
            return;
        }
        if(isTouching(Nav.class) && act instanceof Enemy){
            ((Background)getWorld()).gameOver();
            getWorld().removeObject(this);
        }
        
        if(getY() <= 0 || getY() >= 790){
            getWorld().removeObject(this);
            return;
        }
        
        move((act instanceof Nav)? 3 : -3);
        
        
    }
    
    public Actor getAct(){
        return act;
    }
}
