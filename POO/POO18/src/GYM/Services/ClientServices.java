package GYM.Services;

import java.util.ArrayList;
import java.util.Scanner;
import GYM.Entities.Client;
public class ClientServices {
    private Scanner input=new Scanner(System.in);
    private ArrayList<Client> clients = new ArrayList<>();
    public void createClient(){
        System.out.println("Insert the name of the client");
        String name = input.nextLine();
        System.out.println("Insert client ID");
        int ID = input.nextInt();
        System.out.println("Insert client's age");
        int age = input.nextInt();
        System.out.println("Insert client's height in cm");
        int height = input.nextInt();
        System.out.println("Insert client's weight in kg");
        int weight = input.nextInt();
        System.out.println("Insert client's objetive");
        input.nextLine();
        String objetive = input.nextLine();
        clients.add(new Client(ID,name,age,height,weight,objetive));
    }
    public void getClients(){
        for (Client client: clients){
            System.out.println(client);
        }
    }
    public void updateClients(int ID, String name, int age, int height, int weight, String objetive){
        for (Client client: clients){
            if(client.getID()==ID){
                client.setName(name);
                client.setAge(age);
                client.setHeight(height);
                client.setWeight(weight);
                client.setObjetive(objetive);
                break;
            }
        }
    }
    public void removeClients(int ID){
        for (Client client : clients){
            if (client.getID() == ID){
                clients.remove(client);
                break;
            }
        }
    }
}
