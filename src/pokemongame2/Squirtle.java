/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame2;

import pokemongame2.Movable.Swimmable;

/**
 *
 * @author macbook
 */
public class Squirtle extends Pokemon implements Swimmable {
	private static final int maxGroupHealth = 200;
	public Squirtle(){
		super("Squirtle",
		      (Math.random()*1000) % (maxGroupHealth+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("Bubble");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Water Pluse");
	}

    /**
     *
     */
    @Override
	public void move(){
		this.swim();
	}

        
        public void swim(){
                this.reducedHealth(10);
        }
}
