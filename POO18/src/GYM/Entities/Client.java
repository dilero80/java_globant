package GYM.Entities;

public class Client {
    private int ID;
    private String name;
    private int age;
    private int height;
    private int weight;
    private String objetive;

    public Client(int ID, String name, int age, int height, int weight, String objetive) {
        this.ID = ID;
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.objetive = objetive;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getObjetive() {
        return objetive;
    }

    public void setObjetive(String objetive) {
        this.objetive = objetive;
    }

    @Override
    public String toString() {
        return "Client: \n" +
                "ID=" + ID +"\n"+
                "name='" + name + "\n" +
                "age=" + age +"\n"+
                "height=" + height +"\n"+
                "weight=" + weight +"\n"+
                "objetive='" + objetive +"\n";
    }
}
