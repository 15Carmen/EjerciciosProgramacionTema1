package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {
    /*
     * Una empresa que gestiona un parque acuático te solicita una aplicación que les ayude a calcular el importe que
     * hay que cobrar en la taquilla por la compra de una serie de entradas (cuyo número será introducido por el
     * usuario). Existen dos tipos de entradas: infantiles, que cuestan 15,50 €; y de adultos, que cuestan 20 €. En el
     * caso de que el importe total sea igual o superior a 100 €, se aplicará automáticamente un bono descuento del 5%.
     */
    public static void main(String[] args) {

        //Declaramos las variables
        int numEntradaInf; //Variable donde guardamos el número de entradas infantiles introducidas por el usuario
        int numEntradasAdul; //Variable donde guardamos el número de entradas de adultos introducidas por el usuario
        double precioInf; //Variable donde guardaremos el resultado del cálculo del precio de la entrada infantil según la cantidad introducida
        double precioAdul; //Variable donde guardaremos el resultado del cálculo del precio de la entrada adulta según la cantidad introducida
        double precioTotal; //Variable que será el resultado del precio de ambas entradas y al cual le tendremos que aplicar un descuento si es >100

        //Declaramos las constantes
        final double ENTRADA_INFANTIL=15.50; //Lo que cuesta la entrada de niño
        final double ENTRADA_ADULTO=20; //Lo que cuesta la entrada de adulto
        final double BONO_DESCUENTO=0.05; //Descuento del 5%

        //Declaramos el scanner para poder leer por consola
        Scanner sc = new Scanner(System.in);

        //Le pedimos al usuario que introduzca el número de entradas infantiles y adultas que desee y lo guardamos en las
        // variables numEntradaInf y numEntradaAdul respectivamente
        System.out.println("Introduzca el numero de entradas infantiles que quiere");
        numEntradaInf=sc.nextInt();
        System.out.println("Introduzca el numero de entradas de adulto que quiere");
        numEntradasAdul= sc.nextInt();

        /*
         * Calculamos el precio de las entradas multiplicando su precio por la cantidad de entradas introducidas.
         * Para calcular el total del precio sumamos los dos resultados
         */
        precioInf=ENTRADA_INFANTIL*numEntradaInf;
        precioAdul=ENTRADA_ADULTO*numEntradasAdul;
        precioTotal=precioInf+precioAdul;

        /*
         * Si el precio total es mayor o igual a 100 devolvemos el precio con el descuento aplicado, si no, devolvemos
         * el precio total
         */
        precioTotal= precioTotal>=100 ? precioTotal-(precioTotal*BONO_DESCUENTO) : precioTotal;


        //Imprimimos por pantalla el resultado
        System.out.println("Debe pagar: "+precioTotal+" euros");

        //Cerramos el scanner
        sc.close();



    }
}
