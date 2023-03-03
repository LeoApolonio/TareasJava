/*
Apolonio Villagómez Leonardo
ICO
2208
*/
import java.util.Scanner;

public class Gato2
{
	public static void main(String args[])
	{
		Scanner teclado = new Scanner(System.in);
		String jugada = "";

		System.out.println("Por favor escriba 9 caracteres alternando entre X y O");
		System.out.println("Para los espacios vacios ocupe guiones bajos");
		jugada = teclado.nextLine();

		int c = jugada.length();

		if(c==9)
		{
			String mjugada = jugada.toUpperCase();

			String c1 = mjugada.substring(0,3);
			String c2 = mjugada.substring(3,6);
			String c3 = mjugada.substring(6);

			System.out.print("-----\n|" + c1 + "|\n|" + c2 + "|\n|" + c3 + "|\n-----");
		}

		else
		{
			System.out.println("Solo introduzca 9 caracteres");
		}
	}
}
