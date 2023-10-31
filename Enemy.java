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
    
    public int velocidade = 3;
    
    public static int inimigosMortos = 0;
    
    
    
    public Enemy(){
        GreenfootImage image = getImage();
            image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);

    }
    public synchronized void act()
    {

        if(getImage().toString().contains("tile001.png")){
            GreenfootImage image = new GreenfootImage("tile002.png");
            image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);
        }else{
            GreenfootImage image = new GreenfootImage("tile001.png");
            image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);

        }
        
        

        
        
        if(getX() <= 0 || getX() >= 599){
            bateuParede();
        }
        
        
        if(parede){
            bateuParede();
        }
        move(velocidade);
        
    }
    
    public void setParede(){
        parede = true;
    }
    
    public synchronized void bateuParede(){
        turn(90);
        move(Math.abs(velocidade*4));
        turn(-90);
        velocidade *= -1;
        parede = false;
        if(inimigosMortos > 0){
            velocidade *= 1 + (inimigosMortos/10);
            if(inimigosMortos > 10){
                velocidade *= inimigosMortos;
            }
        }
    }
}
