/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejc2extra_herenecias_buildingvolumes;

import Entities.Building;
import Entities.OfficeBuilding;
import Entities.SportsCenter;
import Services.SportsCenterService;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class Ejc2Extra_Herenecias_BuildingVolumes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        int cont =0;
        ArrayList<Building> buildings = new ArrayList();
        
        //OfficeBuilding(Integer officesPerFloor, Integer floors, Integer personPerOffice, Double width, Double height, Double lenght)
        buildings.add(new OfficeBuilding(4, 10, 6, 20D,30d , 25d ) );
        buildings.add(new OfficeBuilding(6, 15, 10, 40D,45d , 25d ) );
        buildings.add(new SportsCenter("Roof", 100d, 20d, 200d));
        buildings.add(new SportsCenter("Open", 100d, 20d, 200d));
        
        SportsCenterService sc = new SportsCenterService();
        
        
        for (Building building : buildings) {
            cont ++;
            System.out.println("------------------------------------------------");
            System.out.println("The Building in "+ cont + " position");
            if(building.getClass().getName().equals("Entities.SportsCenter")){
                System.out.println("It is sportcenter");
                System.out.println("It has a surface of " + building.surfaceCalc() +"mts2");
                System.out.println("It has a volume of " + building.volumeCalc()+"mts3");
                System.out.println("It is " + sc.getType((SportsCenter) building)+ " type");
            }
            else if(building.getClass().getName().equals("Entities.OfficeBuilding")){
                System.out.println("Is office Building");
                System.out.println("It has a surface of  " + building.surfaceCalc() +"mts2");
                System.out.println("It has a volume of " + building.volumeCalc()+"mts3");
                
            }
            System.out.println("------------------------------------------------");
            
        }
        
            
        
    }
    
}
