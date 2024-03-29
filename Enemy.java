import greenfoot.*;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


/**
 * Write a description of class Enemy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Enemy extends Actor
{
    /**
     * Act - do whatever the Enemy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static boolean parede = false;
    
    public static int velocidade = 3;
    
    public static int tiro = 1000;
    
    
    
    
    public Enemy(){
        GreenfootImage image = getImage();
            //image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);

    }
    public synchronized void act()
    {

        if(getImage().toString().contains("tile001.png")){
            GreenfootImage image = new GreenfootImage("tile002.png");
            //image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);
        }else{
            GreenfootImage image = new GreenfootImage("tile001.png");
            //image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);

        }
        
        
        if(getX() <= 20 || getX() >= 1180){
            ((Background)getWorld()).parede();
        }
        move(velocidade);
        shot();
        
    }
    
    public synchronized void bateuParede(){
        turn(90);
        move(Math.abs(velocidade*4));
        turn(-90);
        move(velocidade*2);
    }
    
    public synchronized void shot(){
        if(tiro <= 0){
            getWorld().addObject(new Ammunition(this), getX(), (getY() - (getImage().getWidth()/2)));
            tiro=1000;
        }
        tiro -= Math.abs(velocidade);
    }
    
    public static synchronized void alteracaoGameEnemy(){
        if(velocidade > 0){
            if(Points.getInstance().getPontos() < 50){
                velocidade = 2;
            };
            if(Points.getInstance().getPontos() > 100){
                velocidade = 4;
            };
            if(Points.getInstance().getPontos() > 150){
                velocidade = 6;
            };
            
        }
        velocidade *= -1; 
        
    }
}
