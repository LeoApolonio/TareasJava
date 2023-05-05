/*
Apolonio Villagómez Leonardo
2208
Matutino
*/

package org.example;

import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        //int a = 10;
        //int b = scanner.nextInt();
        //int b = Integer.parseInt(scanner.nextLine());
        try
        {
            int a = 10;
            int b = Integer.parseInt(scanner.nextLine());
            System.out.println("División: " + (a/b));
        }
        catch (ArithmeticException e)
        {
            System.out.println("No se puede dividir entre 0");;
        }
        catch (NumberFormatException nfe)
        {
            System.out.println("Formato invalido");
        }
        finally
        {
            System.out.println("Siempre se ejecuta");
        }

        System.out.println("Fin del programa");

    }
}