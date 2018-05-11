/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame2;
import java.util.*;

/**
 *
 * @author macbook
 */
public class PokemonGame2{
	public static void printPokemons(ArrayList<Pokemon> pokemons){
		System.out.println("===== Pokemon List =====");
                pokemons.forEach((pokemon) -> {
                    System.out.println("Pokemon "+pokemon.getName()+" health: "+pokemon.getHealth()+"/"+pokemon.maxHealth);
            });
	}

	public static void main(String args[]){
		ArrayList<Pokemon> pokemons = new ArrayList<>();
		for(int i=0; i<5; ++i){
			pokemons.add(new Squirtle());
		}
                
                for(int i=0; i<5; ++i){
			pokemons.add(new Pikachu());
		}
                for(int i=0; i<5; ++i){
			pokemons.add(new Charmander());
		}

		printPokemons(pokemons);
		System.out.println("\nPokemon Exercies ... ");
                pokemons.forEach((pokemon) -> {
                    pokemon.move();
            });

		System.out.println("\nPokemon List After Exercies ... ");
		printPokemons(pokemons);

		System.out.println("\nPokemon Battle ... ");
		Pokemon pokemon1 = pokemons.get(0);
		Pokemon pokemon2 = pokemons.get(1);
		pokemon1.attack(pokemon2);

		
		System.out.println("\nPokemon List After Attack ... ");
		printPokemons(pokemons);

		System.out.println("\nPokemon Eat ... ");
		Berry berry = new Berry(0);
                pokemons.forEach((pokemon) -> {
                    pokemon.eat(berry);
            });

		System.out.println("\nPokemon List After Ate ... ");
		printPokemons(pokemons);
                
            new Login();
	}
}

