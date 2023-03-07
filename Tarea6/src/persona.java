public class persona
{
    private int edad;
    private String nombre;
    private double estatura;
    private double peso;
    private String genero;

    public persona(){}

    public persona(int edad, String nombre, double estatura, double peso, String genero)
    {
        this.edad = edad;
        this.nombre = nombre;
        this.estatura = estatura;
        this.peso = peso;
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    @Override
    public String toString()
    {
        return "\nNombre: " + nombre + "\nEdad: " + edad + "\nEstatura: " + estatura + "m\nPeso: " + peso + "kg\nGenero: " + genero;
    }
}