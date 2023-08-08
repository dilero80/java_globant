package GYM.Entities;

public class Routine {
    private int ID;
    private String name;
    private int duration;
    private String dificultyLevel;
    private String description;

    public Routine() {
    }

    public Routine(int ID, String name, int duration, String dificultyLevel, String description) {
        this.ID = ID;
        this.name = name;
        this.duration = duration;
        this.dificultyLevel = dificultyLevel;
        this.description = description;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getDificultyLevel() {
        return dificultyLevel;
    }

    public void setDificultyLevel(String dificultyLevel) {
        this.dificultyLevel = dificultyLevel;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Routine:" +
                "ID=" + ID +"\n"+
                "name='" + name +"\n"+
                "duration=" + duration +"\n"+
                "dificulty Level='" + dificultyLevel +"\n"+
                "description='" + description +"\n"
                ;
    }
}
