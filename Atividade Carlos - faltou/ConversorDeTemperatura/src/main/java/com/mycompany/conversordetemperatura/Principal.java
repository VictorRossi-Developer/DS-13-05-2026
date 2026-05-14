/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.conversordetemperatura;

/**
 *
 * @author Victor
 */
import javax.swing.SwingUtilities;

public class Principal {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversorDeTemperatura().setVisible(true);
            }
        });
    }
}