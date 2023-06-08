package org.example.modelo;
import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;
public class reloj
{
    //Creación de todas las variables a usar para la base de datos junto con sus respectivos constructores y Getters y Setters
    private int id;
    private String marca;
    private String modelo;
    private String tipo;
    private String correa;
    private String urlimg;

    public reloj() {
    }

    public reloj(int id, String marca, String modelo, String tipo, String correa, String urlimg) {
        this.id = id;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.correa = correa;
        this.urlimg = urlimg;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getCorrea() {
        return correa;
    }

    public void setCorrea(String correa) {
        this.correa = correa;
    }

    public String getUrlimg() {
        return urlimg;
    }

    public void setUrlimg(String urlimg) {
        this.urlimg = urlimg;
    }

    @Override
    public String toString() {
        return "reloj{" +
                "id=" + id +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", tipo='" + tipo + '\'' +
                ", correa='" + correa + '\'' +
                ", urlimg='" + urlimg + '\'' +
                '}';
    }

    public ImageIcon getImagenReloj() throws MalformedURLException
    {
        URL urlImagen = new URL(urlimg);
        return new ImageIcon(urlImagen);
    }

}
