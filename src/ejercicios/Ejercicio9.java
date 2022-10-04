package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {
    /*
     * Pide dos números al usuario. Deberá mostrarse true si ambos números son iguales y false en caso contrario.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int num1; //Variable donde guardaremos el primer número introducido por el usuario
        int num2; //Variable donde guardaremos el segundo número introducido por el usuario
        boolean iguales; //Variable que indicará si los números son iguales o no

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca un número cualquiera y lo guardamos en la variable num1
        System.out.println("Introduzca un numero cualquiera: ");
        num1=sc.nextInt();

        //Le pedimos al usuario que introduzca otro número cualquiera y lo guardamos en la variable num2
        System.out.println("Introduzca otro numero: ");
        num2= sc.nextInt();

        //Para saber si los números son iguales indicamos a la variable booleana que ambos números introducidos lo son
        // Así, si los números son iguales se imprimirá un true y si no un false
        iguales= num1==num2;

        //Imprimimos por consola el resultado
        System.out.println(iguales);

        //Cerramos el scanner
        sc.close();
    }
}
