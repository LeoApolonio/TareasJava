/*
Apolonio Villagómez Leonardo
ICO
2208
*/

import java.awt.*;
import java.util.ArrayList;

public class Automovil {
    public static void main(String[] args){}
    public String marca;
    public String submarca;
    public Byte modelo;
    private Color color;

    public Automovil(){}

    public Automovil(String marca, String submarca, Byte modelo, Color color)
    {
        this.marca = marca;
        this.submarca = submarca;
        this.modelo = modelo;
        this.color = color;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca) {
        ArrayList<String> marcas = new ArrayList<>();
        marcas.add("VW");
        marcas.add("HONDA");
        marcas.add("NISSAN");
        marcas.add("MCLAREN");
        marcas.add("FERRARI");
        marcas.add("ASTON MARTIN");
        marcas.add("RENAULT");
        marcas.add("TESLA");
        marcas.add("MERCEDES");
        marcas.add("ALFA ROMED");

        if (marcas.contains(marca.toUpperCase()))
        {
            this.marca = marca;
        }
        else
        {
            System.out.println("Esta marca no existe");
        }
    }

    public String getSubmarca()
    {
        return submarca;
    }

    public void setSubmarca(String submarca)
    {
        this.submarca = submarca;
    }

    public Byte getModelo()
    {
        return modelo;
    }

    public void setModelo(Byte modelo)
    {
        this.modelo = modelo;
    }

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    @Override
    public String toString()
    {
        return "\nMarca: " + marca + "\nSubmarca: " + submarca + "\nModelo: " + modelo + "\nColor: " + color;
    }

}