package Controleur;

import Model.Game;
import Vue.Fenetre;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Florian Vaissiere on 22/11/2016.
 */
public class ControlFenetreAccueil extends Control implements ActionListener {

    public ControlFenetreAccueil(Fenetre fenetre, Game game){
        super(fenetre, game);
        fenetre.setControlFenetreAccueil(this);
    }
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "Jouer":
                if(!automate.isRun()){
                    automate.auto();
                }
                fenetre.setContentPane(fenetre.panelFenetrePlateau);
                fenetre.barreMenu.setVisible(true);
                changerVue();
                break;

            case "Credits":
                fenetre.setContentPane(fenetre.panelFenetreCredits);
                fenetre.barreMenu.setVisible(false);
                changerVue();
                break;

            case "Quitter":
                System.exit(0);
                break;
        }
    }
}


