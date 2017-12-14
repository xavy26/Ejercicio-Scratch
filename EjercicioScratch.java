/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Estudiantes;

import javax.swing.JOptionPane;

/**
 *
 * @author Paredes
 */
public class EjercicioScratch {

    public static void main(String[] args) {

        int h, x, y;

        h = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de h"));
        x = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de x"));
        y = Integer.parseInt(JOptionPane.showInputDialog("Ingresar el valor de y"));

        double areacirculo = (((x - y) * h) / 2);
        if (areacirculo < 0) {
            areacirculo = areacirculo * (-1);
        }
        double arearectangulo = h * (y - (h / 2));
        double areatriangulo = (3.14 * (Math.pow((h / 2), 2))) / 2;

        double areatotal = areacirculo + areatriangulo + arearectangulo;

        double percirculo = 2 * 3.14 * (h / 2);
        double perrectangulo = 2 * h + 2 + (y - (h / 2));
        double pertriangulo = (x - y) + h + Math.sqrt((Math.pow((x - y), 2)) + Math.pow(h, 2));

        double perimetrototal = percirculo + pertriangulo + perrectangulo;

        System.out.println("Área circulo: " + areacirculo);
        System.out.println("Área triangulo: " + areatriangulo);
        System.out.println("Área rectangulo: " + arearectangulo);

        System.out.println("Área total: " + areatotal);

        System.out.println("Perímetro circulo: " + percirculo);
        System.out.println("Perímetro rectangulo: " + perrectangulo);
        System.out.println("Perímetro triangulo: " + pertriangulo);

        System.out.println("Perímetro total: " + perimetrototal);
    }
}
