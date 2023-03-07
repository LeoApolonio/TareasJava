public class gato
{
    private String nombre;
    private String raza;
    private String sexo;

    public gato(){}

    public gato(String nombre, String raza, String sexo) {
        this.nombre = nombre;
        this.raza = raza;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString()
    {
        return "\nNombre: " + nombre + "\nRaza: " + raza + "\nSexo: " + sexo;
    }
}
