package model.effects;

import java.util.ArrayList;

import model.abilities.Ability;
import model.world.Champion;
import model.world.Condition;

public class Root extends Effect {

	public Root( int duration) {
		super("Root", duration, EffectType.DEBUFF);
		
	}
	
	public void apply(Champion c) {
		if(c.getCondition() != Condition.INACTIVE) {
			c.setCondition(Condition.ROOTED);
			ArrayList<Effect> effects = c.getAppliedEffects();
			effects.add(this);
		}	
	}

	
	public void remove(Champion c) {
//		if(c.getCondition()==Condition.ROOTED) {
//			c.setCondition(Condition.ACTIVE);
		ArrayList<Effect> effects = c.getAppliedEffects();
		effects.remove(this);
		if (c.getCondition() != Condition.INACTIVE)
			c.setCondition(Condition.ACTIVE);
		if (effects.contains(this))
			c.setCondition(Condition.ROOTED);
	}
}
