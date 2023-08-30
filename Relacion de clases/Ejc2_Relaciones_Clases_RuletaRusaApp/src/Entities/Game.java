/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

import java.util.ArrayList;

/**
 *
 * @author drome
 */
public class Game {
    private WaterPistol pistol;
    private ArrayList<Player> players;
    private Integer round;
    
    public Game() {
        this.players = new ArrayList();
    }

    public Game(WaterPistol pistol, ArrayList<Player> players) {
        this.pistol = pistol;
        this.players = players;
        this.round = 0;
    }

    public WaterPistol getPistol() {
        return pistol;
    }

    public void setPistol(WaterPistol pistol) {
        this.pistol = pistol;
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Player> players) {
        this.players = players;
    }

    public Integer getRound() {
        return round;
    }

    public void setRound(Integer round) {
        this.round = round;
    }

    @Override
    public String toString() {
        return "Game{" + "pistol=" + pistol + ", players=" + players + ", round=" + round + '}';
    }
    
    
    
    
    
    
}
