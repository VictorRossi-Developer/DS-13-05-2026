/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.calculadoraimc;

/**
 *
 * @author Victor
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraIMC extends JFrame {

    private JLabel rotuloTitulo, rotuloPeso, rotuloAltura, rotuloResultado, rotuloStatus;
    private JTextField textoPeso, textoAltura, textoResultado, textoStatus;
    private JButton CalcularIMC;
    private JPanel painelPrincipal;

    public CalculadoraIMC() {
        setTitle("Cálculo de IMC");
        setSize(320, 340);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.WHITE);
        painelPrincipal.setLayout(null);
        add(painelPrincipal);

        rotuloTitulo = new JLabel("Controle de IMC");
        rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 18));
        rotuloTitulo.setBounds(90, 10, 200, 25);
        painelPrincipal.add(rotuloTitulo);

        rotuloPeso = new JLabel("Peso (kg)");
        rotuloPeso.setFont(new Font("Arial", 0, 14));
        rotuloPeso.setBounds(30, 60, 100, 25);
        painelPrincipal.add(rotuloPeso);

        textoPeso = new JTextField();
        textoPeso.setFont(new Font("Arial", 0, 14));
        textoPeso.setBounds(140, 60, 120, 25);
        painelPrincipal.add(textoPeso);

        rotuloAltura = new JLabel("Altura (m)");
        rotuloAltura.setFont(new Font("Arial", 0, 14));
        rotuloAltura.setBounds(30, 95, 100, 25);
        painelPrincipal.add(rotuloAltura);

        textoAltura = new JTextField();
        textoAltura.setFont(new Font("Arial", 0, 14));
        textoAltura.setBounds(140, 95, 120, 25);
        painelPrincipal.add(textoAltura);

        CalcularIMC = new JButton("Calcular IMC");
        CalcularIMC.setFont(new Font("Arial", 0, 14));
        CalcularIMC.setBounds(30, 135, 230, 30);
        painelPrincipal.add(CalcularIMC);

        rotuloResultado = new JLabel("IMC");
        rotuloResultado.setFont(new Font("Arial", 0, 14));
        rotuloResultado.setBounds(30, 185, 100, 25);
        painelPrincipal.add(rotuloResultado);

        textoResultado = new JTextField();
        textoResultado.setFont(new Font("Arial", 0, 14));
        textoResultado.setBounds(140, 185, 120, 25);
        textoResultado.setEditable(false);
        textoResultado.setBackground(Color.WHITE);
        painelPrincipal.add(textoResultado);

        rotuloStatus = new JLabel("Status");
        rotuloStatus.setFont(new Font("Arial", 0, 14));
        rotuloStatus.setBounds(30, 220, 100, 25);
        painelPrincipal.add(rotuloStatus);

        textoStatus = new JTextField();
        textoStatus.setFont(new Font("Arial", 0, 14));
        textoStatus.setBounds(140, 220, 120, 25);
        textoStatus.setEditable(false);
        textoStatus.setBackground(Color.WHITE);
        painelPrincipal.add(textoStatus);

        CalcularIMC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double peso = Double.parseDouble(textoPeso.getText().replace(",", "."));
                    double altura = Double.parseDouble(textoAltura.getText().replace(",", "."));

                    if (peso <= 0 || altura <= 0) {
                        textoResultado.setText("Erro");
                        textoStatus.setText("Dados inválidos");
                        return;
                    }

                    double imc = peso / (altura * altura);
                    textoResultado.setText(String.format("%.2f", imc));

                    if (imc < 18.5) {
                        textoStatus.setText("abaixo do Peso");
                    } else if (imc >= 18.5 && imc <= 24.99) {
                        textoStatus.setText("peso ideal");
                    } else {
                        textoStatus.setText("está acima do peso ideal");
                    }

                } catch (NumberFormatException ex) {
                    textoResultado.setText("Erro");
                    textoStatus.setText("Insira números");
                }
            }
        });
    }
}
