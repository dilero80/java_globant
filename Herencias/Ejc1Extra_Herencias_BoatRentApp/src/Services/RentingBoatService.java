/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import Entities.Boat;
import Entities.DockingRent;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author drome
 */
public class RentingBoatService {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
    SimpleDateFormat sdf = new SimpleDateFormat("dd/M/yyyy");
    public RentingBoatService() {
    }
    
    public DockingRent newRent (Boat boat){
        String clientName;
        Integer id;
        Date rentDate = new Date();
        Date devolutionDate;
        Integer parkingSlot;
        
        System.out.println("Ingrese el nombre del cliente");
        clientName = read.next();
        System.out.println("Ingrese el ID del cliente");
        id = read.nextInt();
        System.out.println("ingrese la fehca del alquiler en formato dd/m/yyyy");
        String date = read.next();
        try{
            
            rentDate = sdf.parse(date);
        }catch (ParseException e){
            e.printStackTrace();
        }
        System.out.println("Ingrese el puesto");
        parkingSlot = read.nextInt();
        
        return new DockingRent(clientName, id, rentDate, null, boat, parkingSlot);
    }
    
    public DockingRent newRent (String clientName, Integer ID, Date rentDate, Date devolutionDate, Boat boat, Integer parkingSlot){
       
        return new DockingRent(clientName, ID, rentDate, devolutionDate, boat, parkingSlot);
    }
    
    public void calculateParkingPrice (DockingRent rent) throws ParseException{
        
        Date date =new Date();
        int cont;
        String devolutionDate;
        System.out.println("Ingresa la fecha de devolucion en formato dd/m/yyyy");
        devolutionDate = read.next();
        
        try{
            date = sdf.parse(devolutionDate);
            System.out.println(date);
            System.out.println(sdf.format(date));
            rent.setDevolutionDate(date);
        } catch (ParseException e){
            e.printStackTrace();
        }
        cont = (int) ((date.getTime() - rent.getRentDate().getTime()) / 86400000);
        
        rent.setParkingValue(cont * rent.getModuleValue());
        System.out.println("el valor de parqueo fue: $ " + rent.getParkingValue());
        
        
        
    }
    
    
}
