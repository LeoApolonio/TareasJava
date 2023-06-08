package org.example.modelo;

import org.example.persistencia.relojDAO;

import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaRelojes implements TableModel
{
    //Numero de columnas
    public static final int COLUMNS = 6;
    //Datos de la tabla
    private ArrayList<reloj> datos;
    //Creación de objeto relojDAO
    private relojDAO redao;

    //Inicialización de la tabla
    public ModeloTablaRelojes()
    {
        redao = new relojDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaRelojes(ArrayList<reloj> datos, relojDAO rjdao)
    {
        this.datos = datos;
    }

    //Obtener número de columnas
    @Override
    public int getRowCount()
    {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMNS;
    }

    //Definición de las columnas (Nombre y tipo de dato)
    @Override
    public String getColumnName(int rowIndex)
    {
        switch (rowIndex)
        {
            case 0:
                return "Id";
            case 1:
                return "Marca";
            case 2:
                return "Modelo";
            case 3:
                return "Tipo";
            case 4:
                return "Correa";
            case 5:
                return "Url de imagen";
        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int rowIndex)
    {
        switch (rowIndex)
        {
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return String.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    //Bloquear edición en celdas
    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex)
    {
        return false;
    }

    //Obtener los valores de las columnas
    @Override
    public Object getValueAt(int rowIndex, int columnIndex)
    {
        reloj tmp = datos.get(rowIndex);
        switch (columnIndex)
        {
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getMarca();
            case 2:
                return tmp.getModelo();
            case 3:
                return tmp.getTipo();
            case 4:
                return tmp.getCorrea();
            case 5:
                return tmp.getUrlimg();
        }
        return null;
    }

    //Establecer los nuevos valores para cada variable
    @Override
    public void setValueAt(Object o, int rowIndex, int colIndex)
    {
        switch (colIndex)
        {
            case 0:
                //datos.get(rowIndex).getId();
                break;
            case 1:
                datos.get(rowIndex).setMarca((String) o);
                break;
            case 2:
                datos.get(rowIndex).setModelo((String) o);
                break;
            case 3:
                datos.get(rowIndex).setTipo((String) o);
                break;
            case 4:
                datos.get(rowIndex).setCorrea((String) o);
                break;
            case 5:
                datos.get(rowIndex).setUrlimg((String) o);
                break;
            default:
                System.out.println("No se modifica nada");


        }

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }

    //Obtener valores de la tabla
    public ArrayList<reloj> getDatos() {
        return datos;
    }

    //Establecer valores
    public void setDatos(ArrayList<reloj> datos) {
        this.datos = datos;
    }

    //Obtener el objeto relojDAO
    public relojDAO getRedao() {
        return redao;
    }

    public void setRedao(relojDAO redao) {
        this.redao = redao;
    }

    //Cargar valores guardados de la base de datos
    public void cargarDatos()
    {
        try
        {
            ArrayList<reloj> tirar = redao.obtenerTodo();
            System.out.println(tirar);
            datos = redao.obtenerTodo();
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }

    }

    //Actualizar los valores guardados de la base de datos
    public boolean actualizarReloj(reloj rlj)
    {
        boolean resultado = true;
        try
        {
            if(redao.update(rlj))
            {
                datos.add(rlj);
                resultado = true;
            }
            else
            {
                resultado = false;
            }
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    //Agregar nuevo registro en la base de datos
    public boolean agregarReloj(reloj rlj)
    {
        boolean resultado = false;
        try
        {
            if(redao.insertar(rlj))
            {
                datos.add(rlj);
                resultado = true;
            }
            else
            {
                resultado = false;
            }
        }
        catch (SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    //Eliminar algun registro de la base de datos
    public boolean eliminarReloj(String id)
    {
        boolean resultado = false;
        try
        {
           if(redao.delete(id))
           {
               resultado = true;
           }
        }
        catch(SQLException sqle)
        {
            System.out.println(sqle.getMessage());
        }
        return resultado;
    }

    //Objeto para manipular la tabla posteriormente
    public reloj getRelojAtIndex(int index)
    {
        if(index >= 0 && index < datos.size())
        {
            return datos.get(index);
        }
        else
        {
            return null;
        }
    }

}
