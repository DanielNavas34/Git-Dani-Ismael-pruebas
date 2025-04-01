

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author anita
 */
public class ArrayList1y2 {

    public static void main(String[] args) {

        /*1. Diseña un programa en Java que crea un arraylist, que contiene los nombres de 4
personas. Mostrar los datos del array al completo.*/
        ArrayList<String> nombres = new ArrayList<>();

        nombres.add("Daniel");
        nombres.add("Ana Belen");
        nombres.add("Jose");
        nombres.add("Fran");

        System.out.println("Los nombres son" + nombres);

        /*2. Diseña un programa que pide por pantalla 5 datos de tipo int, y se almacenan en un
arraylist. Posteriormente se pregunta si se desean imprimir los datos, en caso
afirmativo mostrar los datos por pantalla.*/
        ArrayList<Integer> numeros = new ArrayList<>();

        System.out.println("Introduce 5 numeros");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.print("numero" + (i + 1) + ":");
            int numero = sc.nextInt();
            numeros.add(numero);
        }

        System.out.print("Desea imprimir los numeros s/n");
        String respuesta = sc.next();

        if (respuesta.equalsIgnoreCase("s")) {
            System.out.println("numeros introducidos");
            for (int numero : numeros) {
                System.out.println(numeros);
            }
        }else{
            System.out.println("No se imprimen");
        }

    }
}
