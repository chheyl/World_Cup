package model;

import java.util.ArrayList;

public class group {
    String name;
    ArrayList<Team> group;


    public group(String name, ArrayList<Team> group) {
        this.name = name;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Team> getGroup() {
        return group;
    }

    public void setGroup(ArrayList<Team> group) {
        this.group = group;
    }
}