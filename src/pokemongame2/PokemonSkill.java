/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame2;

/**
 *
 * @author macbook
 */
public class PokemonSkill{
	private final String name;
	private final float damage;

	public PokemonSkill(String name, float damage){
		this.name = name;
		this.damage = damage;
	}

	public String getName(){
		return this.name;
	}

	public float getDamage(){
		return this.damage;
	}

	public static PokemonSkill getPokemonSkill(String name){
		PokemonSkill skill = null;
		switch(name.toLowerCase()){
			case "thunder shock":
				skill = new PokemonSkill("Thunder Shock", 40);
				break;
			case "thunderbolt":
				skill = new PokemonSkill("Thunderbolt", 90);
				break;
			case "bubble":
				skill = new PokemonSkill("Bubble", 10);
				break;
			case "water pulse":
				skill = new PokemonSkill("Water Pulse", 100);
				break;
                        case "ember":
				skill = new PokemonSkill("Ember", 10);
				break;
                        case "flame burst":
				skill = new PokemonSkill("Flame Burst", 10);
				break;
		}
		return skill;
	}
}

