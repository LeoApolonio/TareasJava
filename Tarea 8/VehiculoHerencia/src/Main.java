/*
* Apolonio Villagómez Leonardo
* 2208 POO
*
* */

public class Main
{
    public static void main(String[] args)
    {
        Taxi taxi1 = new Taxi
                ("Terrestre",
                4,
                "Mediano",
                "Ford",
                2004,
                "Gasolina",
                "Los Canes",
                4,
                15.5);
        Taxi taxi2 = new Taxi(
                "Terrestre",
                4,
                "Pequeño",
                "Nissan",
                2006,
                "Electrico",
                "Si",
                3,
                20
        );
        taxi1.RecogerCliente();
        taxi1.Cobrar();
        System.out.println(taxi1);
        System.out.println(taxi2);
    }
}