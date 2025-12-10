/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejercicio8_5;

/**
 *
 * @author Mateo
 */
public class Habitacion {
    private int númeroHabitación; /* Atributo que indica el número de
    la habitación */
    private boolean disponible; /* Atributo que indica la disponibilidad
    de la habitación */
    private double precioDía; 
    public Habitación(int númeroHabitación, boolean disponible,
        double precioDía) {
        this.númeroHabitación = númeroHabitación;
        this.disponible = disponible;
        this.precioDía = precioDía;
    }
}
