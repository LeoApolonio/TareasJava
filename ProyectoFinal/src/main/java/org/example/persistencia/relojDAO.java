package org.example.persistencia;

import org.example.modelo.reloj;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class relojDAO implements InterfazDAO
{

    //Acciones que se pueden hacer desde SQLite
    @Override
    public boolean insertar(Object obj) throws SQLException
    {
        String sqlInsert = "INSERT INTO relojes(marca, modelo, tipo, correa, urlimg) VALUES(?,?,?,?,?)";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("relojesDB.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1,((reloj)obj).getMarca());
        pstm.setString(2,((reloj)obj).getModelo());
        pstm.setString(3,((reloj)obj).getTipo());
        pstm.setString(4,((reloj)obj).getCorrea());
        pstm.setString(5,((reloj)obj).getUrlimg());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException
    {
        String sqlUpdate = "UPDATE relojes SET marca = ?, modelo = ?, tipo = ?, correa = ?, urlimg = ? WHERE id = ? ;";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("relojesDB.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1,((reloj)obj).getMarca());
        pstm.setString(2,((reloj)obj).getModelo());
        pstm.setString(3,((reloj)obj).getTipo());
        pstm.setString(4,((reloj)obj).getCorrea());
        pstm.setString(5,((reloj)obj).getUrlimg());
        pstm.setInt(6, ((reloj)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(String id) throws SQLException
    {
        String sqlDelete = "DELETE FROM relojes WHERE id = ?";
        int rowCount = 0;
        PreparedStatement pstm = ConexionSingleton.getInstance("relojesDB.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, Integer.parseInt(id));
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException
    {
        String sql = "SELECT * FROM relojes";
        ArrayList<reloj> resultado = new ArrayList<>();
        Statement stm = ConexionSingleton.getInstance("relojesDB.db").getConnection().createStatement();
        ResultSet rst = stm.executeQuery(sql);
        while(rst.next())
        {
            resultado.add(new reloj(rst.getInt(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6)));
        }
        return resultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException
    {
        String sql = "SELECT * FROM relojes WHERE id = ? ;";
        reloj rel = null;

        PreparedStatement pstm = ConexionSingleton.getInstance("relojesDB.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if(rst.next())
        {
            rel = new reloj(
                    rst.getInt("id"),
                    rst.getString("marca"),
                    rst.getString("modelo"),
                    rst.getString("tipo"),
                    rst.getString("correa"),
                    rst.getString("urlimg"));
            return rel;
        }
        return null;
    }
}
