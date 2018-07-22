package com.goldenogre.drakesquest.battlesystem;


import com.goldenogre.drakesquest.com.goldenogre.music.Music;
import entity.Enemy;
import entity.Entity;
import entity.Hero;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;


/**
 * <h3>Drake's Quest Battles System v1.0.0</h3>
 * @author Damian Depuy
 * @version 1.0.0
 *
 */
public class BattleSystem {
	private static ArrayList<Enemy> en;
	private static ArrayList<Hero> he;
	private static ArrayList<Entity>list;
	private static Random rand;
	private static int hAlive;
	private static int eAlive;
	private static int alive;
	private static Scanner input;
	private static int choice;
/**
 * Starts a new battle by opening the menu options
 *  
 * @param h  The list of heroes  
 * @param e  The list of enemies
 */




public BattleSystem(ArrayList<Hero> h, ArrayList<Enemy> e) {
		en = new ArrayList<>(e);
		he = h;
	list = new ArrayList<>();
	for(Entity item : en){
		list.add(item);
	}
	for(Entity item : he){
		list.add(item);
	}
	for(Entity item : list){
		System.out.println(item.toString());
	}
		Music play = new Music();
		play.getBattleMusic();
		Random rand = new Random();
//		hAlive = he.size();
//		eAlive = en.size();
//		alive = hAlive + eAlive;
		System.out.println("Battle Commenced");
		System.out.println("Total(9): " + alive);
		//fight();

	}

	public static void menu() {

		input = new Scanner(System.in);
		System.out.println("enter 1 to fight: ");
		choice = input.nextInt();
		switch (choice) {
		case 1:
			System.out.println("You chose fight");
			//fight();
			break;
		case 2:
			System.out.println("You chose run");
			break;

		default:
			System.out.println("You did something wrong");
			break;
		}
	}

	public static void activateFight() {
		ArrayList<Hero> copyH = new ArrayList<>(he);
		ArrayList<Enemy> copyE = new ArrayList<>(en);
		for(Entity item : en){
			list.add(item);
		}
		for(Entity item : he){
			list.add(item);
		}
		for(Entity item : list){
			System.out.println(item.toString());
		}
		System.out.println("Battle ordering commenced");

		System.out.println(he);
		System.out.println(copyH);
		System.out.println(en);
		System.out.println(copyE);


		int turns = eAlive + hAlive;
		System.out.println("alive: " + alive + " eAlive: " + eAlive + " hAlive: " + hAlive );
		System.out.println("Turns expected: " + turns);
		//int heroes = hAlive;
		//int enemies = eAlive;



		Collections.shuffle(copyH);
		Collections.shuffle(copyE);
		/**
		 * Main loop: used total actors ( heroes and enemies) to determine the length
		 * of the queue. A stack or queue collection would make more sense accept I'm not sure
		 * how to implement a queue for two different objects.
		 */
		for(int i = 0;i<turns;i++) {
			System.out.print("--"+ (i+1)+" ");
			/* If getAcker is true, then hero is select.
			 * False goes to enemy.
			 */
			if(getAttacker()){
				if(copyH.size()==0) {
					/*
					 * Hero was chose, but there's none left.
					 * Enemy must not go.
					 */
					boolean isDead = copyE.get(0).isDead();
					if(!isDead) { // Enemy has life, therefor it can attack.
						int index = getDefender(hAlive);
						int attack = copyE.get(0).getAttack();
						System.out.println(copyE.get(0)+" Enemy Attacks " + he.get(index) + " for " + attack+ ".");
						he.get(index).damage(attack);
						if(he.get(index).isDead()) {
							System.out.println("********** " + he.get(index) + " Died.");
							copyH.remove(index);

							hAlive--;
						}
						copyE.remove(0);
					} else {
						System.out.println( copyE.get(0)+" is dead and can't attack");
					}

				}else {
					/* There is a hero read.
					 *
					 */
					int index = getDefender(eAlive);
					int attack = copyH.get(0).getAttack();
					boolean isDead = he.get(0).isDead();
					if(!isDead) {
						System.out.println(copyH.get(0)+" Hero attacks " + en.get(index) + " for " + attack+".");
						en.get(index).damage(attack);
						if(en.get(index).isDead()) {
							System.out.println("********** " + en.get(index) + " Died.");
							en.remove(index);
							copyE.remove(index);
							eAlive--;
						}
						copyH.remove(0);
					} else { // selected here died earlier that round
						System.out.println(copyH.get(0)+" is dead and can;t attack");
					}

				}
			} else {
				if(copyE.size()==0) {
					int index = getDefender(eAlive);
					int attack = copyH.get(0).getAttack();
					boolean isDead = copyH.get(0).isDead();
					if(!isDead) {
						System.out.println(copyH.get(0)+" Hero attacks " + en.get(index) + " for " + attack+".");
						en.get(index).damage(attack);
						if(en.get(index).isDead()) {
							System.out.println("********** " + en.get(index) + " Died.");
							en.remove(index);
							eAlive--;
						}
						copyH.remove(0);
					} else {
						System.out.println(copyH.get(0)+" is dead and can't fight");
					}

				} else {
					int index = getDefender(hAlive); // Enemy goes first
					int attack = copyE.get(0).getAttack();
					boolean isDead = copyE.get(0).isDead();
					if(!isDead) {
						System.out.println(copyE.get(0)+" Enemy Attacks " + he.get(index) + " for " + attack+ ".");
						he.get(index).damage(attack);
						if(he.get(index).isDead()) {
							System.out.println("********** " + he.get(index) + " Died.");
							he.remove(index);
							hAlive--;
						}
						copyE.remove(0);
					} else {
						System.out.println(copyE.get(0)+ " is dead and can't attack");
					}

				}

			}


		}



		if(eAlive==0 && hAlive>0) {
			System.out.println("You win!");
		}
		if(hAlive==0) {
			System.out.println("Game Over!");

//		} else {
//			fight();
////		}/\
			//menu();
		}
	}
//	public static void createList(ArrayList<Entity>list1, ArrayList<Entity>list){
//
//	}
	public static boolean getAttacker() {
		boolean isHero= false;
		rand = new Random();

		if(rand.nextBoolean()) {

			isHero=true;
		}
		return isHero;
	}
	public static int getDefender(int defenders) {
		int Max = defenders;
		int Min =0;
		int index = Min + (int)(Math.random() * ((Max - Min) ));


		return index;
	}


}
