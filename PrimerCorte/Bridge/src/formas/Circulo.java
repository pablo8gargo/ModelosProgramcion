/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package formas;

import colores.Color;
/**
 *
 * @author orlag_nzyjv2m
 */

public class Circulo implements Forma {
    @Override
    public void dibujar() {
        System.out.println("Dibujando círculo");
    }
    @Override
    public void colorear(Color color) {
        color.colorear();
    }
}
