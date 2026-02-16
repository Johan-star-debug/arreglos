package co.edu.uniquindio;

import javax.swing.*;

public class CantidaddeNotas {

    public static void main(String[] args) {
        double[] notas;
        
        // Preguntar si se desean usar los datos quemados (hardcoded) para pruebas rápidas
        int opcion = JOptionPane.showConfirmDialog(null, "¿Desea usar las notas de prueba (5, 3, 1, 4, 2)?", "Modo de Prueba", JOptionPane.YES_NO_OPTION);

        if (opcion == JOptionPane.YES_OPTION) {
            notas = new double[]{5.0, 3.0, 1.0, 4.0, 2.0};
        } else {
            int cantidadN = Integer.valueOf(JOptionPane.showInputDialog("ingrese el número de notas"));
            notas = new double[cantidadN];
            for (int i = 0; i < cantidadN; i++) {
                notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota " + (i + 1)));
            }
        }

        // Ordenar las notas usando el Metodo burbuja
        ordenarBurbuja(notas);

        // Mostrar notas ordenadas
        String mensaje = "Notas ordenadas: ";
        for (double nota : notas) {
            mensaje += nota + " ";
        }
        JOptionPane.showMessageDialog(null, mensaje);

        double notaDefinitiva = calcularNotaDefinitiva(notas);
        String estado = notaDefinitiva >= 3.0 ? "Aprobado" : "Reprobado";
        double notaMayor = obtenerMayor(notas);
        double notaMenor = obtenerMenor(notas);

        JOptionPane.showMessageDialog(null, "Definitiva: " + notaDefinitiva + 
                "\nEstado: " + estado +
                "\nMayor: " + notaMayor 
                + "\nMenor: " + notaMenor);
    }

    private static void ordenarBurbuja(double[] notas) {
        for (int i = 0; i < notas.length - 1; i++) {
            for (int j = 0; j < notas.length - 1 - i; j++) {
                if (notas[j] > notas[j + 1]) {
                    double temp = notas[j];
                    notas[j] = notas[j + 1];
                    notas[j + 1] = temp;
                }
            }
        }
    }

    private static double obtenerMayor(double[] notas) {
        double mayor = notas[0];
        for (int i = 0; i < notas.length; i++)
            if (notas[i] > mayor) mayor = notas[i];
        return mayor;
    }

    private static double calcularNotaDefinitiva(double[] notas) {
        double suma = 0;
        for (int i = 0; i < notas.length; i++) {
            suma += notas[i];
        }
        return suma / notas.length;
    }

    private static double obtenerMenor(double[] notas) {
        double menor = notas[0];
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < menor) menor = notas[i];
        }
        return menor;
    }
}