/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2_herencias_applianceapp;

import Entities.Appliance;
import Entities.Television;
import Entities.WashingMachine;
import Services.TvService;
import Services.WashingMachineService;
import java.util.ArrayList;
import Enumerators.TVExamples;
import Enumerators.WMExamples;

        
/**
 *
 * @author drome
 */
public class Ejc2_Herencias_applianceApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Appliance> appliances = new ArrayList();
        WashingMachineService ws = new WashingMachineService();
        TvService ts = new TvService();
        
        for (WMExamples wm : WMExamples.values()) {
            appliances.add(ws.createWashingMachine(wm.getCharge(), wm.getColor(), wm.getEnergy(),wm.getWeight() ));
            
        }
        
        for(TVExamples tv :TVExamples.values()){
            appliances.add(ts.createTV(tv.getResolution(), tv.isTdt(), tv.getColor(), tv.getEnergy(), tv.getWeight()));
        }
        
        int sumPrice = 0;
        System.out.println("-----------APPLIANCES LIST----------- ");
        
        for (Appliance appliance : appliances) {
            sumPrice = sumPrice + appliance.getPrice();
//            System.out.println("|  TIPO     |   COLOR   |   TIPO DE CONSUMO   |   PESO    |   RESOLUCION/CARGA     |  TDT (SI APLICA)");
//            System.out.println("| appliance.toString()  |   " + appliance.getColor() + " |  " + appliance.getEnergy()  +  "  |  " + "");
            System.out.println(appliance.toString());
        }
        System.out.println("TOTAL PRICE $"+ sumPrice);
                
//        WashingMachine wm1= ws.createWashingMachine();
//        
//        Television tv1 = ts.createTV();
        
        
        

        

//        System.out.println("The TV Price is USD$ " + tv1.getPrice());
//        System.out.println("The Washing Machine price is " + wm1.getPrice());
        
        
        
    }
    
}
