package com.example.move;

/**
 * Created by guilherme on 10/03/14.
 */
public class MovementVoo extends Movement implements Voo{

    @Override
    public void plana() {
        System.out.println("planando com composition...");
    }

    @Override
    public void sobe(int metros) {
        System.out.println("subindo com composition...");
    }
}
