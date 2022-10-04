package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {
    /*
     * Crea un programa que pida la base y la altura de un triángulo y muestre su área. (AT = base*altura/2)
     */
    public static void main(String[] args) {
        //Declaramos las variables
        int base, //variable introducida por el usuario que indica la base del triángulo
            altura; //variable introducida por el usuario que indica la altura del triángulo
        double area; //variable que será el resultado de la operación para saber el área del triángulo

        //Declaramos el Scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //parece que funciona, este es otro pequeño cambio

        /*
         * Le pedimos al usuario que introduzca la base del triángulo y lo guardamos en la variable homónima
         * declarada previamente
         */
        System.out.println("Introduzca la base del triangulo: ");
        base=sc.nextInt();

        /*
         * Le pedimos al usuario que introduzca la altura del triángulo y lo guardamos en la variable homónima
         * declarada previamente
         */
        System.out.println("Introduzca la base del triangulo: ");
        altura=sc.nextInt();

        //Calculamos el área del triángulo multiplicando la base por la altura y dividiendo ese resultado entre 2
        area=(base*altura)/2;

        //Imprimimos por consola el area del triángulo
        System.out.println("El area del triangulo es: "+area);

        //Cerramos el scanner
        sc.close();

    }
}
