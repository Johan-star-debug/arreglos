package co.edu.uniquindio;

import javax.swing.*;

public class CantidadN {

    public static void main(String[] args) {
        int cantidadN = Integer.valueOf(JOptionPane.showInputDialog("ingrese el número de notas"));

        double[] notas = new double[cantidadN];
        notas[0] = 0.0;
        notas[1] = 0.0;
        notas[2] = 0.0;
        for (int i = 0; i < cantidadN; i++) {

        }
        double NotaDefinitiva = CalcularNotaDefinitiva(notas);
        double CalcularNotaDefinitiva;
        double[] nota;
        {
            double notaMayor = obtenerMayor(notas);
            double notaMenor = obtenerMenor(notas);
        }


        double notaDefinitiva = 0.0;
        double suma = 0;

        for (int i = 0; i < cantidadN; i++) {

        }
    }


    private static double obtenerMenor(double[] notas) {


    }

    private static double obtenerMayor(double[] notas) {
    }

    private static double CalcularNotaDefinitiva(double[] notas) {
    }


}
