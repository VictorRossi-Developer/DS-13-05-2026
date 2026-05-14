/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.teoremadepitagoras;

/**
 *
 * @author Victor Rossi 2ºDS/AMS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TeoremaDePitagoras extends JFrame {

    private JLabel rotuloTitulo, rotuloSubtitulo, rotuloA, rotuloB, rotuloC;
    private JTextField textoA, textoB, textoC;
    private JButton Calcular;
    private JPanel painelPrincipal;

    public TeoremaDePitagoras() {
        setTitle("Teorema de Pitágoras");
        setSize(320, 310);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.WHITE);
        painelPrincipal.setLayout(null);
        add(painelPrincipal);

        rotuloTitulo = new JLabel("Teorema de Pitágoras");
        rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        rotuloTitulo.setBounds(60, 10, 200, 25);
        painelPrincipal.add(rotuloTitulo);

        rotuloSubtitulo = new JLabel("c² = a² + b²");
        rotuloSubtitulo.setFont(new Font("Arial", 0, 14));
        rotuloSubtitulo.setBounds(120, 35, 120, 20);
        painelPrincipal.add(rotuloSubtitulo);

        rotuloA = new JLabel("Cateto a");
        rotuloA.setFont(new Font("Arial", 0, 14));
        rotuloA.setBounds(30, 75, 100, 25);
        painelPrincipal.add(rotuloA);

        textoA = new JTextField();
        textoA.setFont(new Font("Arial", 0, 14));
        textoA.setBounds(140, 75, 120, 25);
        painelPrincipal.add(textoA);

        rotuloB = new JLabel("Cateto b");
        rotuloB.setFont(new Font("Arial", 0, 14));
        rotuloB.setBounds(30, 105, 100, 25);
        painelPrincipal.add(rotuloB);

        textoB = new JTextField();
        textoB.setFont(new Font("Arial", 0, 14));
        textoB.setBounds(140, 105, 120, 25);
        painelPrincipal.add(textoB);

        Calcular = new JButton("Calcular");
        Calcular.setFont(new Font("Arial", 0, 14));
        Calcular.setBounds(30, 150, 230, 30);
        painelPrincipal.add(Calcular);

        rotuloC = new JLabel("Hipotenusa c");
        rotuloC.setFont(new Font("Arial", 0, 14));
        rotuloC.setBounds(30, 200, 100, 25);
        painelPrincipal.add(rotuloC);

        textoC = new JTextField();
        textoC.setFont(new Font("Arial", 0, 14));
        textoC.setBounds(140, 200, 120, 25);
        textoC.setEditable(false);
        textoC.setBackground(Color.WHITE);
        painelPrincipal.add(textoC);

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textoA.getText());
                    double b = Double.parseDouble(textoB.getText());

                    if (a <= 0 || b <= 0) {
                        textoC.setText("Erro: <= 0");
                        return;
                    }

                    double c = Math.sqrt((a * a) + (b * b));
                    textoC.setText(String.format("%.2f", c));

                } catch (NumberFormatException ex) {
                    textoC.setText("Erro");
                }
            }
        });
    }
}
