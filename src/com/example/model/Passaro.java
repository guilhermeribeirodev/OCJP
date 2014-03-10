package com.example.model;

import  com.example.move.MovementVoo;
/**
 * Created by guilherme on 10/03/14.
 */
public class Passaro extends Animal{


    protected MovementVoo movement;

    @Override
    public String eat(String food) {
        return "eating seed";
    }

    public MovementVoo getMovement() {
        return movement;
    }

    public void setMovement(MovementVoo movement) {
        this.movement = movement;
    }
}
