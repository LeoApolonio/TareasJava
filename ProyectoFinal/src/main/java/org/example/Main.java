package org.example;

import org.example.controlador.ControladorReloj;
import org.example.vista.Ventana;

/*
*
*       Apolonio Villagómez Leonardo
*              Proyecto final
*
*      Programación orientada a objetos
*          Jesús Hernández Cabrera
*                  2208
*
* */
public class Main
{
    public static void main(String[] args)
    {
        //Creación de la ventana e implementación del controlador
        Ventana ventana = new Ventana("Registro de relojes");
        ControladorReloj controller = new ControladorReloj(ventana);
    }
}