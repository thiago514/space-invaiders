import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Nav here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Nav extends Actor
{
    private static Nav nav;
    private int timeShot;
    private Nav(){
        GreenfootImage image = getImage();
            image.scale(image.getWidth(), image.getHeight());
            setImage(image);
            this.timeShot = 0;
    }
    public static Nav getInstance()
    {
        if(nav == null){
            nav = new Nav();
        }
        return nav;
    }
    /**
     * Act - do whatever the Nav wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.isKeyDown("left")){
            move(-3);
        }
        
        if (Greenfoot.isKeyDown("right")){
            move(3);
        }
        
        if(Greenfoot.isKeyDown("space") && timeShot <= 0){
            getWorld().addObject(new Ammunition(), getX(), (getY() - (getImage().getWidth()/2)));
            timeShot=5;
        }
        
        timeShot--;
        

        
        if(isTouching(Enemy.class)){
            ((Background)getWorld()).gameOver();
            getWorld().removeObject(this);
            return;
        }
        
        if(getWorld().getObjects(Enemy.class).isEmpty()){
                ((Background)getWorld()).vencedor();
        }
        
    }
}
