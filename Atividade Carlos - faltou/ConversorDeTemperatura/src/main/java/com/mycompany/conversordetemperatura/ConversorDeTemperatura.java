/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.conversordetemperatura;

/**
 *
 * @author Victor
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorDeTemperatura extends JFrame {

    private JLabel rotuloTitulo, rotuloCelsius, rotuloFahrenheit, rotuloKelvin;
    private JTextField textoCelsius, textoFahrenheit, textoKelvin;
    private JButton Converte;
    private JPanel painelPrincipal;

    public ConversorDeTemperatura() {
        setTitle("Conversor de Temperatura");
        setSize(420, 360);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);

        painelPrincipal = new JPanel();
        painelPrincipal.setBackground(Color.WHITE);
        painelPrincipal.setLayout(null);
        add(painelPrincipal);

        rotuloTitulo = new JLabel("Conversor de Temperatura");
        rotuloTitulo.setFont(new Font("Arial", Font.BOLD, 16));
        rotuloTitulo.setForeground(new Color(0, 0, 150));
        rotuloTitulo.setBounds(100, 20, 220, 25);
        painelPrincipal.add(rotuloTitulo);

        rotuloCelsius = new JLabel("Graus Celsius");
        rotuloCelsius.setFont(new Font("Arial", Font.BOLD, 12));
        rotuloCelsius.setBounds(40, 70, 120, 25);
        painelPrincipal.add(rotuloCelsius);

        textoCelsius = new JTextField();
        textoCelsius.setFont(new Font("Arial", 0, 14));
        textoCelsius.setBounds(180, 70, 120, 25);
        painelPrincipal.add(textoCelsius);

        rotuloFahrenheit = new JLabel("Graus Fahrenheit");
        rotuloFahrenheit.setFont(new Font("Arial", Font.BOLD, 12));
        rotuloFahrenheit.setBounds(40, 115, 120, 25);
        painelPrincipal.add(rotuloFahrenheit);

        textoFahrenheit = new JTextField();
        textoFahrenheit.setFont(new Font("Arial", 0, 14));
        textoFahrenheit.setBounds(180, 115, 120, 25);
        textoFahrenheit.setEditable(false);
        textoFahrenheit.setBackground(Color.WHITE);
        painelPrincipal.add(textoFahrenheit);

        rotuloKelvin = new JLabel("Graus Kelvin");
        rotuloKelvin.setFont(new Font("Arial", Font.BOLD, 12));
        rotuloKelvin.setBounds(40, 160, 120, 25);
        painelPrincipal.add(rotuloKelvin);

        textoKelvin = new JTextField();
        textoKelvin.setFont(new Font("Arial", 0, 14));
        textoKelvin.setBounds(180, 160, 120, 25);
        textoKelvin.setEditable(false);
        textoKelvin.setBackground(Color.WHITE);
        painelPrincipal.add(textoKelvin);

        Converte = new JButton("Converte");
        Converte.setFont(new Font("Arial", 0, 14));
        Converte.setBounds(180, 215, 120, 30);
        painelPrincipal.add(Converte);

        Converte.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double celsius = Double.parseDouble(textoCelsius.getText().replace(",", "."));

                    double kelvin = celsius + 273.15;
                    double fahrenheit = (celsius * 9 / 5) + 32;

                    textoKelvin.setText(String.format("%.2f", kelvin));
                    textoFahrenheit.setText(String.format("%.2f", fahrenheit));

                } catch (NumberFormatException ex) {
                    textoFahrenheit.setText("Erro");
                    textoKelvin.setText("Erro");
                }
            }
        });
    }
}
