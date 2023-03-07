public class monitor
{
    private double pulgadas;
    private String marca;
    private String modelo;
    private String tipo;
    private double precio;

    public monitor(){}

    public monitor(double pulgadas, String marca, String modelo, String tipo, double precio)
    {
        this.pulgadas = pulgadas;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.precio = precio;
    }

    public double getPulgadas() {
        return pulgadas;
    }

    public void setPulgadas(double pulgadas) {
        this.pulgadas = pulgadas;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString()
    {
        return "\nMarca: " + marca + "\nPulgadas: " + pulgadas + "\nModelo: " + modelo + "\nTipo: " + tipo + "\nPrecio: " + precio;
    }
}
