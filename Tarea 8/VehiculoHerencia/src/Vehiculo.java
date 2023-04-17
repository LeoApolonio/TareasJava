public class Vehiculo
{
    protected String Tipo;
    protected int Ruedas;
    protected String Tamano;

    public Vehiculo(){}

    public Vehiculo(String tipo, int ruedas, String tamano) {
        Tipo = tipo;
        Ruedas = ruedas;
        Tamano = tamano;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public int getRuedas() {
        return Ruedas;
    }

    public void setRuedas(int ruedas) {
        Ruedas = ruedas;
    }

    public String getTamano() {
        return Tamano;
    }

    public void setTamano(String tamano) {
        Tamano = tamano;
    }

    @Override
    public String toString() {
        return "Vehiculo{" +
                "Tipo='" + Tipo + '\'' +
                ", Ruedas=" + Ruedas +
                ", Tamano='" + Tamano + '\'' +
                '}';
    }

    public void encender()
    {
        System.out.println("El vehiculo se ha encendido");
    }

    public void apagar()
    {
        System.out.println("El vehiculo se ha apagado");
    }

}
