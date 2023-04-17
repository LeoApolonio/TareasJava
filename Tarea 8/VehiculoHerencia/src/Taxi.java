import java.util.Scanner;

public class Taxi extends Automovil
{
    protected String empresa;
    protected int capacidadPasajeros;
    private double PrecioxKM;

    public Taxi(String tipo, int ruedas, String tamano, String marca, int fecha, String tipoCombustible) {
        super(tipo, ruedas, tamano, marca, fecha, tipoCombustible);
    }

    public Taxi(String tipo, int ruedas, String tamano, String marca, int fecha, String tipoCombustible, String empresa, int capacidadPasajeros, double precioxKM) {
        super(tipo, ruedas, tamano, marca, fecha, tipoCombustible);
        this.empresa = empresa;
        this.capacidadPasajeros = capacidadPasajeros;
        PrecioxKM = precioxKM;
        ;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getCapacidadPasajeros() {
        return capacidadPasajeros;
    }

    public void setCapacidadPasajeros(int capacidadPasajeros) {
        this.capacidadPasajeros = capacidadPasajeros;
    }

    public double getPrecioxKM() {
        return PrecioxKM;
    }

    public void setPrecioxKM(double precioxKM) {
        PrecioxKM = precioxKM;
    }



    @Override
    public String toString() {
        return "Taxi{" +
                "empresa='" + empresa + '\'' +
                ", capacidadPasajeros=" + capacidadPasajeros +
                ", PrecioxKM=" + PrecioxKM +
                ", marca='" + marca + '\'' +
                ", fecha=" + fecha +
                ", TipoCombustible='" + TipoCombustible + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Ruedas=" + Ruedas +
                ", Tamano='" + Tamano + '\'' +
                '}';
    }

    public void RecogerCliente()
    {
            System.out.println("Has recogido al cliente. Ahora te dice a que lugar quiere ir y manejas hacia alla.");
            System.out.println("Han llegado al destino, es momento de cobrar.");
    }

    public void Cobrar()
    {
        double Kms = Math.random()*10+1;
        System.out.println("El total de Km recorridos fue de: " + Kms);
        double total = Kms * PrecioxKM;

        System.out.println("El precio total es de: " + total);
        System.out.println("El cliente ha pagado y se ha retirado. Nuevamente tienes lugar disponible.");
    }
}
