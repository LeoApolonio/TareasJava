public class Automovil extends Vehiculo
{
    protected String marca;
    protected int fecha;
    protected String TipoCombustible;

    public Automovil() {
    }

    public Automovil(String tipo, int ruedas, String tamano) {
        super(tipo, ruedas, tamano);
    }

    public Automovil(String tipo, int ruedas, String tamano, String marca, int fecha, String tipoCombustible) {
        super(tipo, ruedas, tamano);
        this.marca = marca;
        this.fecha = fecha;
        TipoCombustible = tipoCombustible;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    public String getTipoCombustible() {
        return TipoCombustible;
    }

    public void setTipoCombustible(String tipoCombustible) {
        TipoCombustible = tipoCombustible;
    }

    @Override
    public String toString() {
        return "Automovil{" +
                "marca='" + marca + '\'' +
                ", fecha=" + fecha +
                ", TipoCombustible='" + TipoCombustible + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", Ruedas=" + Ruedas +
                ", Tamano='" + Tamano + '\'' +
                '}';
    }

    public void recargarCom()
    {
        System.out.println("Se está recargando el combustible...");
    }

    public void lavar()
    {
        System.out.println("Se ha lavado el auto");
    }

}
