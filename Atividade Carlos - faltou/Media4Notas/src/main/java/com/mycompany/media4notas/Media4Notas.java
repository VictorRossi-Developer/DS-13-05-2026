/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.media4notas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author Victor Rossi
 */
public class Media4Notas extends JFrame implements ActionListener {

    JLabel titulo, nota1, nota2, nota3, nota4;
    JTextField texto1, texto2, texto3, texto4;
    JButton somar;
    ImageIcon icone1;

    public Media4Notas() {

        super();

        icone1 = new ImageIcon("add");

        setTitle("Média das quatro notas");

        Container tela = getContentPane();

        tela.setBackground(new Color(187, 240, 255));

        titulo = new JLabel("Calculadora java");
        titulo.setBounds(70, 5, 200, 25);
        titulo.setFont(new Font("Arial", Font.BOLD, 14));

        somar = new JButton(icone1);
        somar.setBounds(35, 110, 50, 30);
        somar.addActionListener(this);

        tela.add(titulo);
        tela.add(somar);

        setSize(350, 250);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
