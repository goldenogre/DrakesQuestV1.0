package com.goldenogre.drakesquest.battlesystem;


import entity.Enemy;
import entity.Hero;

public class Battle {
	
	private static Enemy en;
	
	
	public Battle(Enemy enemy, int enemies, Hero hero, int heroes) {
		en = enemy;
		int enemyCount = enemies;
		int heroesCount = heroes;
		int totalCount = enemies + heroes;
		//ArrayList<Integer>list = new ArrayList<Integer>();
		String[] who = new String[totalCount]; 
		
//		for(int i=1;i<=totalCount;i++) {
//			list.add(i);
//		}
		//System.out.println("Order: " + list.toString());
		//Collections.shuffle(list);
		System.out.println("Battle initiated: ");
		System.out.println("Enemies: " + enemyCount);
		System.out.println(heroesCount > 1 ? "Heroes: " + heroesCount: "Hero: 1" );
		// System.out.println("Enemy: " + enemy.getName() );
		//System.out.println("Hero: " + hero.getName());
		System.out.println("Recieved " + attack() + " damage.");
	}
	public static void initTurn(int[]battle) {
		
//		for(int i = 0; i<battle.length;i++) {
//			if(battle[i]==)
//		}
	}
	public static int attack() {
		int damage = en.getAttack();
		
		System.out.print("Attacking.....");
		return damage;
	}
	
}
