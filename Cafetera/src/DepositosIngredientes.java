public class DepositosIngredientes
{
    private int agua;
    private int cafe;
    private int crema;
    private int vasos;

    public DepositosIngredientes() {
        this.agua = 5000;
        this.cafe = 1000;
        this.crema = 1500;
        this.vasos = 50;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getCafe() {
        return cafe;
    }

    public void setCafe(int cafe) {
        this.cafe = cafe;
    }

    public int getCrema() {
        return crema;
    }

    public void setCrema(int crema) {
        this.crema = crema;
    }

    public int getVasos() {
        return vasos;
    }

    public void setVasos(int vasos) {
        this.vasos = vasos;
    }

    @Override
    public String toString() {
        return "DepositosIngredientes{" +
                "agua=" + agua +
                ", cafe=" + cafe +
                ", crema=" + crema +
                ", vasos=" + vasos +
                '}';
    }

    public void americano()
    {
        if(agua>=180 && cafe>=15 && vasos>=1)
        {
            this.agua -= 180;
            this.cafe -= 15;
            this.vasos -= 1;
            System.out.println("\nSe ha preparado un cafe americano");
        }
        else
        {
            System.out.println("\nHacen falta ingredientes");
        }
    }

    public void expreso()
    {
        if(agua>=120 && cafe>=20 && vasos>=1)
        {
            this.agua -= 120;
            this.cafe -= 20;
            this.vasos -= 1;
            System.out.println("\nSe ha preparado un cafe expreso");
        }
        else
        {
            System.out.println("\nHacen falta ingredientes");
        }
    }

    public void capuchino()
    {
        if(agua>=100 && cafe>=14 && vasos>=1 && crema>=70)
        {
            this.agua -= 100;
            this.cafe -= 14;
            this.vasos -= 1;
            this.crema -= 70;
            System.out.println("\nSe ha preparado un cafe capuchino");
        }
        else
        {
            System.out.println("\nHacen falta ingredientes");
        }
    }

    public void cantidad()
    {
        System.out.println("\nCantidades actuales:");
        System.out.println
        (
                "Agua = " + getAgua() + " ml" +
                "\nCafe = " + getCafe() + " gr" +
                "\nCrema = " + getCrema() + " ml" +
                "\nVasos = " + getVasos()
        );
    }

    public void rellenar()
    {
        setAgua(5000);
        setCafe(1000);
        setCrema(1500);
        setVasos(50);
        System.out.println("\nSe ha rellenado la cafetera");
    }

}