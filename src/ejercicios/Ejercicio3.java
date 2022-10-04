package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
    /*
     * Modifica el ejercicio anterior para que, indicando dos números, por ejemplo, num1 y num2, diga qué cantidad
     * hay que sumarle a num1 para que sea múltiplo de num2.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num1; //número introducido por el usuario
        int num2; //número introducido por el usuario que tendremos que sumarle a num1 para que sea múltiplo de num2
        int resto; //número que será el resto de la division de num1 entre num2
        int multiplo; // resultado de la suma de la variable num2 y num1, es decir, un múltiplo de num2


        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número y lo guardamos en la variable num1 previamente declarada
        System.out.println("Introduzca un numero: ");
        num1=sc.nextInt();

        //Le pedimos al usuario que introduzca un número y lo guardamos en la variable num2 previamente declarada
        System.out.println("Introduzca otro numero: ");
        num2=sc.nextInt();

        //Calculamos el resto de la división del número introducido entre 7
        resto=num1%7;

        //Calculamos el numero que le tendremos que sumar al numero introducido para que nos de un múltiplo de 7
        num2=num2-resto;

        //calculamos el multiplo de 7
        multiplo=num2+num1;

        //Imprimimos por consola los resultados de las operaciones realizadas
        System.out.println("A "+num1+ " hay que sumarle "+ num2+ " para que nos de " + multiplo + ", que es multiplo del segundo número introducido");

        //Cerramos el scanner
        sc.close();
    }
}

