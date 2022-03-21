package guc.game.model.world;

import java.util.ArrayList;

import guc.game.model.abilities.Ability;

public class Hero extends Champion {

	public Hero(String name, int maxHP, int mana, int maxActions, int speed, int attackRange, int attackDamage, ArrayList<Ability> abilities) {
		super(name, maxHP, mana, maxActions, speed, attackRange, attackDamage, abilities);
	}
	
}
