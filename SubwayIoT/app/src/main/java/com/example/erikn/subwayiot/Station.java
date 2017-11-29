package com.example.erikn.subwayiot;

import java.util.LinkedList;

/**
 * Created by erikn on 2017-11-23.
 */

public class Station {

    private String name;
    private int line;
    private LinkedList<Station> connections = new LinkedList<>();

    public Station(String name, int line){
        this.name = name;
        this.line = line;
    }

    public void addConnection(Station connection){
        if(!connections.contains(connection)){
            connections.add(connection);
        }

    }
}
