package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {
    /*
     * Diseña una aplicación que solicite al usuario que introduzca una cantidad de segundos. La aplicación
     * debe mostrar cuántas horas, minutos y segundos hay en el número de segundos introducidos por el usuario.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int segundosUsuario; //número de segundos introducido por el usuario
        int horas; //variable donde vamos a guardar las horas equivalentes a los segundos introducidos
        int minutos; //variable donde vamos a guardar los minutos equivalentes a los segundos introducidos
        int segundos; //variable donde vamos a guardar los segundos sobrantes cuando hagamos la conversión

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número de segundos cualquiera y lo guardamos en la variable segundosUsuario
        System.out.println("Introduzca el numero de segundos que desea convertir: ");
        segundosUsuario=sc.nextInt();

        /*
         * Calculamos las horas que equivalen los segundos introducidos previamente dividiéndolos entre 3600
         * (número de segundos que equivale 1h)
         */
        horas=segundosUsuario/3600;

        /*
         * Calculamos los minutos sobrantes de las horas calculadas anteriormente; el resto de la división anterior lo
         * dividimos entre 60 (número de minutos que equivale 1 hora)
         */
        minutos=(segundosUsuario%3600)/60;

        /*
         * Calculamos los segundos sobrantes de los minutos calculados anteriormente; es el resto de la división anterior
         */
        segundos=segundosUsuario%60;

        //Imprimimos por consola los resultados
        System.out.println("La cantidad de segundos introducidos es equivalente a "+horas+" horas, "+minutos+
                " minutos y " +segundos+" segundos");

        //Cerramos el scanner
        sc.close();


    }
}
