/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Game;
import Entities.Player;
import Entities.WaterPistol;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class PistolAppService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    
    public PistolAppService() {
    }
    
    public WaterPistol createPistol (){
        int actualPos = (int)(Math.random() * 8) + 1;
        int waterPos = (int)(Math.random() * 8) + 1;
    
        return new WaterPistol(actualPos, waterPos);
                
        
    }
    
    
    public boolean wet(WaterPistol w){
        if (w.getActualPos() == w.getWaterPos()){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    public void changePos (WaterPistol w){
        Integer pos = w.getActualPos() +1 ;
        if (pos > 8){
            pos = 1;
        }
        w.setActualPos(pos);
    }
    
    public void showPistol(WaterPistol w){
        Integer actual = w.getActualPos();
        Integer water  = w.getWaterPos();
        System.out.println("---------------------------------------------");
        System.out.print("Water position  | ");
        for (int i = 0; i < 8; i++) {
            if (water.equals(i)){
                System.out.print("[X]");
            }else{
                System.out.print("[ ]");
            }
            
        }
        System.out.println(" | ");
        System.out.print("Actual position | ");
        for (int i = 0; i < 8; i++) {
            if (actual.equals(i)){
                System.out.print("[X]");
            }else{
                System.out.print("[ ]");
            }
            
        }
        System.out.println(" | ");
        System.out.println("---------------------------------------------");        
        
        
    }
    
    public Player createPlayer(Integer playerNumber){
        String playerName = "Jugador " + playerNumber;
        return new Player(playerNumber, playerName, false);
    }
    
    public boolean shot(Player p, WaterPistol w){
        this.changePos(w);
        if (this.wet(w)){
            p.setWet(true);
            return true;
        }
        return false; 
    }
    
    public Game fillGame (){
        int numberPlayers;
        ArrayList <Player> players = new ArrayList();
        System.out.println("----------------------------");
        System.out.println("VAMOS A JUGAR RULETA DE AGUA");
        System.out.println("----------------------------");
        System.out.println("Digite el numero de jugadores maximo 6");
        numberPlayers = read.nextInt();
        if(numberPlayers > 6 ){
            System.out.println("Maximo 6 jugadores");
            numberPlayers = 6;
        }
        else if(numberPlayers < 2){
            System.out.println("Minimo 2 jugadores");
            numberPlayers = 2; 
        }
        for (int i = 0; i < numberPlayers; i++) {
            players.add(this.createPlayer((i+1)));
            
        }
        return new Game(this.createPistol(), players);
        
    }
    
    public void playGame(Game G){
        ArrayList <Player> players = G.getPlayers();
        WaterPistol p = G.getPistol();
        boolean flag = true;
        String play;
        do{
            for (Player player : players) {
                System.out.println("El turno es para " + player.getName());
                System.out.println("Presione P para jugar");
                do{
                    play = read.next();
                }while(!play.equalsIgnoreCase("P"));
                
                if(this.shot(player, p)){
                    System.out.println("Ha perdido el " + player.getName());
                    System.out.println("Juego Finalizado");
                    flag = false;
                    this.showPistol(p);
                    return;
                }
                else{
                    System.out.println("Se salvo");
                }
                this.showPistol(p);
            }
        }while(flag);
    }
    
    
}
