package model;

import java.util.ArrayList;

public class Team {
    String name;
    String jersey_color;
    int fifa_position;
    ArrayList<Players> players;

    public Team(String name, String jersey_color, int fifa_position, ArrayList<Players> players) {
        this.name = name;
        this.jersey_color = jersey_color;
        this.fifa_position = fifa_position;
        this.players = players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJersey_color() {
        return jersey_color;
    }

    public void setJersey_color(String jersey_color) {
        this.jersey_color = jersey_color;
    }

    public int getFifa_position() {
        return fifa_position;
    }

    public void setFifa_position(int fifa_position) {
        this.fifa_position = fifa_position;
    }

    public ArrayList<Players> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<Players> players) {
        this.players = players;
    }
}