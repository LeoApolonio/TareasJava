/*
Apolonio Villagómez Leonardo
ICO
2208
*/
import java.awt.*;
public class AutomovilDriver
{
    public static void main(String[] args)
    {
        Automovil auto1 = new Automovil();
        Automovil auto2 = new Automovil();

        System.out.println("El auto es: ");

        Automovil auto3 = new Automovil("vw","Polo",(byte)15, Color.BLUE);
        Automovil auto4 = new Automovil();

        auto1.setMarca("Honda");
        System.out.println("La marca es: " + auto1.getMarca());

        auto1.setMarca("Una marca que no existe...");
        auto1.setMarca("tEsLA");
        System.out.println(auto3);

        System.out.println(auto1.equals(auto2));

        System.out.println("Fin");
    }
}
