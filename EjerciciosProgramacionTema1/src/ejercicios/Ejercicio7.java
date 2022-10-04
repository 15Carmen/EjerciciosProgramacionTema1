package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {
    /**
     * Solicita al usuario tres distancias:
     *      La primera, medida en milímetros.
     *      La segunda, medida en centímetros.
     *      La última, medida en metros.
     * Diseña un programa que muestre la suma de las tres longitudes introducidas (medida en centímetros).
     */
    public static void main(String[] args) {

        //Declaramos las variables
        double milimetros; //Variable donde vamos a guardar los milímetros introducidos por el usuario
        double centimetros; //Variable donde vamos a guardar los centímetros introducidos por el usuario
        double metros; //Variable donde vamos a guardar los metros introducidos por el usuario
        double totalCentimetros; //Variable donde vamos a guardar el resultado de la suma de las tres distancias en centímetros

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número de milímetros cualquiera y lo guardamos en la variable homónima
        System.out.println("Introduzca un número cualquiera de milímetros: ");
        milimetros=sc.nextDouble();

        //Le pedimos al usuario que introduzca un número de centímetros cualquiera y lo guardamos en la variable homónima
        System.out.println("Introduzca un número cualquiera de centímetros: ");
        centimetros=sc.nextDouble();

        //Le pedimos al usuario que introduzca un número de metros cualquiera y lo guardamos en la variable homónima
        System.out.println("Introduzca un número cualquiera de metros: ");
        metros=sc.nextDouble();

        /*
         * Para convertir los milimetros en centimetros los dividimos entre 10 y para convertir los metros en centimetros
         * los multiplicamos por 100. Sumamos los dos resultados más los centimetros para tener la distancia total
         */
        totalCentimetros=((milimetros/10)+centimetros+(metros*100));

        //Mostramos los resultados por pantalla
        System.out.println("El resultado de la suma de esas distancias en centimetros es: "+totalCentimetros);

        //Cerramos el scanner
        sc.close();
    }
}
