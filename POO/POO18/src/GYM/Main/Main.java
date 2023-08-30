package GYM.Main;

import GYM.Entities.Client;
import GYM.Entities.Routine;
import GYM.Services.ClientServices;
import GYM.Services.RoutineServices;

import java.util.ArrayList;

public class Main {
    public static void main(String[]args){
        ClientServices cs = new ClientServices();
        RoutineServices rs = new RoutineServices();
        Routine routine = new Routine();
        int qty = 3;
        for(int i = 0; i<qty;i++){
            cs.createClient();
        }
        for(int i = 0; i<qty;i++){
            rs.createRoutine(routine);
        }
        cs.getClients();
        rs.getRoutines();
        cs.updateClients(003,"Natalia",23,159,59,"Gain muscle mass");
        rs.updateRoutines(002, "legs", 30, "Medium","Full leg excersices to gain muscle");
        cs.getClients();
        rs.getRoutines();
        cs.removeClients(001);
        rs.removeRoutines(002);
        cs.getClients();
        rs.getRoutines();
    }



}
