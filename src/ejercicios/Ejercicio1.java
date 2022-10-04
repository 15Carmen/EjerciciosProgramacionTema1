package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio1 {
    /*
     * Realizar un programa que pida como entrada un número con decimales y lo muestre redondeado al entero más próximo.
     * No se puede utilizar el Math.round
     */
    public static void main(String[] args) {

        //Declaramos las variables
        double num;

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Para poder introducir decimales con un punto en vez de una coma cambiamos el uso local al de EEUU
        sc.useLocale(Locale.US);

        //Le pedimos al usuario que introduzca un número con decimales y lo guardamos en la variable previamente declarada
        System.out.println("Introduzca un numero con decimales: ");
        num=sc.nextDouble();

        //Para poder redondear correctamente el número cuando lo casteemos (a partir de 0.5 se redondea al número siguiente),
        // al número introducido le añadimos 0.5
        num+=0.5; //Ejemplos: 2.3+0.5=2.8 se redondea a 2 || 2.7+0.5=3.2 se redondea a 3

        //Imprimimos por consola el numero redondeado casteándoloa int
        System.out.println("El numero introducido redondeado es: "+(int)num);

        //Cerramos el scanner
        sc.close();
    }

}