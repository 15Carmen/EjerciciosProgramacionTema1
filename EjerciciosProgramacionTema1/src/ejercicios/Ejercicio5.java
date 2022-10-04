package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

    /*
     * Dado el siguiente polinomio de segundo grado:
     * y=ax2+bx+c
     * Crea un programa que pida los coeficientes a, b y c, así como el valor de x, y calcula el valor
     * correspondiente de y.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int a, //variable introducida por el usuario que indica uno de los coeficientes del polinomio
            b, //variable introducida por el usuario que indica uno de los coeficientes del polinomio
            c, //variable introducida por el usuario que indica uno de los coeficientes del polinomio
            x, //variable introducida por el usuario que indica el valor de x del polinomio
            y; //variable que indica el resultado del polinomio

        //Declaramos el Scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        /*
         * Le pedimos al usuario que introduzca los coeficientes del polinomio y los guardamos en las variables homónimas
         * declaradas previamente
         */
        System.out.println("Introduzca el coeficiente a del polinomio: ");
        a=sc.nextInt();

        System.out.println("Introduzca el coeficiente b del polinomio: ");
        b=sc.nextInt();

        System.out.println("Introduzca el coeficiente c del polinomio: ");
        c=sc.nextInt();

        /*
         * Le pedimos al usuario que introduzca el valor de x del polinomio y lo guardamos en la variable homónima
         * declarada previamente
         */
        System.out.println("Introduzca el valor de x del polinomio: ");
        x= sc.nextInt();

        //Calculamos el polinomio
        y=((a*x*2)+(b*x)+c);

        //Imprimimos por consola el resultado del polinomio
        System.out.println("El resultado del polinomio y=(("+a+"*"+x+"*2)+("+b+"*"+x+ ")+" +c+ ") es: "+y);

        //Cerramos el scanner
        sc.close();
    }
}
