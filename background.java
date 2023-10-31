import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class background extends World
{

    private List<Enemy> enemy = new ArrayList<Enemy>();
    
    public background()
    {    
        super(600, 400, 1);
        this.addObject(Nav.getInstance(), 300, 380);
        for(int i = 1; i <= 3; i++){
            for(int n = 1; n<=7; n++){
                Enemy e = new Enemy();
                enemy.add(e);
                this.addObject(e, n*70, i*60);
            }
        
        }
        this.addObject(Points.getInstance(), 500, 20);
        //this.addObject(new Enemy(), 50, 50);
    }
    
    public void parede(){
        enemy.forEach((e) -> {
           e.bateuParede();
        });
    }
}
