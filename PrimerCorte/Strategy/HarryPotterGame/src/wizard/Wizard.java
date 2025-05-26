/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package wizard;

import spellBehavior.SpellBehavior;

/**
 *
 * @author estudiantes
 */
public abstract class Wizard {
    SpellBehavior spellBehavior;
    
    public void performSpell(){
        spellBehavior.spell();
    }

    public void setSpellBehavior(SpellBehavior spellBehavior) {
        this.spellBehavior = spellBehavior;
    }
    
    
}
