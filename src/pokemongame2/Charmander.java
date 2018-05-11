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
public class Charmander extends Pokemon implements Runnable{
    private static final int maxGroupHealth = 200;
	public Charmander(){
		super("Charmander",
		      (Math.random()*1000) % (maxGroupHealth+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("Ember");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Flame Burst");
	}

        @Override
	public void move(){
		this.run();
	}

	public void run(){
		this.reducedHealth(10);
	}

	public void walk(){
		this.reducedHealth(1);
	}
}
