package org.example.controlador;

import org.example.vista.Ventana;
import org.example.modelo.ModeloTablaRelojes;
import org.example.modelo.reloj;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;

public class ControladorReloj extends MouseAdapter
{
    //Implementación de la ventana y el modelo de tabla
    private Ventana view;
    private ModeloTablaRelojes modelo;

    //Inicializador
    public ControladorReloj(Ventana view)
    {
        this.view = view;
        modelo = new ModeloTablaRelojes();
        this.view.getTblReloj().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getBtnUpdate().addMouseListener(this);
        this.view.getBtnDelete().addMouseListener(this);
        this.view.getTblReloj().addMouseListener(this);
    }

    //Programación de eventos para cada botón
    @Override
    public void mouseClicked(MouseEvent e) {

        //Mostrar imagen al presionar un registro de la tabla
        if (e.getSource() == this.view.getTblReloj())
        {
            int index = this.view.getTblReloj().getSelectedRow();
            reloj tmp = modelo.getRelojAtIndex(index);
            try
            {
                ImageIcon imagenReloj = tmp.getImagenReloj();
                if(imagenReloj != null)
                {
                    this.view.getLblImagenReloj().setIcon(imagenReloj);
                }
                else
                {
                    this.view.getLblImagenReloj().setIcon(null);
                    System.out.println("No se pudo obtener la imagen");
                }
            }
            catch(MalformedURLException mfue)
            {
                System.out.println("Error al intentar obtener la imagen");
                this.view.getLblImagenReloj().setIcon(null);
            }

            this.view.getTxtNewMarca().setText(tmp.getMarca());
            this.view.getTxtNewModelo().setText(tmp.getModelo());
            this.view.getTxtNewTipo().setText(tmp.getTipo());
            this.view.getTxtNewCorrea().setText(tmp.getCorrea());
            this.view.getTxtNewUrlImg().setText(tmp.getUrlimg());

        }

        //Acción para el botón "Cargar"
        if (e.getSource() == this.view.getBtnCargar())
        {
            modelo.cargarDatos();
            this.view.getTblReloj().setModel(modelo);
            this.view.getTblReloj().updateUI();
        }

        //Acción para el botón "Agregar"
        if (e.getSource() == this.view.getBtnAgregar())
        {
            try
            {
                String marca = validarMarca(this.view.getTxtMarca().getText());
                String model = validarModelo(this.view.getTxtModelo().getText());
                String tipo = validarTipo(this.view.getTxtTipo().getText());
                String correa = validarCorrea(this.view.getTxtCorrea().getText());
                String urlimg = validarUrl(this.view.getTxtUrlImg().getText());

                reloj rej = new reloj();
                rej.setId(0);
                rej.setMarca(this.view.getTxtMarca().getText());
                rej.setModelo(this.view.getTxtModelo().getText());
                rej.setTipo(this.view.getTxtTipo().getText());
                rej.setCorrea(this.view.getTxtCorrea().getText());
                rej.setUrlimg(this.view.getTxtUrlImg().getText());

                if (modelo.agregarReloj(rej)) {
                    JOptionPane.showMessageDialog(view, "Se agrego correctamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                    this.view.getTblReloj().updateUI();
                } else {
                    JOptionPane.showMessageDialog(view, "No se pudo agregar a la base de datos", "Aviso", JOptionPane.ERROR_MESSAGE);
                }

                this.view.limpiar();
            }
            catch (IllegalArgumentException ex)
            {
                JOptionPane.showMessageDialog(view,ex.getMessage(),"Error",JOptionPane.ERROR_MESSAGE);
            }
        }

        //Acción para el boton "Borrar"
        if (e.getSource() == this.view.getBtnDelete())
        {
            ModeloTablaRelojes temp = new ModeloTablaRelojes();
            int index = this.view.getTblReloj().getSelectedRow();
            reloj tmp = modelo.getRelojAtIndex(index);

            if(temp.eliminarReloj(Integer.toString(tmp.getId())))
            {
                JOptionPane.showMessageDialog(view,"Se ha eliminado satisfactoriamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.view.getTblReloj().updateUI();
                this.view.limpiar();
            }
            else
            {
                JOptionPane.showMessageDialog(view,"No se ha podido eliminar los datos","Error", JOptionPane.ERROR_MESSAGE);
            }
        }

        //Acción para el boton "Actualizar"
        if(e.getSource() == this.view.getBtnUpdate())
        {
            int rowIndex = this.view.getTblReloj().getSelectedRow();
            reloj tmp = modelo.getRelojAtIndex(rowIndex);
            reloj rej = new reloj();
            //rej.setId(0);
            rej.setMarca(this.view.getTxtNewMarca().getText());
            rej.setModelo(this.view.getTxtNewModelo().getText());
            rej.setTipo(this.view.getTxtNewTipo().getText());
            rej.setCorrea(this.view.getTxtNewCorrea().getText());
            rej.setUrlimg(this.view.getTxtNewUrlImg().getText());
            rej.setId(tmp.getId());
            if(modelo.actualizarReloj(rej))
            {
                JOptionPane.showMessageDialog(view,"Se agrego correctamente","Aviso", JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.view.getTblReloj().setModel(modelo);
                this.view.getTblReloj().updateUI();
            }
            else
            {
                JOptionPane.showMessageDialog(view,"No se pudo agregar a la base de datos", "Aviso", JOptionPane.ERROR_MESSAGE);
            }
            this.view.getTblReloj().updateUI();
        }
    }

    //Validación de los datos escritos del usuario mediante ciertos criterios
    //En general solo son 3 para las columnas de la 2 a la 5
    //  1,- No debe estar vacía     2,- Debe comenzar con una letra     3,- Debe tener al menos 3 caracteres
    //Para la sexta únicamente pide:
    //  1,- No debe estar vacia     2,- La URL debe ser válida

    private String validarMarca(String marca)
    {
        if (marca.trim().isEmpty()) {
            throw new IllegalArgumentException("Coloque una marca");
        }
        if (!Character.isLetter(marca.charAt(0))) {
            throw new IllegalArgumentException("Debe comenzar con una letra");
        }
        if (marca.length() < 3) {
            throw new IllegalArgumentException("Escriba al menos 3 caracteres");
        }
        return marca;
    }

    private String validarModelo(String modelo)
    {

        if (modelo.trim().isEmpty()) {
            throw new IllegalArgumentException("Coloque el modelo");
        }
        if (!Character.isLetter(modelo.charAt(0))) {
            throw new IllegalArgumentException("Debe comenzar con una letra");
        }
        if (modelo.length() < 3) {
            throw new IllegalArgumentException("Escriba al menos 3 caracteres");
        }
        return modelo;
    }

    private String validarTipo(String tipo)
    {

        if (tipo.trim().isEmpty()) {
            throw new IllegalArgumentException("Coloque el tipo de mecanismo");
        }
        if (!Character.isLetter(tipo.charAt(0))) {
            throw new IllegalArgumentException("Debe comenzar con una letra");
        }
        if (tipo.length() < 3) {
            throw new IllegalArgumentException("Escriba al menos 3 caracteres");
        }
        return tipo;
    }

    private String validarCorrea(String correa)
    {
        if (correa.trim().isEmpty()) {
            throw new IllegalArgumentException("Coloque el tipo de correa");
        }
        if (!Character.isLetter(correa.charAt(0))) {
            throw new IllegalArgumentException("Debe comenzar con una letra");
        }
        if (correa.length() < 3) {
            throw new IllegalArgumentException("Escriba al menos 3 caracteres");
        }
        return correa;
    }

    private String validarUrl(String url)
    {
        if (url.trim().isEmpty()) {
            throw new IllegalArgumentException("Coloque la URL de la imagen");
        }
        if (!url.startsWith("https://")) {
            throw new IllegalArgumentException("Formato no valido");
        }
        return url;
    }

}
