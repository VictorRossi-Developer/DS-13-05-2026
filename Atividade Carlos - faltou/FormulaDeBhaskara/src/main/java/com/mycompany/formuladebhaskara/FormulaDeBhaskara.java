/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.formuladebhaskara;

/**
 *
 * @author Victor Rossi 2ºDS/AMS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormulaDeBhaskara extends JFrame {

    private JLabel rotuloTitulo, rotuloSubtitulo, rotuloA, rotuloB, rotuloC, rotuloX1, rotuloX2;
    private JTextField textoA, textoB, textoC, textoX1, textoX2;
    private JButton Calcular;
    private JPanel painelPrincipal;

    public FormulaDeBhaskara() {
        setTitle("Fórmula de Bhaskara");
        setSize(320, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.WHITE);
        painelPrincipal.setLayout(null);
        add(painelPrincipal);

        rotuloTitulo = new JLabel("Fórmula de Bhaskara");
        rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        rotuloTitulo.setBounds(60, 10, 200, 25);
        painelPrincipal.add(rotuloTitulo);

        rotuloSubtitulo = new JLabel("ax² + bx + c = 0");
        rotuloSubtitulo.setFont(new Font("Arial", 0, 14));
        rotuloSubtitulo.setBounds(100, 35, 120, 20);
        painelPrincipal.add(rotuloSubtitulo);

        rotuloA = new JLabel("Valor de a");
        rotuloA.setFont(new Font("Arial", 0, 14));
        rotuloA.setBounds(30, 75, 100, 25);
        painelPrincipal.add(rotuloA);

        textoA = new JTextField();
        textoA.setFont(new Font("Arial", 0, 14));
        textoA.setBounds(140, 75, 120, 25);
        painelPrincipal.add(textoA);

        rotuloB = new JLabel("Valor de b");
        rotuloB.setFont(new Font("Arial", 0, 14));
        rotuloB.setBounds(30, 105, 100, 25);
        painelPrincipal.add(rotuloB);

        textoB = new JTextField();
        textoB.setFont(new Font("Arial", 0, 14));
        textoB.setBounds(140, 105, 120, 25);
        painelPrincipal.add(textoB);

        rotuloC = new JLabel("Valor de c");
        rotuloC.setFont(new Font("Arial", 0, 14));
        rotuloC.setBounds(30, 135, 100, 25);
        painelPrincipal.add(rotuloC);

        textoC = new JTextField();
        textoC.setFont(new Font("Arial", 0, 14));
        textoC.setBounds(140, 135, 120, 25);
        painelPrincipal.add(textoC);

        Calcular = new JButton("Calcular");
        Calcular.setFont(new Font("Arial", 0, 14));
        Calcular.setBounds(30, 175, 230, 30);
        painelPrincipal.add(Calcular);

        rotuloX1 = new JLabel("x'");
        rotuloX1.setFont(new Font("Arial", 0, 14));
        rotuloX1.setBounds(100, 215, 30, 25);
        painelPrincipal.add(rotuloX1);

        textoX1 = new JTextField();
        textoX1.setFont(new Font("Arial", 0, 14));
        textoX1.setBounds(140, 215, 120, 25);
        textoX1.setEditable(false);
        textoX1.setBackground(Color.WHITE);
        painelPrincipal.add(textoX1);

        rotuloX2 = new JLabel("x''");
        rotuloX2.setFont(new Font("Arial", 0, 14));
        rotuloX2.setBounds(100, 245, 30, 25);
        painelPrincipal.add(rotuloX2);

        textoX2 = new JTextField();
        textoX2.setFont(new Font("Arial", 0, 14));
        textoX2.setBounds(140, 245, 120, 25);
        textoX2.setEditable(false);
        textoX2.setBackground(Color.WHITE);
        painelPrincipal.add(textoX2);

        Calcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double a = Double.parseDouble(textoA.getText());
                    double b = Double.parseDouble(textoB.getText());
                    double c = Double.parseDouble(textoC.getText());

                    if (a == 0) {
                        textoX1.setText("Erro: a=0");
                        textoX2.setText("Erro: a=0");
                        return;
                    }

                    double delta = (b * b) - (4 * a * c);

                    if (delta < 0) {
                        textoX1.setText("Sem real");
                        textoX2.setText("Sem real");
                    } else {
                        double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                        double x2 = (-b - Math.sqrt(delta)) / (2 * a);

                        textoX1.setText(String.format("%.0f", x1));
                        textoX2.setText(String.format("%.0f", x2));
                    }

                } catch (NumberFormatException ex) {
                    textoX1.setText("Erro");
                    textoX2.setText("Erro");
                }
            }
        });
    }
}

//Lembrar de perguntar sobre sites bons que explicam Java