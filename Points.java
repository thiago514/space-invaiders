import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Points here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Points extends Actor
{
    private int pontos = 0; // Variável para armazenar os pontos

    private static Points points;
    public Points() {
        atualizarImagem();
    }
    
    public static Points getInstance(){
        if(points == null){
            points = new Points();
        }
        return points;
        
    }
    public void act(){
        if(getWorld().getObjects(Enemy.class).size() == 21){
            pontos = 0;
            atualizarImagem();
        }
    }
    

    // Método para atualizar a imagem do placar
    private void atualizarImagem() {
        GreenfootImage imagem = new GreenfootImage("Pontos: " + pontos, 24, greenfoot.Color.WHITE, greenfoot.Color.BLACK);
        setImage(imagem);
    }

    // Método para adicionar pontos ao placar
    public void adicionarPontos(int valor) {
        pontos += valor;
        atualizarImagem();
    }

    // Método para obter o valor atual dos pontos
    public int getPontos() {
        return pontos;
    }
    
}
