import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
import java.util.ArrayList;

/**
 * Write a description of class background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{

    private List<Actor> enemy;;
    
    public Background()
    {    
        super(1200, 800, 1);
        FactoryGame game = new BaseGame();
        this.addObject(game.getNav(), 600, 750);
        int nEnemy = 0;
        enemy = game.getEnemys();
        for(int i = 1; i <= 3; i++){
            for(int n = 1; n<=7; n++){
                //Enemy e = new Enemy();
                //enemy.add(e);
                this.addObject(game.getEnemys().get(nEnemy), n*150, i*100);
                nEnemy++;
            }
            nEnemy++;
        
        }
        this.addObject(Points.getInstance(), 500, 20);
    }
    
    public void gameOver(){
        System.out.println("Game over");
        this.removeObjects(this.getObjects(Enemy.class));
        this.removeObjects(this.getObjects(Points.class));
        if(this.getObjects(Ammunition.class) != null){
            this.removeObjects(this.getObjects(Ammunition.class));    
        }
        /**if(this.getObjects(AmmunitionEnemy.class) != null){
            this.removeObjects(this.getObjects(AmmunitionEnemy.class));    
        } */
        GreenfootImage background = new GreenfootImage("game-over.png");
        background.scale(1100, 700);
        getBackground().drawImage(background, 0, 0);
    }
    
    public void vencedor(){
        System.out.println("Vencedor");
        this.removeObjects(this.getObjects(Nav.class));
        this.removeObjects(this.getObjects(Points.class));
        if(this.getObjects(Ammunition.class) != null){
            this.removeObjects(this.getObjects(Ammunition.class));    
        }
         /**if(this.getObjects(AmmunitionEnemy.class) != null){
            this.removeObjects(this.getObjects(AmmunitionEnemy.class));    
        } */
        GreenfootImage background = new GreenfootImage("vencedor.jpeg");
        background.scale(1200, 800);
        getBackground().drawImage(background, 0, 0);
    }
    
    public void parede(){
        System.out.println("Bateu na Parede");
        Enemy.alteracaoGameEnemy();
        enemy.forEach((e) -> {
               ((Enemy)e).bateuParede();
        });
        
    }
}
