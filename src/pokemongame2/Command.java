/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame2;
import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 *
 * @author macbook
 */
public class Command extends JFrame{    
    ArrayList<Pokemon> pokemons = new ArrayList<>();
    JPanel p1,showData;
    JLabel txtSelect,pokemonIcon;
    JTextField jTextField; 
    JButton newPokemon,eat,battle;
    JTextArea printProFile;
    Icon dataIcon0,dataIcon1,dataIcon2,dataIconStart;
    JComboBox select;
    int squirtle,pikachu,charmander;
    String name;
    
    public static void printPokemons(ArrayList<Pokemon> pokemons){
		System.out.println("===== Pokemon List =====");
                pokemons.forEach((pokemon) -> {
                    System.out.println("Pokemon "+pokemon.getName()+" health: "+pokemon.getHealth()+"/"+pokemon.maxHealth);
        });
    }
    public static String printStatus(ArrayList<Pokemon> pokemons,int index){
        return  pokemons.get(index).getName()+" health: "+pokemons.get(index).getHealth()+"/"+pokemons.get(index).maxHealth;
              
    }

    public void eatBerry(int index){
            Berry berry = new Berry(0);
            pokemons.get(index).eat(berry);
            printProFile.setText(printPokemons(pokemons,index));
    }

    
    public Command(String name ){
        super("PokemonGame2");
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        String pokemonName[] = {
            "Squirtle", 
            "Pikachu", 
            "Charmander"      
        };
        this.name = name;
        select = new JComboBox(pokemonName);
        select.setPreferredSize(new Dimension(150,20));
        
        p1 = new JPanel();
        p1.setLayout(new FlowLayout());
        showData = new JPanel();
        showData.setLayout(new FlowLayout());
        
        
        printProFile = new JTextArea("",20,20);
        dataIconStart= new ImageIcon(getClass().getResource("pokemon.png"));
        dataIcon0 = new ImageIcon(getClass().getResource("squirtle.png"));
        dataIcon1 = new ImageIcon(getClass().getResource("pikachu.png"));
        dataIcon2 = new ImageIcon(getClass().getResource("charmander.png"));
        pokemonIcon = new JLabel("");
        pokemonIcon.setIcon(dataIconStart);
         
        txtSelect = new JLabel("Select Pokemon : ");
        newPokemon = new JButton("STATUS");
        eat = new JButton("EAT");
        battle = new JButton("BATTLE");
        
        //event
        newPokemon.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (select.getSelectedIndex()) {
                    case 0:
                        pokemonIcon.setIcon(dataIcon0);
                        pokemons.add(new Squirtle());
                        squirtle = 0;
                        printProFile.setText(printStatus(pokemons,0));
                        System.out.print("Squirtle"+select.getSelectedIndex());
                        break;
                    case 1:
                        pokemonIcon.setIcon(dataIcon1);
                        pokemons.add(new Pikachu());
                        pikachu = 1;
                        printProFile.setText(printStatus(pokemons,1));
                        System.out.print("Pikachu"+select.getSelectedIndex());
                        break;
                    case 2:
                        pokemonIcon.setIcon(dataIcon2);
                        pokemons.add(new Charmander());
                        charmander = 2;
                        printProFile.setText(printStatus(pokemons,2));
                        System.out.print("Charmander"+select.getSelectedIndex());
                        break;
                    default:
                        break;
                }
            }
        });
        
        eat.addActionListener((ActionEvent e) -> {
            switch (select.getSelectedIndex()) {
                case 0:
                    pokemonIcon.setIcon(dataIcon0);
                    eatBerry(squirtle);
                    System.out.print("Squirtle eat"+ select.getSelectedIndex());
                    break;
                case 1:
                    pokemonIcon.setIcon(dataIcon1);
                    eatBerry(pikachu);
                    System.out.print("Pikachu eat"+ select.getSelectedIndex());
                    break;
                case 2:
                    pokemonIcon.setIcon(dataIcon2);
                    eatBerry(charmander);
                    System.out.print("Charmander eat"+ select.getSelectedIndex());
                    break;
                default:
                    break;
            }
        });
        
        battle.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (select.getSelectedIndex()) {
                    case 0:
                        pokemonIcon.setIcon(dataIcon0);
                        Pokemon red = pokemons.get(squirtle);
                        Pokemon blue = pokemons.get(pikachu);
                        red.attack(blue);
                        blue.attack(red);
                        printProFile.setText(printPokemons(pokemons,charmander));
                        break;
              }
            }
        });

        p1.add(txtSelect);
        p1.add(select);
        p1.add(newPokemon);
        p1.add(eat);
        p1.add(battle);
        showData.add(pokemonIcon);
        showData.add(printProFile);
        c.add(showData, BorderLayout.PAGE_START);
        c.add(p1, BorderLayout.CENTER);

        
        //setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        c.setSize(1000,1000);
        pack();
        setVisible(true);
    }    
}   

