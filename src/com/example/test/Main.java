package com.example.test;

import com.example.model.Animal;
import com.example.model.Dog;
import com.example.model.Passaro;
import com.example.move.MovementBipede;
import com.example.move.MovementVoo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by guilherme on 10/03/14.
 */
public class Main {

    public static void main(String args[]){

        Set<Animal> animals = new HashSet<Animal>();

        //List<Animal> animals = new ArrayList<Animal>();

        Dog dog = new Dog();
        dog.setMovement(new MovementBipede());

        Passaro passaro2 = new Passaro();
        passaro2.setMovement(new MovementVoo());

        Passaro passaro = new Passaro();
        passaro.setMovement(new MovementVoo(){

            @Override
            public void plana() {
                System.out.println("planando com composition e sobrecarga...");
            }


        });

        animals.add(dog);
        animals.add(passaro);
        animals.add(passaro2);
        animals.add(passaro2);

        for(Animal a : animals ){

            System.out.println("========"+a.getClass().getSimpleName());

            System.out.println(a.eat("food"));

            if (a instanceof Dog){

                System.out.println("i'm dog");
                //a.getMovement().
                ((Dog) a).getMovement().anda();


            }else if(a instanceof Passaro){

                System.out.println("i'm bird");
                ((Passaro) a).getMovement().plana();
                ((Passaro) a).getMovement().sobe(4);

            }

            System.out.println("---------");
        }

    }
}


/* ------ ----------------*/










