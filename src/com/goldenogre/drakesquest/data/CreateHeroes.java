package com.goldenogre.drakesquest.data;

import entity.Hero;

import java.util.ArrayList;

public class CreateHeroes {
    private ArrayList<Hero> party;
    public CreateHeroes(){
        party = new ArrayList();
        Hero player01 = new Hero("Fighter", 200,20,0,0,0,0,
                0,'a', false);
        Hero player02 = new Hero("Red Mage", 150,13,0,0,0,0,
                0,'a', false);
        Hero player03 = new Hero("White Mage", 120,12,8,0,0,0,
                0,'a', false);
        Hero player04 = new Hero("Black Mage", 90,10,5,0,0,0,
                0,'a', false);
        party.add(player01);
        party.add(player02);
        party.add(player03);
        party.add(player04);
    }
    public ArrayList<Hero> getParty(){
        return party;
    }



}
