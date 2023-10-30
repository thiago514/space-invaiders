import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


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
    
    public static int inimigosMortos = 0;
    
    
    public Enemy(){
        GreenfootImage image = getImage();
            image.scale(image.getWidth()/ 2, image.getHeight()/2);
            setImage(image);

    }
    public void act()
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
        

        
        /*
        if(getX() <= 0 || getX() >= 599){
            parede = true;
        }
        

        
        if(parede){
            turn(90);
            move(3);
            turn(-90);
            velocidade *= -1;
            parede = false;
        }
        move(velocidade);*/
        
    }
}
