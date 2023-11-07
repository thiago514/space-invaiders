import greenfoot.Actor;
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class BaseGame here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class BaseGame implements FactoryGame 
{
    private Nav nav;
    private List<Actor> enemy;
    
    public BaseGame(){
        this.nav = Nav.getInstance();
        this.enemy = new ArrayList<Actor>();
        for(int i = 0; i<=22; i++){
            this.enemy.add(new Enemy());
        }
        
        
    }
    
    public Actor getNav(){
        return nav;
    }
    
    public List<Actor> getEnemys(){
        return enemy;
    }
    
}
