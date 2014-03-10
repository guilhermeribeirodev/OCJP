package com.example.move;

/**
 * Created by guilherme on 10/03/14.
 */

public class MovementBipede extends Movement implements Bipede{

    @Override
    public void anda() {
        System.out.println("andando com composition...");
    }
}
