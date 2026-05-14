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

    JLabel rotuloTitulo, rotuloNota1, rotuloNota2, rotuloNota3, rotuloNota4, rotuloResultado;
    JTextField textoNota1, textoNota2, textoNota3, textoNota4, textoResultado;
    JButton Somar;

    public Media4Notas() {
        super();

        setTitle("Média das quatro notas");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);

        Container tela = getContentPane();
        tela.setLayout(null);
        tela.setBackground(new Color(187, 240, 255));

        rotuloTitulo = new JLabel("Calculadora java");
        rotuloTitulo.setBounds(70, 5, 200, 25);
        rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 14));
        tela.add(rotuloTitulo);

        rotuloNota1 = new JLabel("Nota 1");
        rotuloNota1.setFont(new Font("Arial", 0, 14));
        rotuloNota1.setBounds(30, 40, 100, 25);
        tela.add(rotuloNota1);

        textoNota1 = new JTextField();
        textoNota1.setFont(new Font("Arial", 0, 14));
        textoNota1.setBounds(140, 40, 120, 25);
        tela.add(textoNota1);

        rotuloNota2 = new JLabel("Nota 2");
        rotuloNota2.setFont(new Font("Arial", 0, 14));
        rotuloNota2.setBounds(30, 70, 100, 25);
        tela.add(rotuloNota2);

        textoNota2 = new JTextField();
        textoNota2.setFont(new Font("Arial", 0, 14));
        textoNota2.setBounds(140, 70, 120, 25);
        tela.add(textoNota2);

        rotuloNota3 = new JLabel("Nota 3");
        rotuloNota3.setFont(new Font("Arial", 0, 14));
        rotuloNota3.setBounds(30, 100, 100, 25);
        tela.add(rotuloNota3);

        textoNota3 = new JTextField();
        textoNota3.setFont(new Font("Arial", 0, 14));
        textoNota3.setBounds(140, 100, 120, 25);
        tela.add(textoNota3);

        rotuloNota4 = new JLabel("Nota 4");
        rotuloNota4.setFont(new Font("Arial", 0, 14));
        rotuloNota4.setBounds(30, 130, 100, 25);
        tela.add(rotuloNota4);

        textoNota4 = new JTextField();
        textoNota4.setFont(new Font("Arial", 0, 14));
        textoNota4.setBounds(140, 130, 120, 25);
        tela.add(textoNota4);

        Somar = new JButton("Somar");
        Somar.setFont(new Font("Arial", 0, 14));
        Somar.setBounds(30, 170, 230, 30);
        Somar.addActionListener(this);
        tela.add(Somar);

        rotuloResultado = new JLabel("Média");
        rotuloResultado.setFont(new Font("Arial", 0, 14));
        rotuloResultado.setBounds(30, 210, 100, 25);
        tela.add(rotuloResultado);

        textoResultado = new JTextField();
        textoResultado.setFont(new Font("Arial", 0, 14));
        textoResultado.setBounds(140, 210, 120, 25);
        textoResultado.setEditable(false);
        textoResultado.setBackground(Color.WHITE);
        tela.add(textoResultado);

        setSize(320, 300);
        setLocationRelativeTo(null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == Somar) {
            try {
                double n1 = Double.parseDouble(textoNota1.getText().replace(",", "."));
                double n2 = Double.parseDouble(textoNota2.getText().replace(",", "."));
                double n3 = Double.parseDouble(textoNota3.getText().replace(",", "."));
                double n4 = Double.parseDouble(textoNota4.getText().replace(",", "."));

                double media = (n1 + n2 + n3 + n4) / 4.0;
                textoResultado.setText(String.format("%.2f", media));

            } catch (NumberFormatException ex) {
                textoResultado.setText("Erro");
            }
        }
    }
}
