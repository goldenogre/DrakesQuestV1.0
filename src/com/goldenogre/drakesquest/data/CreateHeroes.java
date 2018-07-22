package com.goldenogre.drakesquest.data;

import entity.Hero;

import java.util.ArrayList;

public class CreateHeroes {
    private ArrayList<Hero> party;
    public CreateHeroes(){
        party = new ArrayList();
        Hero player01 = new Hero("Fighter", 500,250,0,0,0,0,
                0,'h', false);
        Hero player02 = new Hero("Red Mage", 8150,130,0,0,0,0,
                0,'h', false);
        Hero player03 = new Hero("White Mage", 9120,121,8,0,0,0,
                0,'h', false);
        Hero player04 = new Hero("Black Mage", 9590,150,5,0,0,0,
                0,'h', false);
        party.add(player01);
        party.add(player02);
        party.add(player03);
        party.add(player04);
    }
    public ArrayList<Hero> getParty(){
        return party;
    }



}
