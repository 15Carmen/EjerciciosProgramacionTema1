package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {
    /*
     * Escribe un programa que tome como entrada un número entero e indique qué cantidad hay que sumarle para que sea
     * múltiplo de 7. Por ejemplo, a 2 hay que sumarle 5 para que sea múltiplo de 7. En el caso de 13 habría que
     * sumarle 1. Usa el operador módulo (%) para calcularlo.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num; //numero introducido por el usuario
        int resto; //número que será el resto de la division de num entre 7
        int auxiliar; //número que tendremos que sumarle al numero introducido por el usuario para que sea múltiplo de 7
        int multiplo7; // resultado de la suma de la variable auxiliar y el número, es decir, un múltiplo de 7


        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número y lo guardamos en la variable num previamente declarada
        System.out.println("Introduzca un numero: ");
        num=sc.nextInt();

        //Calculamos el resto de la división del número introducido entre 7
        resto=num%7;

        //Calculamos el numero que le tendremos que sumar al numero introducido para que nos de un multiplo de 7
        auxiliar=7-resto;

        //calculamos el multiplo de 7
        multiplo7=auxiliar+num;

        //Imprimimos por consola los resultados de las operaciones realizadas
        System.out.println("A "+num+ " hay que sumarle "+ auxiliar+ " para que nos de " + multiplo7 + ", que es multiplo de 7");

        //Cerramos el scanner
        sc.close();
    }
}
