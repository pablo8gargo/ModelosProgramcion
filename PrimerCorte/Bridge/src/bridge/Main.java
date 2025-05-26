/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bridge;

import colores.Azul;
import colores.Rojo;
import formas.Cuadrado;
import formas.Forma;

/**
 *
 * @author orlag_nzyjv2m
 */
public class Main {

    public static void main(String[] args) {
        Forma cuadrado = new Cuadrado();
        cuadrado.dibujar();
        cuadrado.colorear(new Azul());
        cuadrado.colorear(new Rojo());
    }
    
}
