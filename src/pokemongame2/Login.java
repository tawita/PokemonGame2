/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongame2;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author macbook
 */
public class Login implements ActionListener{
    private final JLabel label;
    private final JTextField t;
    public Login(){
        Frame f = new Frame("PokemonGame");
        Panel p = new Panel();
        label = new JLabel("name");
        t = new JTextField(15);
        JButton b = new JButton("login");
        b.addActionListener(this);
        p.add(label);
        p.add(t);
        p.add(b);
        f.add(p);
        f.setSize(200,200);
        f.setVisible(true);
        
    }
    public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(new Command(t.getName()),"Wellcome");
        /*JDialog dialog = new JDialog();
        dialog.setTitle("PokemonGame");
        dialog.setSize(300,300);
        dialog.setLocation(300,300);
        JPanel panel = new JPanel();
        String name = t.getText();
        JLabel l = new JLabel("Hello"  + t.getText());
        panel.add(l);
        dialog.getContentPane().add(panel);
        dialog.setVisible(true);*/
        
    }

}


    
