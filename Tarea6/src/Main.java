import java.awt.*;
import java.lang.String;
public class Main
{
    public static void main(String[] args)
    {
        Automovil auto1 = new Automovil("vw","Polo",(byte)15, Color.BLUE);
        System.out.println(auto1);

        persona p1 = new persona(18,"Leonardo",1.70,70,"Masculino");
        System.out.println(p1);

        persona p2 = new persona(23,"David",1.80,80,"Masculino");
        System.out.println(p2);

        monitor m1 = new monitor(24,"Samsung","LS24R350FZLXZX","Plano",3150);
        System.out.println(m1);

        monitor m2 = new monitor(19,"Acer","K202HQL","Plano",1924);
        System.out.println(m2);

        gato g1 = new gato("Teddy","Mestizo","Macho");
        System.out.println(g1);

        gato g2 = new gato("Gorda","Mestiza","Hembra");
        System.out.println(g2);
    }
}