package ejercicios;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio10 {
    /**
     * La FILA (Federación Internacional de Lanzamiento de Algoritmo) realiza una competición donde cada participante
     * escribe un algoritmo en un papel y lo lanza, ganando quien consiga lanzarlo más lejos. La peculiaridad del
     * concurso es que la longitud del lanzamiento se mide en metros (con tantos decimales como se desee), pero para
     * el ranking solo se tiene en cuenta la longitud en centímetros (sin decimales). Por ejemplo, para un lanzamiento
     * de 12,3456 m, que son 1234,56 cm solo se contabilizan 1234 cm.
     * Realiza un programa que solicite la longitud (en metros) de un lanzamiento y muestre la parte entera
     * correspondiente en centímetros. Utiliza la conversión de tipos.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        double metros; //Variable donde guardaremos los metros introducidos por el usuario
        double centimetros; //Variable que calcularemos una vez sepamos los metros introducidos

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Para poder introducir decimales con un punto en vez de una coma cambiamos el uso local al de EEUU
        sc.useLocale(Locale.US);

        //Le pedimos al usuario que introduzca una longitud cualquiera en metros y lo guardamos en la variable homónima
        System.out.println("Introduzca la longitud en metros del lanzamiento: ");
        metros=sc.nextDouble();

        //Calculamos a cuantos centimetros equivalen esos metros multiplicándolos por 100
        centimetros=metros*100;

        //Imprimimos los resultados
        System.out.println("El papel ha recorrido "+ (int)centimetros +" centimetros");

        //Cerramos el scanner
        sc.close();
    }
}
