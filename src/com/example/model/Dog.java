package com.example.model;

import com.example.move.MovementBipede;

/**
 * Created by guilherme on 10/03/14.
 */
public class Dog extends Animal{

    protected MovementBipede movement;

    @Override
    public String eat(String food) {
        return "eating ration";
    }

    public MovementBipede getMovement() {
        return movement;
    }

    public void setMovement(MovementBipede movement) {
        this.movement = movement;
    }
}
