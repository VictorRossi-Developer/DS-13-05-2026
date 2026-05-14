/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.tipodetriangulo;

/**
 *
 * @author Victor Rossi 2ºDS/AMS
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TipoDeTriangulo extends JFrame {

    private JLabel rotuloLado1, rotuloLado2, rotuloLado3, rotuloResultado;
    private JTextField textoLado1, textoLado2, textoLado3;
    private JButton VerificarTipo;
    private JPanel painelPrincipal;

    public TipoDeTriangulo() {
        setTitle("Tipo de Triângulo");
        setSize(420, 240);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.WHITE);
        painelPrincipal.setLayout(null);
        add(painelPrincipal);

        rotuloLado1 = new JLabel("Lado 1:");
        rotuloLado1.setFont(new Font("Arial", 0, 14));
        rotuloLado1.setBounds(30, 30, 60, 25);
        painelPrincipal.add(rotuloLado1);

        textoLado1 = new JTextField();
        textoLado1.setFont(new Font("Arial", 0, 14));
        textoLado1.setBounds(100, 30, 100, 25);
        painelPrincipal.add(textoLado1);

        rotuloLado2 = new JLabel("Lado 2:");
        rotuloLado2.setFont(new Font("Arial", 0, 14));
        rotuloLado2.setBounds(30, 65, 60, 25);
        painelPrincipal.add(rotuloLado2);

        textoLado2 = new JTextField();
        textoLado2.setFont(new Font("Arial", 0, 14));
        textoLado2.setBounds(100, 65, 100, 25);
        painelPrincipal.add(textoLado2);

        rotuloLado3 = new JLabel("Lado 3:");
        rotuloLado3.setFont(new Font("Arial", 0, 14));
        rotuloLado3.setBounds(30, 100, 60, 25);
        painelPrincipal.add(rotuloLado3);

        textoLado3 = new JTextField();
        textoLado3.setFont(new Font("Arial", 0, 14));
        textoLado3.setBounds(100, 100, 100, 25);
        painelPrincipal.add(textoLado3);

        VerificarTipo = new JButton("Verificar Tipo");
        VerificarTipo.setFont(new Font("Arial", 0, 14));
        VerificarTipo.setBounds(30, 145, 170, 30);
        painelPrincipal.add(VerificarTipo);

        rotuloResultado = new JLabel("");
        rotuloResultado.setFont(new Font("Arial", Font.BOLD, 14));
        rotuloResultado.setBounds(230, 65, 160, 25);
        painelPrincipal.add(rotuloResultado);

        VerificarTipo.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double l1 = Double.parseDouble(textoLado1.getText());
                    double l2 = Double.parseDouble(textoLado2.getText());
                    double l3 = Double.parseDouble(textoLado3.getText());

                    if (l1 <= 0 || l2 <= 0 || l3 <= 0) {
                        rotuloResultado.setText("Valores inválidos");
                        return;
                    }

                    if ((l1 + l2 > l3) && (l1 + l3 > l2) && (l2 + l3 > l1)) {
                        if (l1 == l2 && l2 == l3) {
                            rotuloResultado.setText("Triângulo Equilátero");
                        } else if (l1 == l2 || l1 == l3 || l2 == l3) {
                            rotuloResultado.setText("Triângulo Isósceles");
                        } else {
                            rotuloResultado.setText("Triângulo Escaleno");
                        }
                    } else {
                        rotuloResultado.setText("Não forma triângulo");
                    }

                } catch (NumberFormatException ex) {
                    rotuloResultado.setText("Erro: digite números");
                }
            }
        });
    }
}
