package com.goldenogre.drakesquest.data;

import entity.Enemy;

import java.util.ArrayList;

public class CreateEnemyGroups {
    private ArrayList<Enemy> impGroup, boss1, boss2,war;


    public CreateEnemyGroups(){

        Enemy enemy_1 = new Enemy("Chaos", 2000,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_2 = new Enemy("Tiamat", 1200,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_3 = new Enemy("Kraken", 1000,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_4 = new Enemy("Marilith", 800,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_5 = new Enemy("Lich", 400,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_6 = new Enemy("Graland", 300,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_7 = new Enemy("Eye", 280,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_8 = new Enemy("Astos", 250,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_9 = new Enemy("Pirate", 220,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_10 = new Enemy("Zombie Dragon", 100,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_11= new Enemy("Warmech", 300,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_12 = new Enemy("Imp", 280,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_13 = new Enemy("Wolf", 250,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_14 = new Enemy("Ogre", 220,5,0,0,0,0,25,
                'a',false);
        Enemy enemy_15 = new Enemy("Ghost", 100,5,0,0,0,0,25,
                'a',false);
        impGroup = new ArrayList<>();
        boss1 = new ArrayList<>();
        boss2 = new ArrayList<>();
        war = new ArrayList<>();
        impGroup.add(enemy_12);
        impGroup.add(enemy_12);
        impGroup.add(enemy_12);
        impGroup.add(enemy_12);
        boss1.add(enemy_1);
        boss1.add(enemy_2);
        boss1.add(enemy_3);
        boss1.add(enemy_4);
        boss1.add(enemy_5);
        boss1.add(enemy_5);
        boss2.add(enemy_6);
        boss2.add(enemy_7);
        boss2.add(enemy_8);
        boss2.add(enemy_9);
        boss2.add(enemy_9);

        war.add(enemy_10);





    }
    public ArrayList<Enemy> getImpGroup(){


        return impGroup;
    }
    public ArrayList<Enemy> getBoss1(){


        return boss1;
    }
    public ArrayList<Enemy> getBoss2(){


        return boss2;
    }
    public ArrayList<Enemy> getWarmech(){


        return war;
    }

}
