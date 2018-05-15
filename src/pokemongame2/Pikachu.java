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
public class Pikachu extends Pokemon implements Runnable{
	private static final int maxGroupHealth = 200;
	public Pikachu(){
		super("Picachu",
		      (Math.random()*1000) % (maxGroupHealth+1));

		this.attackSkill = PokemonSkill.getPokemonSkill("Thunder Shock");
		this.untimatedSkill = PokemonSkill.getPokemonSkill("Thunderbolt");
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