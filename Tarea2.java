/*
Apolonio Villagómez Leonardo
ICO
2208
*/

import java.util.Scanner;

public class Tarea2
{
	public static void main(String[] args)
	{
		Scanner teclado = new Scanner(System.in);
		String datos;

		System.out.println("");
		System.out.println("Por favor escriba su primer nombre, su profesion y su nacionalidad.");
		datos = teclado.nextLine();

		String mdatos = datos.toUpperCase();

		String separacion[]= mdatos.split(" ");

		String nom = separacion[0];
		String prof = separacion[1];
		String naci = separacion[2];

		System.out.println("");
		System.out.println("Nombre: " + nom + ".");
		System.out.println("Profesion: "+ prof + ".");
		System.out.println("Nacionalidad: "+ naci +".");
	}
}
