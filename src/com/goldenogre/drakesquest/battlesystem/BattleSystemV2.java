package com.goldenogre.drakesquest.battlesystem;

import entity.Enemy;
import entity.Entity;
import entity.Hero;

import java.util.ArrayList;
import java.util.Collections;

public class BattleSystemV2 {
    private static ArrayList<Entity> list;
    private static ArrayList<Hero> heroes;
    private static ArrayList<Enemy> enemies;

    public BattleSystemV2(ArrayList<Hero> party, ArrayList<Enemy> group) {
        list = new ArrayList<>();
        heroes = new ArrayList<>(party);
        enemies = new ArrayList<>(group);
        for (Entity item : party) {
            list.add(item);
        }
        for (Entity item : group) {
            list.add(item);
        }
        System.out.println(list);

    }

    public static void startAttack() {
        System.out.println(heroes);
        System.out.println(enemies);
        Collections.shuffle(list);
        System.out.println(list);

        for(int i = 0; i < list.size();i++){

            if(heroes.size()!=0 && list.get(i).getType()=='e' && !list.get(i).isDead()){
                int attack = list.get(i).getAttack();
                int index = getVictim(heroes.size());
                System.out.println("Index: " + index+ " "+ list.get(i)+ " attacks "+ heroes.get(index)+
                        " for " + attack + " damage.");
                heroes.get(index).damage(attack);
                if(heroes.get(index).isDead()== true){

                    System.out.println(heroes.get(index)+ " has died.");
                    heroes.remove(index);
                }

            }
            if(enemies.size()!=0 && list.get(i).getType()=='h' && !list.get(i).isDead()){
                int attack = list.get(i).getAttack();
                int index = getVictim(enemies.size());
                System.out.println("Index: " + index+ " "+ list.get(i)+ " attacks "+ enemies.get(index)+
                        " for " + attack + " damage.");

                enemies.get(index).damage(attack);
                if(enemies.get(index).isDead()== true){

                    System.out.println( enemies.get(index)+ " has died.");
                    enemies.remove(index);
                }
            }

        }
        if(heroes.size()>0 && enemies.size()==0){
            System.out.println("YOU WINNNNN!!!");

        }
        if(heroes.size() == 0){
            System.out.println("You Loseeeeeee :(");
        }
    }
    public static int getVictim(int size){


        int Max = size;
        int Min =0;
        int index = Min + (int)(Math.random() * ((Max - Min) ));

        return index;

    }
}
