package com.example.erikn.subwayiot;

import java.util.LinkedList;

/**
 * Created by erikn on 2017-11-23.
 */

public class Station {

    private String name;
    private LinkedList<Connection> connections = new LinkedList<>();

    public Station(String name){

    }

    public void addConnection(Connection connection){
        if(!connections.contains(connection)){
            connections.add(connection);
        }

    }
}
