package guc.game.model.effects;

public class Effect {
	// instance variables
	private String name;
	private int duration;
	private EffectType type;
	
	// constructors
	public Effect(String name, int duration, EffectType type) {
		this.name = name;
		this.duration = duration;
		this.type = type;
	}
	
	public Effect(int duration) {
		this.duration = duration;
	}
	
	// getters and setters
	public String getName() {
		return this.name;
	}
	
	public int getDuration() {
		return this.duration;
	}
	
	public void setDuration(int newDuration) {
		this.duration = newDuration;
	}
	
	public EffectType getType() {
		return this.type;
	}

	public void setType(EffectType type) {
		this.type = type;
	}
	
	// methods
}
