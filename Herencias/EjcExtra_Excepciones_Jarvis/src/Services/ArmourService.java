/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Armour;
import Entities.ArmourPart;
import Entities.Boot;
import Entities.Console;
import Entities.Generator;
import Entities.Glove;

/**
 *
 * @author drome
 */
public class ArmourService {

    public ArmourService() {
    }
    
    public Armour createArmour (String color1, String color2, Double bootUse, Double gloveUse , Double genUse ){
        return new Armour(color2, color2, new Boot(true, bootUse), new Boot(true, bootUse), new Glove (true, gloveUse), new Glove(true, gloveUse), "HRA", 100d, new Generator(5000000d), new Console(true, genUse) );
    }
    
    public void walk (Armour A, Double duration ) throws Exception{
        try {
            Double energyUsed = (A.getRightBoot().getEnergyUsedsingle() + A.getLefBoot().getEnergyUsedsingle()) * duration;
            Double energy = A.getGen().getEnergy();
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLefBoot());
            if (!(A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional())){
                throw new Exception("THERE IS A DAMAGED, PLEASE REPAIR");
            }
                  
            if (A.getHealth() <= 0){
                throw new Exception("NO HEALTH, PLEASE RECOVER");
            }
            else if(A.getGen().getEnergy() < energyUsed){
                throw new Exception("NOT ENOUGH ENERGY");
            }
            System.out.println("Energy : " + energy + "aH");
            A.getGen().setEnergy(energy - energyUsed);
            System.out.println("WALKING......");
            Thread.sleep(100L * duration.longValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }    
    
   
    public void run (Armour A, Double duration ) throws Exception{
        try {
            Double energyUsed = (A.getRightBoot().getEnergyUsedsingle() + A.getLefBoot().getEnergyUsedsingle()) * duration * 2;
            Double energy = A.getGen().getEnergy();
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLefBoot());
            
            if (!(A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional())){
                throw new Exception("THERE IS A DAMAGED, PLEASE REPAIR");
            }
            if (A.getHealth() <= 0){
                throw new Exception("NO HEALTH, PLEASE RECOVER");
            }
            else if(A.getGen().getEnergy() < energyUsed){
                throw new Exception("NOT ENOUGH ENERGY");
            }
            System.out.println("Energy : " + energy + "aH");
            A.getGen().setEnergy(energy - energyUsed);
            System.out.println("RUNNING......");
            Thread.sleep(100L * duration.longValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void propulse (Armour A, Double duration ) throws Exception{
        try {
            Double energyUsed = (A.getRightBoot().getEnergyUsedsingle() + A.getLefBoot().getEnergyUsedsingle()) * duration * 3;
            Double energy = A.getGen().getEnergy();
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLefBoot());
            
            if (!(A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional())){
                throw new Exception("THERE IS A DAMAGED, PLEASE REPAIR");
            }
            if (A.getHealth() <= 0){
                throw new Exception("NO HEALTH, PLEASE RECOVER");
            }
            else if(A.getGen().getEnergy() < energyUsed){
                throw new Exception("NOT ENOUGH ENERGY");
            }
            System.out.println("Energy : " + energy + "aH");
            A.getGen().setEnergy(energy - energyUsed);
            System.out.println("PROPULSION......");
            Thread.sleep(100L * duration.longValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void fly (Armour A, Double duration ) throws Exception{
        try {
            Double energyUsed = (((A.getRightBoot().getEnergyUsedsingle() + A.getLefBoot().getEnergyUsedsingle()) * 3) + ((A.getLeftGlove().getEnergyUsedsingle() + A.getRightGlove().getEnergyUsedsingle()) * 2)) * duration ;
            Double energy = A.getGen().getEnergy();
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLefBoot());
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLeftGlove());
            
            if (!(A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional())){
                throw new Exception("THERE IS A DAMAGED, PLEASE REPAIR");
            }
            
            
            if (A.getHealth() <= 0){
                throw new Exception("NO HEALTH, PLEASE RECOVER");
            }
            else if(A.getGen().getEnergy() < energyUsed){
                throw new Exception("NOT ENOUGH ENERGY");
            }
            System.out.println("Energy : " + energy + "aH");
            A.getGen().setEnergy(energy - energyUsed);
            System.out.println("FLYING......");
            Thread.sleep(100L * duration.longValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void shoot (Armour A, Double duration ) throws Exception{
        try {
            Double energyUsed = (A.getLeftGlove().getEnergyUsedsingle() + A.getRightGlove().getEnergyUsedsingle() * 2) * duration ;
            Double energy = A.getGen().getEnergy();
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLeftGlove());
            
            if (!(A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional())){
                throw new Exception("THERE IS A DAMAGED, PLEASE REPAIR");
            }
            if (A.getHealth() <= 0){
                throw new Exception("NO HEALTH, PLEASE RECOVER");
            }
            else if(A.getGen().getEnergy() < energyUsed){
                throw new Exception("NOT ENOUGH ENERGY");
            }
            System.out.println("Energy : " + energy + "aH");
            A.getGen().setEnergy(energy - energyUsed);
            System.out.println("KILLING......");
            Thread.sleep(100L * duration.longValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void talk (Armour A, Double duration ) throws Exception{
        try {
            Double energyUsed = (A.getConsole().getEnergyUsedsingle()) * duration ;
            Double energy = A.getGen().getEnergy();
            this.damagedinUse(A.getRightBoot());
            this.damagedinUse(A.getLeftGlove());
            
            if (!(A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional())){
                throw new Exception("THERE IS A DAMAGED, PLEASE REPAIR");
            }
            if (A.getHealth() <= 0){
                throw new Exception("NO HEALTH, PLEASE RECOVER");
            }
            else if(A.getGen().getEnergy() < energyUsed){
                throw new Exception("NOT ENOUGH ENERGY");
            }
            System.out.println("Energy : " + energy + "aH");
            A.getGen().setEnergy(energy - energyUsed);
            System.out.println("KILLING......");
            Thread.sleep(100L * duration.longValue());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void getState(Armour A){
        System.out.println("ARMOUR STATE");
        System.out.println("Remaining Health: " + A.getHealth() );
        this.energyMeasures(A);
        
    }
    
    public void energyMeasures(Armour A){
        Double ah = A.getGen().getEnergy();
        System.out.println("Energy  " + A.getGen().getEnergy() + "Ah");
        System.out.println("Energy in mAh " + ah * 1000);
        System.out.println("Energy in Coulumbs " + ah * 3600);
        
        
    }
    
    public void repair(ArmourPart ap){
        if(1 - Math.random() < 0.4){
            System.out.println("Se reparo el daño");
            ap.setIsFunctional(true);
        }
        else{
            System.out.println("NO Se reparo el daño intente de nuevo");
            ap.setIsFunctional(false);
        }
        
    }
    
    public void checkArmour(Armour A) throws Exception{
        try{
            do{
                
                if(!A.getLefBoot().isIsFunctional()){
                    this.repair(A.getLefBoot());
                }
                if(!A.getRightBoot().isIsFunctional()){
                    this.repair(A.getRightBoot());
                }
                if(!A.getRightGlove().isIsFunctional()){
                    this.repair(A.getRightGlove());
                }
                if(!A.getLeftGlove().isIsFunctional()){
                    this.repair(A.getLeftGlove());
                }
                if(!A.getConsole().isIsFunctional()){
                    this.repair(A.getConsole());
                }
                if(1 - Math.random() < 0.2 && (A.getConsole().isIsFunctional() && A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional() && A.getLeftGlove().isIsFunctional() && A.getRightGlove().isIsFunctional())){
                    throw new Exception("ITS BROKEN, REPLACE ARMOUR");
                }
            }while(!(A.getConsole().isIsFunctional() && A.getLefBoot().isIsFunctional() && A.getRightBoot().isIsFunctional() && A.getLeftGlove().isIsFunctional() && A.getRightGlove().isIsFunctional()));
        }catch (Exception e){
                System.out.println(e.getMessage());
                }
    }
    
    public void radar (Armour A, Integer numberOfEnemies) throws Exception{
        
        
       
        
    }
    
    
    
            
    private void damagedinUse (ArmourPart ap){
        if(1 - Math.random() < 0.3){
            System.out.println("THERE IS A DAMAGE");
            ap.setIsFunctional(false);
        }
        else{
            ap.setIsFunctional(true);
        }
    }
    
    
    private Double calculateDistance(Double x1, Double y1, Double z1, Double x2, Double y2, Double z2){
         Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1),2) + Math.pow((z2 - z1),2));
         return distance;
    }
    
    
}
