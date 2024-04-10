/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author drome
 */
public class Armour {
    
    protected String firstColor;
    protected String secondColor;
    protected Boot lefBoot;
    protected Boot rightBoot;
    protected Glove leftGlove;
    protected Glove rightGlove;
    protected String resistance; //Rockwell units
    protected Double health;
    protected Generator gen;
    protected Console console;
    

    public Armour() {
    }

    public Armour(String firstColor, String secondColor, Boot lefBoot, Boot rightBoot, Glove leftGlove, Glove rightGlove, String resistance, Double health, Generator gen, Console console) {
        this.firstColor = firstColor;
        this.secondColor = secondColor;
        this.lefBoot = lefBoot;
        this.rightBoot = rightBoot;
        this.leftGlove = leftGlove;
        this.rightGlove = rightGlove;
        this.resistance = resistance;
        this.health = health;
        this.gen = gen;
        this.console = console;
    }

    public String getFirstColor() {
        return firstColor;
    }

    public void setFirstColor(String firstColor) {
        this.firstColor = firstColor;
    }

    public String getSecondColor() {
        return secondColor;
    }

    public void setSecondColor(String secondColor) {
        this.secondColor = secondColor;
    }

    public Boot getLefBoot() {
        return lefBoot;
    }

    public void setLefBoot(Boot lefBoot) {
        this.lefBoot = lefBoot;
    }

    public Boot getRightBoot() {
        return rightBoot;
    }

    public void setRightBoot(Boot rightBoot) {
        this.rightBoot = rightBoot;
    }

    public Glove getLeftGlove() {
        return leftGlove;
    }

    public void setLeftGlove(Glove leftGlove) {
        this.leftGlove = leftGlove;
    }

    public Glove getRightGlove() {
        return rightGlove;
    }

    public void setRightGlove(Glove rightGlove) {
        this.rightGlove = rightGlove;
    }

    public String getResistance() {
        return resistance;
    }

    public void setResistance(String resistance) {
        this.resistance = resistance;
    }

    public Double getHealth() {
        return health;
    }

    public void setHealth(Double health) {
        this.health = health;
    }

    public Generator getGen() {
        return gen;
    }

    public void setGen(Generator gen) {
        this.gen = gen;
    }

    public Console getConsole() {
        return console;
    }

    public void setConsole(Console console) {
        this.console = console;
    }

    @Override
    public String toString() {
        return "Armour{" + "firstColor=" + firstColor + ", secondColor=" + secondColor + ", lefBoot=" + lefBoot + ", rightBoot=" + rightBoot + ", leftGlove=" + leftGlove + ", rightGlove=" + rightGlove + ", resistance=" + resistance + ", health=" + health + ", gen=" + gen + ", console=" + console + '}';
    }
    
    

}

    
    
   