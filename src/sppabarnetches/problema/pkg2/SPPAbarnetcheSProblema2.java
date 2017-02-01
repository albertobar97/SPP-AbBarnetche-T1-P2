/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sppabarnetches.problema.pkg2;

import java.util.Scanner;

java.util.scanner

/**
 *
 * @author albertobarnetche
 */
public class SPPAbarnetcheSProblema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic// Calcular perimetro y area de un rectangulo
        double lado, altura, area, perimetro;
        Scanner entradaDato = new Scanner(System.in);
        System.out.println("Ingresa el valor del lado del rectangulo:");
        lado = entradaDato.nextDouble();
        System.out.println("Introduce el valor de la altura del trianguo:");
        altura = entradaDato.nextDouble();
        area = lado*altura;
        perimetro = (2*lado) + (2*altura);
        System.out.println("Area del rectangulo: " + area);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }
     here
    }
    
}
