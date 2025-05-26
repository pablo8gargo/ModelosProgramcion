/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import wizard.HarryPotter;
import wizard.HermioneGranger;
import wizard.RonWeasley;
import wizard.Wizard;
import spellBehavior.OculusReparo;

/**
 *
 * @author estudiantes
 */
public class Main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Wizard harryPotter = new HarryPotter();
        Wizard hermioneGranger = new HermioneGranger();
        Wizard ronWeasley = new RonWeasley();
        
        System.out.println("Harry Potter es habil en:");
        harryPotter.performSpell();
        
        System.out.println("\nHermione Granger es habil en:");
        hermioneGranger.performSpell();
        System.out.println("Hermione Granger ha cambiado su habilidad a:");
        hermioneGranger.setSpellBehavior(new OculusReparo());
        hermioneGranger.performSpell();
        
        System.out.println("\nRon Weasley es habil en:");
        ronWeasley.performSpell();
        System.out.println("Ron Weasley ha cambiado su habilidad a:");
        ronWeasley.setSpellBehavior(new OculusReparo());
        ronWeasley.performSpell(); 
    }
    
}
