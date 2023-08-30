package GYM.Services;

import java.util.ArrayList;
import java.util.Scanner;
import GYM.Entities.Routine;
public class RoutineServices {
    private Scanner input = new Scanner(System.in);
    private ArrayList<Routine> routines = new ArrayList();
    public void createRoutine(Routine routine){
        System.out.println("Insert routine ID");
        int ID = input.nextInt();
        System.out.println("Insert routine name");
        input.nextLine();
        String name = input.nextLine();
        System.out.println("Insert routine duration min");
        int duration = input.nextInt();
        System.out.println("Insert routine difficulty");
        input.nextLine();
        String difficultyLevel = input.nextLine();
        System.out.println("Insert routine description");
        String description = input.nextLine();
        routines.add(new Routine(ID,name,duration,difficultyLevel,description));
    }
    public void getRoutines(){
        for(Routine routine : routines){
            System.out.println(routine);
        }
    }
    public void updateRoutines(int ID, String name, int duration, String difficultyLevel, String description){
        for (Routine routine : routines){
            if (routine.getID()==ID){
                routine.setName(name);
                routine.setDuration(duration);
                routine.setDificultyLevel(difficultyLevel);
                routine.setDescription(description);
                break;
            }
        }
    }
    public void removeRoutines(int ID){
        for (Routine routine : routines) {
            if (routine.getID() == ID) {
                routines.remove(routine);
            }
        }
    }
}
